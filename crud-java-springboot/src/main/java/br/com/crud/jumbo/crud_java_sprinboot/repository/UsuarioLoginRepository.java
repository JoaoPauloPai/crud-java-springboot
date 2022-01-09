/**
 * 
 */
package br.com.crud.jumbo.crud_java_sprinboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.crud.jumbo.crud_java_sprinboot.model.Usuario;

/**
 * @author João Paulo
 *
 * 9 de jan. de 2022
 * 17:33:26
 */
public interface UsuarioLoginRepository extends JpaRepository<Usuario, Long>  {
	
	
		
	//	@Query(value = "select * from usuario where upper(login) = upper(?) and upper(senha) = upper(?) ")
			
		
			 
	
			
		//statement.setString(1, usuario.getLogin());
		//	statement.setString(2, modelLogin.getSenha());
			
		//	ResultSet resultSet = statement.executeQuery();
			
			//if (resultSet.next()) {
			//	return true;/*autenticado*/
		//	}
			
			
		//	return usuario;

			
		//}

}
