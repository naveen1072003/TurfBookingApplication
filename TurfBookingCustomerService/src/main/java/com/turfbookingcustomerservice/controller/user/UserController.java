package com.turfbookingcustomerservice.controller.user;

import com.turfbookingcustomerservice.api.user.User;
import com.turfbookingcustomerservice.dto.UserDetailsRequest;
import com.turfbookingcustomerservice.dto.UserLoginDetails;
import com.turfbookingcustomerservice.service.UserAuthService;
import com.turfbookingcustomerservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class UserController implements User {

    @Autowired
    private UserService userService;

    @Autowired
    private UserAuthService userAuthService;

    /**
     * @param userDetailsRequest details of the user to be onboarded.
     * @return Success - 200 status.
     */
    @Override
    public ResponseEntity<?> onBoardUser(final UserDetailsRequest userDetailsRequest) {
        userService.addUser(userDetailsRequest);
        return ResponseEntity.ok().build();
    }

    /**
     * @param email Email of the user.
     * @return Specific user details for the email.
     */
    @Override
    public ResponseEntity<?> getUser(final String email) {
        return ResponseEntity.ok(userService.getUserDetails(email));
    }

    /**
     * @param loginDetails Login credentials of the user.
     * @return Returns the access token if user credentials is matched.
     */
    @Override
    public ResponseEntity<?> loginUser(final UserLoginDetails loginDetails) {
        return ResponseEntity.ok(userAuthService.loginUser(loginDetails));
    }
}
