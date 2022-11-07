package nttdata.javat1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import nttdata.javat1.ui.LoginView;

/**
 * Clase principal que inicia el programa
 * 
 * @author Adi�n C�mara Mu�oz
 *
 */
public class T1MainACM {

	private static final Logger LOG = LoggerFactory.getLogger(T1MainACM.class);

	/**
	 * m�todo principal del programa
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		LOG.info("M�todo: main() | TRAZA INICIO");
		new LoginView();
		LOG.info("M�todo: main() | TRAZA FIN");

	}
}
