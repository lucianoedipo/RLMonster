/**
 * 
 */
package base;

import java.io.Serializable;

/**
 * @author Luciano
 *
 */
public class Habilidade implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private Elementos tipoElemento;
	private int valorAtaque;
	private int taxaAcerto;

	/**
	 * @param nome
	 * @param tipoElemento
	 * @param valorAtaque
	 * @param taxaAcerto
	 */
	public Habilidade(String nome, Elementos tipoElemento, int valorAtaque, int taxaAcerto) {
		this.nome = nome;
		this.tipoElemento = tipoElemento;
		this.valorAtaque = valorAtaque;
		this.taxaAcerto = taxaAcerto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Elementos getTipoElemento() {
		return tipoElemento;
	}

	public void setTipoElemento(Elementos tipoElemento) {
		this.tipoElemento = tipoElemento;
	}

	public int getValorAtaque() {
		return valorAtaque;
	}

	public void setValorAtaque(int valorAtaque) {
		this.valorAtaque = valorAtaque;
	}

	public int getTaxaAcerto() {
		return taxaAcerto;
	}

	public void setTaxaAcerto(int taxaAcerto) {
		this.taxaAcerto = taxaAcerto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String toString() {
		String str = "H::" + this.nome + "\n";
		str += this.nome + "::Elemento: " + this.tipoElemento + "\n";
		str += this.nome + "::Ataque: " + this.valorAtaque + "\n";
		str += this.nome + "::Acerto: " + this.taxaAcerto + "%\n";
		System.out.println(this.tipoElemento.getElemento().forteContra());
		return str;

	}
}
