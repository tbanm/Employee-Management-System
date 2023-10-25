package com.employeemanagement.service;



import org.springframework.security.core.userdetails.UserDetailsService;

import com.employeemanagement.dto.UserRegistrationDto;
import com.employeemanagement.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);

}
