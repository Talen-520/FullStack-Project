package tao.project.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    /* solution 2
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

     */
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }
    //with optional<movie> it could return null
    public Optional<Movie> singleMovie(String id){
        return movieRepository.findMovieByImdbId(id);
    }
}
