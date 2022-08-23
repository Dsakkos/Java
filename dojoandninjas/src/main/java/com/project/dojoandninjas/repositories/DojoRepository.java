package com.project.dojoandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.project.dojoandninjas.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long> {

	List<Dojo> findAll();
}
