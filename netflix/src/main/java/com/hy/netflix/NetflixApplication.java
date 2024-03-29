package com.hy.netflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**   
 * @ClassName:  NetflixApplication   
 * @Description:TODO   
 * @author: ALEX
 * @date:   Jun 14, 2019 9:22:41 AM   
 *
 */  
@SpringBootApplication
@EnableEurekaServer
public class NetflixApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixApplication.class, args);
	}

}
