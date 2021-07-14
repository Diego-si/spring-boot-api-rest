package br.com.alura.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Curso;

/**
 * @author Diego Almeida Da Silva
 *
 * 14 de jul. de 2021
 */
public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}