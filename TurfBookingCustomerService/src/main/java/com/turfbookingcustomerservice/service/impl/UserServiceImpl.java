package com.turfbookingcustomerservice.service.impl;

import com.turfbookingcustomerservice.dto.UserDetailsRequest;
import com.turfbookingcustomerservice.exception.ClientException;
import com.turfbookingcustomerservice.model.UserDetailsInfo;
import com.turfbookingcustomerservice.repository.service.UserRepoService;
import com.turfbookingcustomerservice.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

import static com.turfbookingcustomerservice.supplier.UserDetailsTransformer.userDetailsRequestToUserDetails;
import static com.turfbookingcustomerservice.supplier.UserDetailsTransformer.userDetailsToUserDetailsRequest;

@Log4j2
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepoService userRepoService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
     * @param userDetailsRequest User details to be saved.
     */
    @Override
    public void addUser(final UserDetailsRequest userDetailsRequest) {
        final UserDetailsRequest validateUser = getUserDetails(userDetailsRequest.getEmail());
        if (Objects.nonNull(validateUser)) {
            throw new ClientException("User already exists with email: " + userDetailsRequest.getEmail());
        }
        userDetailsRequest.setPassword(passwordEncoder.encode(userDetailsRequest.getPassword()));
        final UserDetailsInfo user = userDetailsRequestToUserDetails.apply(userDetailsRequest);
        userRepoService.saveUser(user);
    }

    /**
     * @param email Email of the user.
     * @return User details for the email.
     */
    @Override
    public UserDetailsRequest getUserDetails(final String email) {
        log.info("Getting User Details for email: {}", email);
        final Optional<UserDetailsInfo> userDetails = userRepoService.getUserDetails(email);

        if (userDetails.isPresent()) {
            return userDetailsToUserDetailsRequest.apply(userDetails.get());
        }
        return null;
    }
}
