/**
 * 
 */
package base;

/**
 * @author Luciano
 *
 */
public enum Elementos {
	AGUA(Agua.class), AR(Ar.class), FOGO(Fogo.class), TERRA(Terra.class);

	public Class<?> tipo;

	Elementos(Class<?> tipo) {
		this.tipo = tipo;
	}
	
	public Elemento getElemento(){
		try {
			return (Elemento) this.tipo.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void show() {
		for (Elementos it : Elementos.values()) {
			System.out.println(it.ordinal() + " - " + it.name());
		}
	}
}