package com.te.springboothibernate.validation.responce;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ErrorMessage {
	private String message;
	private Boolean error;
	private Object data;
}
