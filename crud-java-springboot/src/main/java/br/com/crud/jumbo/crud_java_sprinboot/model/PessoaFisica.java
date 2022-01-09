/**
 * 
 */
package br.com.crud.jumbo.crud_java_sprinboot.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author João Paulo
 *
 * 8 de jan. de 2022
 * 16:05:47
 */
@Entity
@Table(name = "pessoa_fisica")
@PrimaryKeyJoinColumn(name = "id")
public class PessoaFisica extends Pessoa{
	
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false)
	private String sexo;

	@Column(nullable = false)
	private String cpf;
	
	@Column(nullable = false)
    private String rg;
	
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	

}
