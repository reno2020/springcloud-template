package org.throwable.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;
import org.throwable.entity.User;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/1/4 23:25
 */
@Repository
public class UserDao {

	@Autowired
	private MongoTemplate mongoTemplate;

	public void saveUser(User user) {
		mongoTemplate.save(user);
	}

	public void updateUser(User user) {
		Query query = new Query(Criteria.where("id").is(user.getId()));
		Update update = new Update()
				.set("name", user.getName())
				.set("age", user.getAge())
				.set("birth", user.getBirth())
				.set("email", user.getEmail())
				.set("qq", user.getQq());
		mongoTemplate.updateFirst(query, update, User.class);
	}

	public User findByName(String name) {
		Query query = new Query(Criteria.where("name").is(name));
		return mongoTemplate.findOne(query, User.class);
	}
}
