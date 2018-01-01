package org.throwable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/1/1 12:08
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

	@Value("${name:none}")
	private String name;

	@Override
	public void run(String... strings) throws Exception {
		System.out.println(String.format("Fetch from yml,name = %s", name));
	}
}
