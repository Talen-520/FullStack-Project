package tao.project.movies;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.bson.types.ObjectId;

import java.util.Optional;

//data access layer, get data
@Repository
public interface MovieRepository extends MongoRepository<Movie,ObjectId>{
    Optional<Movie>findMovieByImdbId(String imdbId);
}
