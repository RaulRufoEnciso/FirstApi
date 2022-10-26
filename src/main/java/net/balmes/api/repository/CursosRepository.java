package net.balmes.api.repository;

import org.springframework.data.repository.CrudRepository;

public interface CursosRepository extends CrudRepository<net.balmes.api.objects.Cursos, Long> {

	public Iterable<net.balmes.api.objects.Cursos> findAll();

	void delete(net.balmes.api.objects.Cursos cursos);
}
