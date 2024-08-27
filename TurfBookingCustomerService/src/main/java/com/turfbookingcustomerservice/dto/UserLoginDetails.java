package com.turfbookingcustomerservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This model used for user login request
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginDetails {

    /**
     * Registered user email
     */
    private String email;

    /**
     * Password
     */
    private String password;
}
