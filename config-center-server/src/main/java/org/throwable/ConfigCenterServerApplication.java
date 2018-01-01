package org.throwable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/1/1 11:56
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigCenterServerApplication.class, args);
	}
}
