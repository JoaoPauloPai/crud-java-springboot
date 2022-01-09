package br.com.crud.jumbo.crud_java_sprinboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.crud.jumbo.crud_java_sprinboot.model.PessoaFisica;

/**
 * @author João Paulo
 *
 *         23 de dez. de 2021 16:20:46
 */
@Repository
public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Long> {

	@Query(value = "select u from PessoaFisica u where upper(trim(u.nome)) like %?1%")
	List<PessoaFisica> buscaPessoaPorNome(String nome);

	@Query(value = "select u from PessoaFisica u where upper(trim(u.sexo)) like %?1%")
	List<PessoaFisica> buscaPessoaPorSexo(String sexo);
}
