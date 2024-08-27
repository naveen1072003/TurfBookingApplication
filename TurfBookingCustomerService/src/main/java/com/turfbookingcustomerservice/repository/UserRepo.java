package com.turfbookingcustomerservice.repository;

import com.turfbookingcustomerservice.model.UserDetailsInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<UserDetailsInfo, String> {

    Optional<UserDetailsInfo> findUserDetailsByEmail(final String email);
}
