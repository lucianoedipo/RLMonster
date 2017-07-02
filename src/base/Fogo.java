package base;
import java.lang.reflect.Type;

/**
 * 
 */

/**
 * @author Luciano
 *
 */
public final class Fogo extends Elemento {

	@Override
	public Type forteContra() {
		// TODO Auto-generated method stub
		return Ar.class;
	}

	@Override
	public Type fracoContra() {
		// TODO Auto-generated method stub
		return Agua.class;
	}

}
