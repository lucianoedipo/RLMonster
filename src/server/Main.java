package server;

/**
 * 
 */

/**
 * @author Luciano
 *
 */
public class Main {
	/**
	 * @param args
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Aut-generated method stub
		RLServer rlServer = new RLServer();
		carregarDados();
		rlServer.run();
		// Type a = Elementos.TERRA.getElemento().forteContra();
		// System.out.println(a);
		// Elemento b = (Elemento) Class.forName(a.getTypeName()).newInstance();
		// System.out.println(b.forteContra());
		salvarDados();
	}

	public static void carregarDados() {
		HabilidadesDAO.carregar();
	}

	public static void salvarDados() {
		HabilidadesDAO.salvar();
	}

}
