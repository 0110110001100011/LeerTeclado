import java.util.*;

public class LectorScanner {
		private static Scanner entrada;

		public static void main(String args[]){
			entrada = new Scanner(System.in);
			System.out.println("Escribe algo: ");
			String cadena = entrada.nextLine();
			System.out.println("\nEscribiste: ");
			System.out.println(cadena);
		}
}
