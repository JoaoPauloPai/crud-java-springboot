package br.com.crud.jumbo.crud_java_sprinboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.crud.jumbo.crud_java_sprinboot.model.Pessoa;
import br.com.crud.jumbo.crud_java_sprinboot.model.Usuario;
import br.com.crud.jumbo.crud_java_sprinboot.repository.PessoaFisicaRepository;
import br.com.crud.jumbo.crud_java_sprinboot.repository.UsuarioRepository;

/**
 * @author João Paulo
 *
 *         21 de dez. de 2021 22:42:57
 */

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;


	/**
	 * Lista todo os Dados da Tabela Usuario no BD
	 **/

	@GetMapping(value = "listaUsuario")
	@ResponseBody
	public ResponseEntity<List<Usuario>> listaUsuario() {

		List<Usuario> usuarios = usuarioRepository.findAll();

		return new ResponseEntity<List<Usuario>>(usuarios, HttpStatus.OK);

	}

	/**
	 * Salvar Dados nas Tabelas
	 **/

	@PostMapping(value = "salvarUsuario")
	@ResponseBody
	public ResponseEntity<Usuario> salvarUsuario(@RequestBody Usuario usuario) {

		Usuario user = usuarioRepository.save(usuario);

		return new ResponseEntity<Usuario>(user, HttpStatus.CREATED);

	}

	/**
	 * Atualizar Dados nas Tabelas
	 **/

	@PutMapping(value = "atualizaUsuario") // * mapeia um URL
	@ResponseBody // * Descrição da resposta
	public ResponseEntity<Usuario> atualizar(@RequestBody Usuario usuario) { // * Recebe os dados para atualizar

		Usuario user = usuarioRepository.saveAndFlush(usuario);

		return new ResponseEntity<Usuario>(user, HttpStatus.OK);

	}

	@DeleteMapping(value = "deleteUsuario")
	@ResponseBody // *Descrição da resposta
	public ResponseEntity<String> delete(@RequestParam long idUser) {

		usuarioRepository.deleteById(idUser);

		return new ResponseEntity<String>("Usuário deletado com sucesso!", HttpStatus.OK);
	}

	@GetMapping(value = "buscaUsuarioPorLogin")
	@ResponseBody
	public ResponseEntity<List<Usuario>> buscaUsuarioPorLogin(@RequestParam(name = "login") String login) {

		List<Usuario> user = usuarioRepository.buscaUsuarioPorLogin(login.trim().toUpperCase());

		return new ResponseEntity<List<Usuario>>(user, HttpStatus.OK);
	}

}
