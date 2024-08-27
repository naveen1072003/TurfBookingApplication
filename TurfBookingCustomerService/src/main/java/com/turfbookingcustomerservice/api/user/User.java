package com.turfbookingcustomerservice.api.user;

import com.turfbookingcustomerservice.dto.UserDetailsRequest;
import com.turfbookingcustomerservice.dto.UserLoginDetails;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
public interface User {

    /**
     * User signup
     *
     * @param userDetailsRequest User details provided by the user.
     */
    @PostMapping("/onBoard")
    ResponseEntity<?> onBoardUser(@Valid @NotNull @RequestBody final UserDetailsRequest userDetailsRequest);

    @GetMapping("/getUser")
    ResponseEntity<?> getUser(@RequestParam("email") final String email);

    /**
     * User login
     *
     * @param loginDetails Login credentials of the user
     */
    @PostMapping("/login")
    ResponseEntity<?> loginUser(@Valid @NotNull @RequestBody final UserLoginDetails loginDetails);

}
