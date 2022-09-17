import java.util.Scanner;

public class Programa06 {
    public static void main(String[] args){
        int entrada;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informar um número: ");
        entrada = scanner.nextInt();

        int multiplicador = 0;
        while(multiplicador <= 10){
            
            int resultado = entrada * multiplicador;
            System.out.println(resultado);   
            multiplicador++;
        }
    }
}