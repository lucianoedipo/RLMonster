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
	 */
	public static void main(String[] args) {
		// TODO Aut-generated method stub
		Agua agua = new Agua();
		if(agua.forteContra() == Terra.class){
			System.out.println("è forte contra fogo");
		}else{
		System.out.println(agua.forteContra().getTypeName());
		}
		}

}
