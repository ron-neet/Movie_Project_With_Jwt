package com.RonitCodes.MovieApi.DTO;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

import java.util.Set;

@Data // it handles getter, setter, toString, hashcode, Equals
@NoArgsConstructor
@AllArgsConstructor
public class MovieDTO {

        private Integer movieId;

        @NotBlank(message = "Please provide the title.")
        private String title;

        @NotBlank(message = "Please provide director name.")
        private String director;

        @NotBlank(message = "Please provide the studio name.")
        private String studio;

        private Set<String> movieCast;

        private Integer releaseYear;

        @NotBlank(message = "Please provide poster.")
        private String poster;

        // Important Aspect
        @NotBlank(message = "Please provide poster's URL.")
        private String posterURL;
    }


