/**
 * 
 */
package br.com.crud.jumbo.crud_java_sprinboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.crud.jumbo.crud_java_sprinboot.model.Endereco;


/**
 * @author João Paulo
 *
 * 4 de jan. de 2022
 * 17:31:49
 */
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
	
	@Query(value = "select u from Endereco u where upper(trim(u.cidade)) like %?1%")
	List<Endereco> buscaEnderecoPorCidade(String nome);

}
