package com.turfbookingcustomerservice.dto;


import jakarta.persistence.EntityListeners;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Jacksonized
@EntityListeners(AuditingEntityListener.class)
public class UserDetailsRequest {

    @NotEmpty(message = "First name cannot be null or empty")
    private String firstName;

    private String lastName;

    @NotEmpty(message = "Email cannot be null or empty")
    private String email;

    @NotEmpty(message = "Phone number cannot be null or empty")
    @Size(min = 10, max = 10, message = "Phone number should be at length {10}")
    private String phoneNumber;

    @NotEmpty(message = "Password cannot be null or empty")
    @Size(min = 8, max = 100, message = "Password should atleast 8 characters")
    private String password;
}
