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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.crud.jumbo.crud_java_sprinboot.model.Endereco;
import br.com.crud.jumbo.crud_java_sprinboot.model.PessoaFisica;
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
	
	
	/** Lista todos os Endereços da Tabela no BD **/
	@GetMapping(value = "listaEndereco")
	@ResponseBody
	public ResponseEntity<List<Endereco>> listaEndereco() {

		List<Endereco> enderecos = enderecoRepository.findAll();

		return new ResponseEntity<List<Endereco>>(enderecos, HttpStatus.OK);

	}
	
	/** Salva todos os dados na Tabela Endereco do BD **/
	
	@PostMapping(value = "salvaEndereco")
	@ResponseBody
	public ResponseEntity<Endereco> salvarEndereco(@RequestBody Endereco endereço) {

		
		
		Endereco end = enderecoRepository.save(endereço);
	

		return new ResponseEntity<Endereco>(end, HttpStatus.CREATED);

	}
	
	/** Busca os dados de um Endereço por Cidade na Tabela Pessoa do BD **/
	
	   @GetMapping(value = "buscaEnderecoPorCidade")
	   @ResponseBody 
	   public ResponseEntity<List<Endereco>>buscabuscaEnderecoPorCidade(@RequestParam(name = "cidade")String  cidade ) {
	   	
	   	
	   	 List<Endereco> end = enderecoRepository.buscaEnderecoPorCidade(cidade.trim().toUpperCase());
	   	 
	   	 return new  ResponseEntity<List <Endereco> > (end, HttpStatus.OK );
	   }

}
