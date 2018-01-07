package org.throwable.feign;

import org.throwable.model.UserVO;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/1/7 22:17
 */
public class UserFeignClientFallback implements UserFeignClient {

	@Override
	public UserVO getUserByName(String name) {
		return new UserVO();
	}
}
