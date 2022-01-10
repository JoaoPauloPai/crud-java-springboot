/**
 * 
 */
package br.com.crud.jumbo.crud_java_sprinboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.crud.jumbo.crud_java_sprinboot.model.PessoaJuridica;

/**
 * @author João Paulo
 *
 * 10 de jan. de 2022
 * 15:29:43
 */
@Repository
public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridica, Long>{

	@Query(value = "select u from PessoaJuridica u where upper(trim(u.nome)) like %?1%")
	List<PessoaJuridica> buscaEmpresaPorRazao(String razao);

	@Query(value = "select u from PessoaJuridica u where upper(trim(u.id)) like %?1%")
	List<PessoaJuridica> buscaEmpresaPorId(String id);
	
}
