package edwin.xml;

import org.apache.catalina.core.ApplicationContext;
import org.apache.catalina.core.StandardContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LauncherApplication {

	public static void main(String[] args) {
		// Cargar el contexto de Spring desde el archivo XML
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Obtener el bean y usarlo
		MiServicio miServicio = (MiServicio) context.getBean("miServicio");
		miServicio.imprimirMensaje();
	}

}
