package org.throwable.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.throwable.model.UserVO;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/1/7 22:16
 */
@FeignClient(value = "microservice-user-center", fallback = UserFeignClientFallback.class)
public interface UserFeignClient {

	/**
	 * 根据名称查询用户vo
	 *
	 * @param username username
	 * @return UserVO
	 */
	@GetMapping(value = "/user")
	UserVO getUserByName(@RequestParam(value = "username") String username);
}
