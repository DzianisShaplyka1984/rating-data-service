package my.movie.ratingdataservice.model.entity;

import java.util.*;

public class UserRating {
    private List<Rating> ratings;

    public UserRating() {
    }

    public UserRating(final List<Rating> ratings) {
        this.ratings = ratings;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(final List<Rating> ratings) {
        this.ratings = ratings;
    }
}
