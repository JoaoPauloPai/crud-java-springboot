/**
 * 
 */
package br.com.crud.jumbo.crud_java_sprinboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.crud.jumbo.crud_java_sprinboot.model.Pessoa;
import br.com.crud.jumbo.crud_java_sprinboot.model.Usuario;

/**
 * @author João Paulo
 *
 *         23 de dez. de 2021 15:00:45
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	@Query(value = "select u from Usuario u where upper(trim(u.login)) like %?1%")
	List<Usuario>buscaUsuarioPorLogin(String login);

	//@Query(value = "select u from Usuario u where upper(trim(u.id)) like %?1%")
	//List<Usuario>buscaUsuarioPorId(String idUser);
}
