/**
 * 
 */
package br.com.crud.jumbo.crud_java_sprinboot.enums;

/**
 * @author João Paulo
 *
 *         8 de jan. de 2022 17:14:48
 */
public enum TipoEndereco {

	PRINCIPAL("Principal"),
	COBRANCA("Cobrança"), 
	ENTREGA("Entrega");

	private String descricao;

	private TipoEndereco(String descricao) {
		this.descricao = descricao;

	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {

		return this.toString();
	}
}
