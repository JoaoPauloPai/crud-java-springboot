/**
 * 
 */
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

import br.com.crud.jumbo.crud_java_sprinboot.model.PessoaFisica;
import br.com.crud.jumbo.crud_java_sprinboot.repository.PessoaFisicaRepository;

/**
 * @author João Paulo
 *
 *         25 de dez. de 2021 17:32:31
 */

@RestController
public class PessoaFisicaController {

	@Autowired
	private PessoaFisicaRepository pessoaFisicaRepository;
	

	/** Lista todas as Pessoas da Tabela no BD **/
	@GetMapping(value = "**/listaPessoaFisica")
	@ResponseBody
	public ResponseEntity<List<PessoaFisica>> listaPessoaFisica() {

		List<PessoaFisica> pessoas = pessoaFisicaRepository.findAll();

		return new ResponseEntity<List<PessoaFisica>>(pessoas, HttpStatus.OK);

	}

	/** Salva todos os dados na Tabela Pessoa do BD **/
	
	@PostMapping(value = "**/salvaPessoaFisica")
	@ResponseBody
	public ResponseEntity<PessoaFisica> salvarPessoa(@RequestBody PessoaFisica pessoaFisica) {

		PessoaFisica pess = pessoaFisicaRepository.save(pessoaFisica);

		return new ResponseEntity<PessoaFisica>(pess, HttpStatus.CREATED);

	}
	

	/** Atualiza todos os dados na Tabela Pessoa do BD **/

	@PutMapping(value = "**/atualizaPessoaFisica")
	@ResponseBody
	public ResponseEntity<PessoaFisica> atualizar(@RequestBody PessoaFisica pessoaFisica) {

		PessoaFisica pess = pessoaFisicaRepository.saveAndFlush(pessoaFisica);

		
		return new ResponseEntity<PessoaFisica>(pess, HttpStatus.OK);
	

	}

	/** Deleta todos os dados de uma pessoa na Tabela Pessoa do BD **/
	
	@DeleteMapping(value = "**/deletePessoaFisica")
	@ResponseBody // *Descrição da resposta
	public ResponseEntity<String> delete(@RequestParam long idPess) {

		
		pessoaFisicaRepository.deleteById(idPess);

		return new ResponseEntity<String>("Cadastro Pessoa Física deletado com sucesso!", HttpStatus.OK);
	}
	

	/** Busca todos os dados de uma pessoa na Tabela Pessoa do BD **/


	@GetMapping(value = "**/buscaPessoaFisicaId") // *mapeia a URL
	@ResponseBody // *Descrição da resposta
	public ResponseEntity<PessoaFisica> buscapessid(@RequestParam(name = "idPess") long idPess) {

		PessoaFisica pess = pessoaFisicaRepository.findById(idPess).get();

		return new ResponseEntity<PessoaFisica>(pess, HttpStatus.OK);
	}
	
	
	/** Busca os dados de uma pessoa na Tabela Pessoa do BD **/
	
	   @GetMapping(value = "**/buscaPessoaFisicaPorNome")
	   @ResponseBody 
	   public ResponseEntity<List<PessoaFisica>>buscaPessoaPorNome(@RequestParam(name = "nome")String  nome ) {
	   	
	   	
	   	 List<PessoaFisica> pess = pessoaFisicaRepository.buscaPessoaPorNome(nome.trim().toUpperCase());
	   	 
	   	 return new  ResponseEntity<List <PessoaFisica> > (pess, HttpStatus.OK );
	   }
	   
	   
		
		/** Busca os dados de uma pessoa na Tabela Pessoa do BD **/
		
		   @GetMapping(value = "**/buscaPessoaFisicaPorSexo")
		   @ResponseBody 
		   public ResponseEntity<List<PessoaFisica>>buscaPessoaPorSexo(@RequestParam(name = "sexo")String  sexo) {
		   	
		   	
		   	 List<PessoaFisica> pess = pessoaFisicaRepository.buscaPessoaPorSexo(sexo.trim().toUpperCase());
		   	 
		   	 return new  ResponseEntity<List <PessoaFisica> > (pess, HttpStatus.OK );
		   }
		   

}
