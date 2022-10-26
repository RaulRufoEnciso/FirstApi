package net.balmes.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.balmes.api.entity.*;

public interface UfsRepository extends CrudRepository<Ufs, Long>{

	public List<Ufs> findAll();
}
