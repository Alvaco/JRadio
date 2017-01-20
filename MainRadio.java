import static java.lang.System.*;
import java.util.Scanner;
public class MainRadio {
	private static Scanner sc;
	public static void main(String[] args) {
		int option = 0;
		jRadio radio = new jRadio();
		sc = new Scanner(System.in);
		/**
		 * Mostrar menú principal
		 */
		while (option != 7) {
			out.println("1. Encender/Apagar radio");
			out.println("2. Cambiar frecuencia");
			out.println("3. Avanzar emisora");
			out.println("4. Retroceder emisora");
			out.println("5. Guardar emisora");
			out.println("6. Seleccionar emisora guardada");
			out.println("7. Cerrar programa");
			try {
				option = sc.nextInt();
				switch (option) {
				case 1:
					radio.estado();
					break;
				case 2:
					radio.frecuencia();
					break;
				case 3:
					radio.cambiar(true);
					break;
				case 4:
					radio.cambiar(false);
					break;
				case 5:
					out.println("Ingrese el número de memoria para guardar la emisora: ");
					radio.guardar(getKeyNumber() - 1);
					break;
				case 6:
					out.println("Ingrese el número de memoria para escuchar la emisora: ");
					radio.seleccionar(getKeyNumber() - 1);
					break;
				case 7:
					break;
				}
			} catch (Exception e) {
				out.println("Ingrese un número correcto:");
				sc.nextLine();
			}
		}
	}
	
	private static int getKeyNumber() {
		while (true) {
			try {
				int index;
				index = sc.nextInt();
				if (index < 13 && index > 0){
					return index;
				} else {
					out.println("Ingrese un número entre 1 y 12");
				}
			} catch (Exception e) {
				out.println("Ingrese un número correcto:");
				sc.nextLine();
			}
		}
	}
}