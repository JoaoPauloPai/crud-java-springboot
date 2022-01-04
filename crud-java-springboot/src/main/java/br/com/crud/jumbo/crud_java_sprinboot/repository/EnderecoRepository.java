/**
 * 
 */
package br.com.crud.jumbo.crud_java_sprinboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.crud.jumbo.crud_java_sprinboot.model.Endereço;

/**
 * @author João Paulo
 *
 * 4 de jan. de 2022
 * 17:31:49
 */
@Repository
public interface EnderecoRepository extends JpaRepository<Endereço, Long> {

}
