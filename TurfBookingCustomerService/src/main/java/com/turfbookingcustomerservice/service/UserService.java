package com.turfbookingcustomerservice.service;

import com.turfbookingcustomerservice.dto.UserDetailsRequest;

public interface UserService {

    void addUser(final UserDetailsRequest userDetailsRequest);

    UserDetailsRequest getUserDetails(final String email);
}
