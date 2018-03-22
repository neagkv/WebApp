package com.example.spring5webapp.repository;

import com.example.spring5webapp.model.Actor;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Kevin Neag
 */

/**
 * Actor repository interface  delegated to the actor object for the purpose of easily interchanging storage type
 */
public interface ActorRepo extends CrudRepository<Actor,Long>{
}
