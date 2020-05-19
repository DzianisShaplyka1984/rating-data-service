package my.movie.ratingdataservice.controllers;

import java.util.*;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.movie.ratingdataservice.model.entity.Rating;
import my.movie.ratingdataservice.model.entity.UserRating;

@RestController
@RequestMapping("/ratingdata")
public class RatingDataController {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") final String movieId) {
      return new Rating("1", 5);
    }

    @RequestMapping("/users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") final String userId) {

        final UserRating userRating = new UserRating(Arrays.asList(new Rating("1", 1), new Rating("2", 10)));

        return userRating;
    }
}
