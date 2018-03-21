package com.example.spring5webapp.repository;

import com.example.spring5webapp.model.Actor;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Kevin Neag
 */
public interface ActorRepo extends CrudRepository<Actor, Long> {
}
