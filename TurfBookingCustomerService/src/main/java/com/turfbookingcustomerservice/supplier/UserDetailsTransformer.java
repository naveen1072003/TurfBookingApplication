package com.turfbookingcustomerservice.supplier;

import com.turfbookingcustomerservice.dto.UserDetailsRequest;
import com.turfbookingcustomerservice.model.UserDetailsInfo;
import lombok.experimental.UtilityClass;

import java.util.function.Function;

@UtilityClass
public class UserDetailsTransformer {

    public static final Function<UserDetailsRequest, UserDetailsInfo> userDetailsRequestToUserDetails =
            (userDetail) -> UserDetailsInfo.builder()
                    .firstName(userDetail.getFirstName())
                    .lastName(userDetail.getLastName())
                    .email(userDetail.getEmail())
                    .password(userDetail.getPassword())
                    .phoneNumber(userDetail.getPhoneNumber())
                    .build();

    public static final Function<UserDetailsInfo, UserDetailsRequest> userDetailsToUserDetailsRequest =
            (userDetail) -> UserDetailsRequest.builder()
                    .firstName(userDetail.getFirstName())
                    .lastName(userDetail.getLastName())
                    .email(userDetail.getEmail())
                    .build();
}
