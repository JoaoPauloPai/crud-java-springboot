/**
 * 
 */
package br.com.crud.jumbo.crud_java_sprinboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.crud.jumbo.crud_java_sprinboot.model.Pessoa;

/**
 * @author João Paulo
 *
 * 23 de dez. de 2021
 * 16:20:46
 */
@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
