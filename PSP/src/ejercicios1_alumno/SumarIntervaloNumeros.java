//Hecho por Félix Muñoz
package ejercicios1_alumno;

public class SumarIntervaloNumeros {
	public static void main(String[] args) {

		if(args.length == 2) {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println(a + " " + b);
			int resultado;
			if(a<=b) {
				resultado = b;
				for(int i = a; i<b; i++) {
					resultado += i;
				}
			}else {
				resultado = a;
				for(int i = b; i<a; i++) {
					resultado += i;
				}
			}
			System.out.println(resultado);

			System.exit(0);
		}else {
			System.exit(1);
		}
	}
}
