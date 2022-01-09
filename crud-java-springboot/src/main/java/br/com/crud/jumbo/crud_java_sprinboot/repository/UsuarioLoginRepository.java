/**
 * 
 */
package br.com.crud.jumbo.crud_java_sprinboot.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.crud.jumbo.crud_java_sprinboot.model.Usuario;

/**
 * @author João Paulo
 *
 * 9 de jan. de 2022
 * 16:12:04
 */
public class UsuarioLoginRepository {
	
	
	public boolean validarAutenticacao(Usuario usuario) throws Exception {
		
	String sql = "select * from usuario where upper(login) = upper(?) and upper(senha) = upper(?) ";
		
		usuario.getLogin();
		usuario.getSenha();
		
	//	statement.setString(1, modelLogin.getLogin());
	//	statement.setString(2, modelLogin.getSenha());
		
	//	ResultSet resultSet = statement.executeQuery();
		
		//if (resultSet.next()) {
		//	return true;/*autenticado*/
	//	}
		
		
		return false;

		
	}
}
