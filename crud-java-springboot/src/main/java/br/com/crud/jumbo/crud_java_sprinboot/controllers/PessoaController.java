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

import br.com.crud.jumbo.crud_java_sprinboot.model.Pessoa;
import br.com.crud.jumbo.crud_java_sprinboot.repository.PessoaRepository;

/**
 * @author João Paulo
 *
 *         25 de dez. de 2021 17:32:31
 */

@RestController
public class PessoaController {

	@Autowired
	private PessoaRepository pessoaRepository;

	/** Lista todas as Pessoas da Tabela no BD **/
	@GetMapping(value = "listaPessoa")
	@ResponseBody
	public ResponseEntity<List<Pessoa>> listaPessoa() {

		List<Pessoa> pessoas = pessoaRepository.findAll();

		return new ResponseEntity<List<Pessoa>>(pessoas, HttpStatus.OK);

	}

	/** Salva todos os dados na Tabela Pessoa do BD **/
	@PostMapping(value = "salvaPessoa")
	@ResponseBody
	public ResponseEntity<Pessoa> salvarPessoa(@RequestBody Pessoa pessoa) {

		Pessoa pess = pessoaRepository.save(pessoa);

		return new ResponseEntity<Pessoa>(pess, HttpStatus.CREATED);

	}

	/** Atualiza todos os dados na Tabela Pessoa do BD **/
	@PutMapping(value = "atualizaPessoa")
	@ResponseBody
	public ResponseEntity<Pessoa> atualizar(@RequestBody Pessoa pessoa) {

		Pessoa pess = pessoaRepository.saveAndFlush(pessoa);

		return new ResponseEntity<Pessoa>(pess, HttpStatus.OK);

	}

	/** Deleta todos os dados de uma pessoa na Tabela Pessoa do BD **/
	@DeleteMapping(value = "deletePessoa")
	@ResponseBody // *Descrição da resposta
	public ResponseEntity<String> delete(@RequestParam long idPess) {

		pessoaRepository.deleteById(idPess);

		return new ResponseEntity<String>("Cadastro Pessoa deletado com sucesso!", HttpStatus.OK);
	}

	/** Busca todos os dados de uma pessoa na Tabela Pessoa do BD **/
	@GetMapping(value = "buscaPessId") // *mapeia a URL
	@ResponseBody // *Descrição da resposta
	public ResponseEntity<Pessoa> buscapessid(@RequestParam(name = "idPess") long idPess) {

		Pessoa pess = pessoaRepository.findById(idPess).get();

		return new ResponseEntity<Pessoa>(pess, HttpStatus.OK);
	}
	
	/** Busca os dados de uma pessoa na Tabela Pessoa do BD **/
	
	   @GetMapping(value = "buscaPessoaPorNome")
	   @ResponseBody 
	   public ResponseEntity<List<Pessoa>>buscaPessoaPorNome(@RequestParam(name = "nome")String  nome ) {
	   	
	   	
	   	 List<Pessoa> pess = pessoaRepository.buscaPessoaPorNome(nome.trim().toUpperCase());
	   	 
	   	 return new  ResponseEntity<List <Pessoa> > (pess, HttpStatus.OK );
	   }
	   
		
		/** Busca os dados de uma pessoa na Tabela Pessoa do BD **/
		
		   @GetMapping(value = "buscaPessoaPorSexo")
		   @ResponseBody 
		   public ResponseEntity<List<Pessoa>>buscaPessoaPorSexo(@RequestParam(name = "sexo")String  sexo) {
		   	
		   	
		   	 List<Pessoa> pess = pessoaRepository.buscaPessoaPorSexo(sexo.trim().toUpperCase());
		   	 
		   	 return new  ResponseEntity<List <Pessoa> > (pess, HttpStatus.OK );
		   }


}
