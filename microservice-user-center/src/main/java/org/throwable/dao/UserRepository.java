package org.throwable.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.throwable.entity.User;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/1/4 23:22
 */
public interface UserRepository extends MongoRepository<User, Long> {

	/**
	 * 通过名字查找用户
	 *
	 * @param name name
	 * @return user
	 */
	User findByName(String name);
}
