import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// para comentar código poner /* */ 
		Scanner teclado = new Scanner (System.in); 
		System.out.println("¿Cómo te llamas?");
		String nombre = teclado.nextLine();
		
		System.out.println("¿Qué edad tienes?");
		int edad = teclado.nextInt();
		int mayoredad = 18;
		if (edad >= mayoredad) {
			System.out.println("Hola "+ nombre + ", eres mayor de edad");
		}
		else { 
			System.out.println("Hola " + nombre +", eres menor de edad");
		}
		}
		

}