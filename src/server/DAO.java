/**
 * 
 */
package server;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Luciano
 *
 */
public abstract class DAO {

	public static Object carregar(String caminho) {
		try {
			FileInputStream inputStream = new FileInputStream(caminho);
			ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
			Object obj = objectInputStream.readObject();
			objectInputStream.close();
			return obj;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println(e.toString());
			System.out.println("Sem habilidade, primeiro uso");
			return null;
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public static boolean descarregar(String caminho, Object object) {
		try {
			FileOutputStream outputStream = new FileOutputStream(caminho);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
			objectOutputStream.writeObject(object);
			objectOutputStream.close();
			return true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

}
