package com.RonitCodes.MovieApi.Repository;

import com.RonitCodes.MovieApi.Entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
    // No need to write code lol
}
