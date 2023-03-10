package eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class eurekaApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(eurekaApplication2.class,args);
    }
}
