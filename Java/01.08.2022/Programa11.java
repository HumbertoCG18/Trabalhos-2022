import java.util.Scanner;
public class Programa11 {
    public static void main(String [] args) {

    try (Scanner entrada = new Scanner (System.in)) {
        char opcao;

        System.out.println("Em qual turno você estuda? (M = Matuino, V= Vespertino ou N = Noturno)");
        opcao=entrada.next() .charAt(0);

        if(opcao == 'm' || opcao == 'M' ){
            System.out.println("Bom Dia!");
        }

        else if(opcao == 'v' || opcao == 'V' ){
            System.out.println("Boa Tarde!");
        }

        else if(opcao == 'n' || opcao == 'N' ){
            System.out.println("Boa Noite!");
        }

        else{
            System.out.println("Valor Inválido!");
        }
    }
}
}
