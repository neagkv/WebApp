package com.example.spring5webapp.repository;

import com.example.spring5webapp.model.Studio;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Kevin Neag
 */
public interface StudioRepo extends CrudRepository<Studio, Long>{
}
