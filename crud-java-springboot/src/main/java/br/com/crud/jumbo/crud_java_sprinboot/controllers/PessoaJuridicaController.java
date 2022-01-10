/**
 * 
 */
package br.com.crud.jumbo.crud_java_sprinboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.crud.jumbo.crud_java_sprinboot.model.PessoaJuridica;
import br.com.crud.jumbo.crud_java_sprinboot.repository.PessoaJuridicaRepository;

/**
 * @author João Paulo
 *
 * 10 de jan. de 2022
 * 15:34:46
 */
@RestController
public class PessoaJuridicaController {
	
	@Autowired
	private PessoaJuridicaRepository pessoaJuridicaRepository;

	/** Lista todas as Empresas da Tabela Pessoa_Juridica no BD **/
	@GetMapping(value = "listaPessoaJuridica")
	@ResponseBody
	public ResponseEntity<List<PessoaJuridica>> listaPessoaJuridica() {

		List<PessoaJuridica> pessJuridica =  pessoaJuridicaRepository.findAll();

		return new ResponseEntity<List<PessoaJuridica>>(pessJuridica, HttpStatus.OK);

	}
	
	/** Salva todos os dados na Tabela Pessoa do BD **/
	
	@PostMapping(value = "salvaPessoaJuridica")
	@ResponseBody
	public ResponseEntity<PessoaJuridica> salvarPessoa(@RequestBody PessoaJuridica pessoaJuridica) {

		PessoaJuridica pesJuridica = pessoaJuridicaRepository.save(pessoaJuridica);

		return new ResponseEntity<PessoaJuridica>(pesJuridica, HttpStatus.CREATED);

	}
	
}
