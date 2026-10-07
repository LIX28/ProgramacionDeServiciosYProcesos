//Hecho por Felix Muñoz

//controla la clase ControlArgumentos,
package ejercicios1_alumno;
import java.io.File;


public class LlamarControlArgumentos {
	public static void main(String[] args) {
		ProcessBuilder processBuilder = new ProcessBuilder("java","ejercicios1_alumno.ControlArgumentos","-2","hello");
		processBuilder.directory(new File("./bin/"));
		
		processBuilder.redirectErrorStream(true);
		try {
			Process p = processBuilder.start();
			int codigoSalida = p.waitFor();
			
			
			switch(codigoSalida) {
				case 1:
					System.out.println("No se ha introducido ningún parámetro");
					System.out.print(codigoSalida);
					break;
				
				case 2:
					System.out.println("El parámetro introducido es una cadena");
					System.out.print(codigoSalida);
					break;
					
				case 3:
					System.out.println("El parámetro introducido es un número menor de 0");
					System.out.print(codigoSalida);
					break;
					
				case 4:
					System.out.println("El parámetro introducido es un número mayor que 0");
					System.out.print(codigoSalida);
					break;
				
				default:
					System.out.print("-1");
					break;
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
