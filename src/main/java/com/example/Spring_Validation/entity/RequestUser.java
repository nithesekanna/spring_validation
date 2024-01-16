package com.example.Spring_Validation.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RequestUser {
	
	@NotNull(message = "name can't be empty")
	private String name;
	@Email(message = "enter a valid email")
	private String email;
	@Pattern(regexp = "\\d{10}",message = "enter a valid phone number")
	private String phoneNumber;
    @Min(value = 18, message = "Age must be at least 18 years.")
    @Max(value = 60, message = "Age must not exceed 60 years.")
    private int age;
	private String gender;
    @NotNull(message = "nationalitiy can't be empty")
	private String nationality;
}
