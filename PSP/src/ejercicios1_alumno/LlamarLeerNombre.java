//Hecho por Felix Muñoz
//Esta clase controla la clase LlamarNombre del mismo paquete.
package ejercicios1_alumno;

import java.io.File;
import java.io.InputStream;
import java.io.IOException;
public class LlamarLeerNombre {
	public static void main(String args[]) {
		ProcessBuilder pb = new ProcessBuilder("java","ejercicios1_alumno.LeerNombre","FELIX");
		pb.directory(new File("./bin/"));
		pb.redirectErrorStream(true);
		try{
			Process p = pb.start();
			int codigoSalida = p.waitFor();
			InputStream inputStream = p.getInputStream();
			int c;
			
			while((c=inputStream.read()) != -1) {
				System.out.print((char) c );
			}
			System.out.println(codigoSalida);
			System.out.print("programa terminado");
		}catch(IOException ex) {
			System.err.println("hubo un error");
		}catch(InterruptedException ex) {
			System.err.println("hubo un error");
		}
	}
}

