package org.throwable.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.throwable.model.UserVO;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/1/7 11:39
 */
@Slf4j
@RestController
public class UserController {

	@Autowired
	private RestTemplate restTemplate;

	private static final String URL = "http://microservice-user-center/user?username=%s";

	@HystrixCommand(fallbackMethod = "fallback")
	@GetMapping(value = "/user/get")
	public String getUser(@RequestParam(value = "name") String name) {
		UserVO userVO = restTemplate.getForObject(String.format(URL, name), UserVO.class);
		log.info("User name is {},qq is {}", userVO.getName(), userVO.getQq());
		return "success";
	}

	public String fallback(String name) {
		return String.format("find user %s failed", name);
	}
}
