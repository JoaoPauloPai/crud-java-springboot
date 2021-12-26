/**
 * 
 */
package br.com.crud.jumbo.crud_java_sprinboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.crud.jumbo.crud_java_sprinboot.model.Pessoa;

/**
 * @author João Paulo
 *
 *         23 de dez. de 2021 16:20:46
 */
@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

	@Query(value = "select u from Pessoa u where upper(trim(u.nome)) like %?1%")
	List<Pessoa> buscaPessoaPorNome(String nome);

	@Query(value = "select u from Pessoa u where upper(trim(u.sexo)) like %?1%")
	List<Pessoa> buscaPessoaPorSexo(String sexo);
}
