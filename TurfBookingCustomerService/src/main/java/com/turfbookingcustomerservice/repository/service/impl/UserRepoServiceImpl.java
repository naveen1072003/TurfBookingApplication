package com.turfbookingcustomerservice.repository.service.impl;

import com.turfbookingcustomerservice.model.UserDetailsInfo;
import com.turfbookingcustomerservice.repository.UserRepo;
import com.turfbookingcustomerservice.repository.service.UserRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserRepoServiceImpl implements UserRepoService {

    @Autowired
    private UserRepo userRepo;

    /**
     * @param user User details to be saved.
     */
    @Override
    public void saveUser(final UserDetailsInfo user) {
        userRepo.save(user);
    }

    /**
     * @return
     */
    @Override
    public Optional<UserDetailsInfo> getUserDetails(final String email) {
        return userRepo.findUserDetailsByEmail(email);
    }
}
