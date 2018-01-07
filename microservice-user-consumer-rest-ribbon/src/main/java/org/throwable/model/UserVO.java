package org.throwable.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/1/7 11:40
 */
@Data
public class UserVO {

	private String name;

	private Integer age;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date birth;

	private String email;

	private String qq;
}
