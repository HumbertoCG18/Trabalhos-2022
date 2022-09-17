import java.util.Scanner;

public class Programa03 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String nome;
        int contador=1;
        System.out.println("Digite o seu nome: ");
        nome = input.nextLine();
        
        while(contador <= 10 ){
            System.out.println(nome);
            contador++;
        }
    }
}