package com.project.dojoandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.project.dojoandninjas.models.Dojo;
import com.project.dojoandninjas.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	
	List<Ninja> findAll();
	List<Ninja> findAllByDojo(Dojo dojo);
}
