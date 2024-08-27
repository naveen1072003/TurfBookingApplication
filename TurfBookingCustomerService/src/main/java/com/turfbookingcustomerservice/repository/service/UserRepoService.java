package com.turfbookingcustomerservice.repository.service;

import com.turfbookingcustomerservice.model.UserDetailsInfo;

import java.util.Optional;

public interface UserRepoService {

    void saveUser(final UserDetailsInfo user);

    Optional<UserDetailsInfo> getUserDetails(final String email);
}
