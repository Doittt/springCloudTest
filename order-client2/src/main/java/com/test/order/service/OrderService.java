package com.test.order.service;


import com.test.order.clients.UserClient;
import com.test.order.mapper.OrderMapper;
import com.test.order.pojo.Order;
import com.test.order.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private UserClient userClient;

    @Autowired
    private RestTemplate restTemplate;

    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);

        //2.1获取要访问的url
//        String url = "http://user-client/user/" + order.getUserId();

        //2.2利用url和RestTemplate去发起http请求，查询用户
//        User user = restTemplate.getForObject(url, User.class);

        User user = userClient.findById(order.getUserId());

        //封装user到order
        order.setUser(user);

        // 4.返回
        return order;
    }
}
