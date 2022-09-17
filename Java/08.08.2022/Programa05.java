import java.util.Scanner;

public class Programa05 {
    public static void main(String[] args){
        int entrada;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informar um número: ");
        entrada = scanner.nextInt();
        System.out.println("\n"+"Tábuada do "+entrada+":");
        
        int multiplicador = 0;
        while(multiplicador <= 10){
            
            int resultado = entrada * multiplicador;
            System.out.println("\n"+resultado);   
            multiplicador++;
            
        }
    }
}