package net.balmes.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.balmes.api.entity.*;

public interface CursosRepository extends CrudRepository<Cursos, Long>{

	public List<Cursos> findAll();
}
