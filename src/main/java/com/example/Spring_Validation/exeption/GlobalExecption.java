package com.example.Spring_Validation.exeption;

import java.util.*;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExecption {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String,String> getError(MethodArgumentNotValidException ex){
		Map<String,String> map=new HashMap<>();
		ex.getBindingResult().getFieldErrors().forEach(error->{
			map.put(error.getField(), error.getDefaultMessage());
		});
		return map;
	}
}
