package com.example.spring5webapp.repository;

import com.example.spring5webapp.model.Movie;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Kevin Neag
 */
/**
 * Movie repository interface  delegated to the movie object for the purpose of easily interchanging storage type
 */
public interface MovieRepo extends CrudRepository<Movie, Long>{
}
