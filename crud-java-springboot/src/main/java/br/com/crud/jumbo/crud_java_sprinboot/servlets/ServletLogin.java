/**
 * 
 */
package br.com.crud.jumbo.crud_java_sprinboot.servlets;

import java.io.IOException;

import br.com.crud.jumbo.crud_java_sprinboot.repository.UsuarioLoginRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * @author João Paulo
 *
 * 9 de jan. de 2022
 * 15:53:00
 */

/*O chamando Controller são as servlets ou ServletLoginController*/
@WebServlet(urlPatterns = {"/principal/ServletLogin", "/ServletLogin"}) /*Mapeamento de URL que vem da tela*/
public class ServletLogin extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	//private UsuarioLoginRepository usuarioLoginRepository = new UsuarioLoginRepository();
	
	
	   public ServletLogin() {
		   
	    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	RequestDispatcher redirecionar = request.getRequestDispatcher("/principal.html");
	
	}
}
