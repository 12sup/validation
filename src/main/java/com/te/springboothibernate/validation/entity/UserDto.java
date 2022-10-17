package com.te.springboothibernate.validation.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDto {
	/* this request comes from the front end */
	@NotNull(message = "user name should not be null")
	private String name;

	@Email(message = "invalid email address")
	private String email;
	@Pattern(regexp = "^\\d{10}$", message = "invalide mobile number entered")
	private String mobile;
	private String gender;
	@Min(18)
	@Max(60)
	private int age;
	/* it is a combination of notnull or notempty */
	@NotBlank
	private String nationality;
}
