package com.turfbookingcustomerservice.service;

import com.turfbookingcustomerservice.dto.ResponseDTO;
import com.turfbookingcustomerservice.dto.UserLoginDetails;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserAuthService extends UserDetailsService {

    UserDetails loadUserByUsername(String username);

    ResponseDTO loginUser(final UserLoginDetails userLoginDetails);
}
