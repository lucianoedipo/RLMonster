/**
 * 
 */
package server;

import java.util.ArrayList;
import java.util.List;

import base.Elementos;
import base.Habilidade;

/**
 * @author Luciano
 *
 */
public class HabilidadesDAO extends DAO {
	private static String nomeBase = "D:\\workspace\\RLMonster\\data\\habilidades.dat";
	private static List<Habilidade> listaHabilidades = new ArrayList<>();

	/**
	 * @return the listaHabilidades
	 */
	public static List<Habilidade> getListaHabilidades() {
		return listaHabilidades;
	}

	/**
	 * @param listaHabilidades
	 *            the listaHabilidades to set
	 */
	public void setListaHabilidades(List<Habilidade> listaHabilidades) {
		HabilidadesDAO.listaHabilidades = listaHabilidades;
	}


	public static void salvar() {
		descarregar(nomeBase, listaHabilidades);
	}

	public static boolean criar(String nome, Elementos tipoElemento, int taxaAcerto, int valorAtaque) {
		if (getHabilidade(nome) == null) {
			Habilidade habilidade = new Habilidade(nome, tipoElemento, valorAtaque, taxaAcerto);
			listaHabilidades.add(habilidade);
			return true;
		} else {
			return false;
		}
	}

	public static Habilidade getHabilidade(String nome) {
		for (Habilidade habilidade : listaHabilidades) {
			if (habilidade.getNome().equals(nome)) {
				return habilidade;
			}
		}
		return null;

	}

	public List<Habilidade> getPorElemento(Elementos elemento) {
		List<Habilidade> habPorElemento = new ArrayList<>();
		for (Habilidade habilidade : listaHabilidades) {
			if (habilidade.getTipoElemento() == elemento) {
				habPorElemento.add(habilidade);
			}
		}
		return habPorElemento;
	}

	@SuppressWarnings("unchecked")
	public static void carregar() {
		// TODO Auto-generated method stub
		List<Habilidade> carregado = (List<Habilidade>) DAO.carregar(HabilidadesDAO.nomeBase);
		if (carregado != null) {
			listaHabilidades = carregado;
		}
	}
}
