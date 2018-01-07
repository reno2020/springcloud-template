package org.throwable.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/1/4 23:41
 */
@NoArgsConstructor
public class UserCreateForm {

	private String username;
	private Integer age;
	private String email;
	private String qq;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date birth;

	public String getUsername() {
		return username;
	}

	public UserCreateForm setUsername(String username) {
		this.username = username;
		return this;
	}

	public Integer getAge() {
		return age;
	}

	public UserCreateForm setAge(Integer age) {
		this.age = age;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public UserCreateForm setEmail(String email) {
		this.email = email;
		return this;
	}

	public String getQq() {
		return qq;
	}

	public UserCreateForm setQq(String qq) {
		this.qq = qq;
		return this;
	}

	public Date getBirth() {
		return birth;
	}

	public UserCreateForm setBirth(Date birth) {
		this.birth = birth;
		return this;
	}
}
