package base;
import java.io.Serializable;

public class Monstro implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nomeBase;
	private String nome;
	private Elemento elementoBase;
	private int vida;
	private int velocidade;
	private int poder;
	private int energia;
	private Runa[] runas = new Runa[Conf.MAX_RUNAS];
	private int nivel = 1;
	private String descricao = "";
	
	
	/**
	 * @param nomeBase
	 * @param nome
	 * @param elementoBase
	 * @param descricao
	 */
	public Monstro(String nomeBase, String nome, Elemento elementoBase, String descricao) {
		this.nomeBase = nomeBase;
		this.nome = nome;
		this.elementoBase = elementoBase;
		this.descricao = descricao;
	}
	public String getNomeBase() {
		return nomeBase;
	}
	public void setNomeBase(String nomeBase) {
		this.nomeBase = nomeBase;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Elemento getElementoBase() {
		return elementoBase;
	}
	public void setElementoBase(Elemento elementoBase) {
		this.elementoBase = elementoBase;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getPoder() {
		return poder;
	}
	public void setPoder(int poder) {
		this.poder = poder;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	public Runa[] getRunas() {
		return runas;
	}
	public void setRunas(Runa[] runas) {
		this.runas = runas;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
