/**
 * 
 */
package br.com.crud.jumbo.crud_java_sprinboot.security;

import javax.servlet.http.HttpSessionListener;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author João Paulo
 *
 * 12 de jan. de 2022
 * 11:50:04
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class WebConfigSecurity  extends WebSecurityConfigurerAdapter implements HttpSessionListener{

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers(HttpMethod.GET,"/salvarAcesso","/deleteAcesso","/listaAcesso")
		.antMatchers(HttpMethod.POST,"/salvarAcesso","/deleteAcesso")
		.antMatchers(HttpMethod.PUT);
	}
}
