package com.RonitCodes.MovieApi.auth.Repositories;

import com.RonitCodes.MovieApi.auth.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String username);


}
