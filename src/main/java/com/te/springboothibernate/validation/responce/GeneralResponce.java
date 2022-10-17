package com.te.springboothibernate.validation.responce;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GeneralResponce {
	private String message;
	private String error;
	private Object data;

}
