package org.throwable.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.throwable.dao.UserDao;
import org.throwable.dao.UserRepository;
import org.throwable.entity.User;
import org.throwable.model.UserCreateForm;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/1/4 23:38
 */
@RestController
public class UserController {

	@Autowired
	private UserDao userDao;

	@Autowired
	private UserRepository userRepository;

	@PostMapping(value = "/user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<User> saveUser(@RequestBody UserCreateForm form) {
		User user = new User();
		user.setName(form.getUsername());
		user.setAge(form.getAge());
		user.setEmail(form.getEmail());
		user.setQq(form.getQq());
		user.setBirth(form.getBirth());
		userDao.saveUser(user);
		user = userRepository.findByName(user.getName());
		return ResponseEntity.ok(user);
	}

	@GetMapping(value = "/user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<User> getUser(@RequestParam(value = "username") String username) {
		User user = userRepository.findByName(username);
		return ResponseEntity.ok(user);
	}
}
