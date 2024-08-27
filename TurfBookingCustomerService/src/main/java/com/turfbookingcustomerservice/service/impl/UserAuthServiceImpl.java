package com.turfbookingcustomerservice.service.impl;

import com.turfbookingcustomerservice.auth.model.UserAuthInfo;
import com.turfbookingcustomerservice.auth.token.JwtTokenProvider;
import com.turfbookingcustomerservice.dto.ResponseDTO;
import com.turfbookingcustomerservice.dto.UserLoginDetails;
import com.turfbookingcustomerservice.exception.ClientException;
import com.turfbookingcustomerservice.model.UserDetailsInfo;
import com.turfbookingcustomerservice.repository.service.UserRepoService;
import com.turfbookingcustomerservice.service.UserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.turfbookingcustomerservice.constants.ResponseMessages.LOGIN_FAIL;
import static com.turfbookingcustomerservice.constants.ResponseMessages.LOGIN_SUCCESS;

@Service
public class UserAuthServiceImpl implements UserAuthService {

    @Autowired
    private UserRepoService userRepoService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    /**
     * @param email User email Id
     * @return User details for Authentication
     */
    @Override
    public UserAuthInfo loadUserByUsername(final String email) throws UsernameNotFoundException {

        Optional<UserDetailsInfo> userDetails = userRepoService.getUserDetails(email);
        return userDetails.map(UserAuthInfo::new)
                .orElseThrow(() -> new ClientException(String.format("User not found for this email: %s", email)));
    }

    /**
     * @param userLoginDetails User login details
     * @return
     */
    @Override
    public ResponseDTO loginUser(final UserLoginDetails userLoginDetails) {
        Optional<UserDetailsInfo> userDetails = userRepoService.getUserDetails(userLoginDetails.getEmail());

        if (userDetails.isEmpty() ||
                !passwordEncoder.matches(userLoginDetails.getPassword(), userDetails.get().getPassword())) {
            return ResponseDTO.builder()
                    .message(LOGIN_FAIL)
                    .data("").build();
        } else {
            final String accessToken = jwtTokenProvider.generateAccessToken(userDetails.get().getEmail());
            return ResponseDTO.builder()
                    .message(LOGIN_SUCCESS)
                    .data(accessToken)
                    .build();
        }
    }
}