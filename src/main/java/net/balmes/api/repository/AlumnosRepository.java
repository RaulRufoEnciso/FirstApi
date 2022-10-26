package net.balmes.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.balmes.api.entity.*;

public interface AlumnosRepository extends CrudRepository<Alumnos, Long>{

	public List<Alumnos> findAll();
}
