import java.util.Scanner;
public class Programa03{

public static void main(String[] args) {

	try (Scanner scan = new Scanner(System.in)) {
		System.out.println("Informe um valor: ");

		int valor = scan.nextInt();
		if (valor < 0) {
			System.out.println("O valor é Negativo! ");
		} 
		
		else {
			System.out.println("O valor é Positivo! ");
			}
		}
	}
}