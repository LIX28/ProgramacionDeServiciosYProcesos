//Hecho por Felix Muñoz

package ejercicios1_alumno;

public class ControlArgumentos {

	public static void main(String[] args) {
		
		int a; //almacenará el valor de args si es un int.
		if(args.length==1) { //comprobamos si hay un parámeto
			try {
				a = Integer.parseInt(args[0]);
			
				if(a>= 0) {
					System.exit(4);
				}else {
					System.exit(3);
				}	
			}catch(NumberFormatException nfe) { //si args[0] hace fallar al Integer.parseInt, significa que args[0] es una cadena
				System.err.println("No es un int");
				System.exit(2);
				
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}else if(args.length == 0) {
			System.exit(1);
		}else {
			System.exit(-1);
		}
	}
}
