//Hecho por Felix Muñoz
//Esta clase controla la clase SumarIntervaloNumeros
package ejercicios1_alumno;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
public class LlamarSumarIntervalo {
	public static void main(String[] args) {
		File dir = new File("./bin/");
		ProcessBuilder processBuilder = new ProcessBuilder("java", "ejercicios1_alumno.SumarIntervaloNumeros","2","5");
		processBuilder.directory(dir);

		processBuilder.redirectErrorStream(true);
		try {
		Process p = processBuilder.start();
		InputStream inputStream = p.getInputStream();
		int c;

		while((c=inputStream.read())!=-1) {
			System.out.print((char) c);
		}
		System.out.println("fin programa");
		int codigoSalida = p.waitFor();
		System.out.print(codigoSalida);
		inputStream.close();
		}catch(IOException io) {
			io.printStackTrace();
		}catch(InterruptedException io) {
			io.printStackTrace();
		}
	}
}
