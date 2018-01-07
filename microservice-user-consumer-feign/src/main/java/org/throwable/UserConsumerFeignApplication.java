package org.throwable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/1/7 22:14
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class UserConsumerFeignApplication {

	public static void main(String[] args){
		SpringApplication.run(UserConsumerFeignApplication.class, args);
	}
}
