package org.throwale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/1/1 11:26
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistryCenterApplication {

	public static void main(String[] args){
		SpringApplication.run(RegistryCenterApplication.class, args);
	}
}
