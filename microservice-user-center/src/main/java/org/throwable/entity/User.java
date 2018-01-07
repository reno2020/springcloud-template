package org.throwable.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/1/4 23:18
 */
@Data
@Document(collection = "users")
public class User {

	@Id
	private String id;

	private String name;

	private Integer age;

	private Date birth;

	private String email;

	private String qq;
}
