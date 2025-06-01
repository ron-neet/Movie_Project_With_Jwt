package com.RonitCodes.MovieApi.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.IdGeneratorType;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;

    @Column(nullable = false, length = 200)
    @NotBlank(message = "Please provide the title.")
    private String title;

    @Column(nullable = false)
    @NotBlank(message = "Please provide director name.")
    private String director;

    @Column(nullable = false)
    @NotBlank(message = "Please provide the studio name.")
    private String studio;

    @Column(nullable = false)
    @ElementCollection
    @CollectionTable(name = "movie_cast")
    @NotBlank(message = "Please provide Movie Casts.")
    private Set<String> movieCast;

    @Column(nullable = false)
    @NotBlank(message = "Please provide release Year.")
    private Integer releaseYear;

    @Column(nullable = false)
    @NotBlank(message = "Please provide poster.")
    private String poster;
}
