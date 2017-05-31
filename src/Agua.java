import java.lang.reflect.Type;

/**
 * 
 */

/**
 * @author Luciano
 *
 */
public  class Agua extends Elemento {

	@Override
	public Type forteContra() {
		// TODO Auto-generated method stub
		return Fogo.class;
	}

	@Override
	public Type fracoContra() {
		// TODO Auto-generated method stub
		return Terra.class;
	}
	
	

}
