/**
 * 
 */
package br.com.crud.jumbo.crud_java_sprinboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.crud.jumbo.crud_java_sprinboot.model.Endereço;
import br.com.crud.jumbo.crud_java_sprinboot.model.Pessoa;
import br.com.crud.jumbo.crud_java_sprinboot.repository.EnderecoRepository;

/**
 * @author João Paulo
 *
 * 4 de jan. de 2022
 * 17:37:05
 */
@RestController
public class EnderecoController {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	
	/** Salva todos os dados na Tabela Endereco do BD **/
	@PostMapping(value = "salvaEndereco")
	@ResponseBody
	public ResponseEntity<Endereço> salvarEndereco(@RequestBody Endereço endereço) {

		
		
		Endereço end = enderecoRepository.save(endereço);
	

		return new ResponseEntity<Endereço>(end, HttpStatus.CREATED);

	}

}
