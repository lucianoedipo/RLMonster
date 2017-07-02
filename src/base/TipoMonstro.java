package base;

import java.io.Serializable;

/**
 * 
 */

/**
 * @author Luciano
 *
 */
public class TipoMonstro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int vidaBase;
	private int velocidadeBase;
	private int poderBase;
	private int energiaBase;
	private String nome;

	/**
	 * @param vidaBase
	 * @param velocidadeBase
	 * @param poderBase
	 * @param energiaBase
	 * @param nome
	 */
	public TipoMonstro(int vidaBase, int velocidadeBase, int poderBase, int energiaBase, String nome) {
		this.vidaBase = vidaBase;
		this.velocidadeBase = velocidadeBase;
		this.poderBase = poderBase;
		this.energiaBase = energiaBase;
		this.nome = nome;
	}

	public int getVidaBase() {
		return vidaBase;
	}

	public void setVidaBase(int vidaBase) {
		this.vidaBase = vidaBase;
	}

	public int getVelocidadeBase() {
		return velocidadeBase;
	}

	public void setVelocidadeBase(int velocidadeBase) {
		this.velocidadeBase = velocidadeBase;
	}

	public int getPoderBase() {
		return poderBase;
	}

	public void setPoderBase(int poderBase) {
		this.poderBase = poderBase;
	}

	public int getEnergiaBase() {
		return energiaBase;
	}

	public void setEnergiaBase(int energiaBase) {
		this.energiaBase = energiaBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
