package org.throwable.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.throwable.feign.UserFeignClient;
import org.throwable.model.UserVO;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/1/7 22:23
 */
@RestController
public class UserFeignController {

	@Autowired
	private UserFeignClient userFeignClient;

	@GetMapping(value = "/user/get", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<UserVO> getUser(@RequestParam(value = "name") String name) {
		return ResponseEntity.ok(userFeignClient.getUserByName(name));
	}
}
