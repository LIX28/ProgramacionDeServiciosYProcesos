//Hecho por Felix Muñoz

package ejercicios1_alumno;

public class LeerNombre { 
	public static void main(String[] args) {
		if(args.length == 1) {
			System.out.println("el parametro es "+ args[0]);
			System.exit(0);
		}else{
			if(args.length == 0) {
				System.out.print("No has metido ningún parametro");
			}else {
				System.out.println("Ha habido un error con el parametro");
			}
			
			System.exit(1);

		}
	}
}
