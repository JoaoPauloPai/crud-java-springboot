package br.com.crud.jumbo.crud_java_sprinboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.crud.jumbo.crud_java_sprinboot.model.Pessoa;
import br.com.crud.jumbo.crud_java_sprinboot.model.Usuario;
import br.com.crud.jumbo.crud_java_sprinboot.repository.PessoaRepository;
import br.com.crud.jumbo.crud_java_sprinboot.repository.UsuarioRepository;

/**
 * @author João Paulo
 *
 *         21 de dez. de 2021 22:42:57
 */

@RestController
public class GreetingsController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private PessoaRepository pessoaRepository;

	//@RequestMapping(value = "/{nome}", method = RequestMethod.GET)
	//@ResponseStatus(HttpStatus.OK)
	public String greetingText(@PathVariable String nome) {

		return "Curso Java " + nome + "!";
	}

	//@RequestMapping(value = "/meuNome/{nome}", method = RequestMethod.GET)
	//@ResponseStatus(HttpStatus.OK)
	public String retornaMeuNome(@PathVariable String nome) {

		Usuario usuario = new Usuario();
		usuario.setLogin(nome);

		usuarioRepository.save(usuario);

		return "seu nome = " + nome;

	}

	@GetMapping(value = "listaUsuario")
	@ResponseBody
	public ResponseEntity<List<Usuario>> listaUsuario() {

		List<Usuario> usuarios = usuarioRepository.findAll();

		return new ResponseEntity<List<Usuario>>(usuarios, HttpStatus.OK);

	}
	
	@GetMapping(value = "listaPessoa")
	@ResponseBody
	public ResponseEntity<List<Pessoa>> listaPessoa() {

		List<Pessoa> pessoas = pessoaRepository.findAll();

		return new ResponseEntity<List<Pessoa>>(pessoas, HttpStatus.OK);

	}
	
	@PostMapping(value = "salvarUsuario")
	@ResponseBody
	public ResponseEntity<Usuario> salvarUsuario (@RequestBody Usuario usuario){
		
	Usuario user	= usuarioRepository.save(usuario);

	return new ResponseEntity<Usuario>(user, HttpStatus.CREATED);
	
	}
	
	@PostMapping(value = "salvarPessoa")
	@ResponseBody
	public ResponseEntity<Pessoa> salvarPessoa (@RequestBody Pessoa pessoa){

		
	Pessoa pess =	pessoaRepository.save(pessoa);
		    
	

	return new ResponseEntity<Pessoa>(pess, HttpStatus.CREATED);
	
	}
	
}
