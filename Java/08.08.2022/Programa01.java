import java.util.Scanner;

public class Programa01 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Digite o seu nome: ");
            String nome = in.nextLine();
            
                System.out.println("Informe a sua idade: ");
                int idade = in.nextInt();

                System.out.println("Nome: "+nome);
                System.out.print("Idade: "+idade+" anos" );
        }
    }
}