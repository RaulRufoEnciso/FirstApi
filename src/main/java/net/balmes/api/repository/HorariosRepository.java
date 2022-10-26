package net.balmes.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.balmes.api.entity.*;

public interface HorariosRepository extends CrudRepository<Horarios, Long>{

	public List<Horarios> findAll();
}
