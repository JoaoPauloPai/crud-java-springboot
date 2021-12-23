/**
 * 
 */
package br.com.crud.jumbo.crud_java_sprinboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.crud.jumbo.crud_java_sprinboot.model.Usuario;

/**
 * @author João Paulo
 *
 * 23 de dez. de 2021
 * 15:00:45
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	

}
