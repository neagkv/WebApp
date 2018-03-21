package com.example.spring5webapp.repository;

import com.example.spring5webapp.model.Movie;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Kevin Neag
 */
public interface MovieRepo extends CrudRepository<Movie, Long> {
}
