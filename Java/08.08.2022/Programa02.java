import java.util.Scanner;

public class Programa02 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String nome;
        int contador=2;
        System.out.println("Digite o seu nome: ");
        nome = input.nextLine();
        
        while(contador <= 20 ){
            System.out.println(nome);
            contador++;
        }
    }
}