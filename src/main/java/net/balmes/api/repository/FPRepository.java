package net.balmes.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.balmes.api.entity.*;

public interface FPRepository extends CrudRepository<FP, Long>{

	public List<FP> findAll();
}
