import java.util.Scanner;
public class Programa06 {

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            int num1;

            String mes;

            System.out.printf("Insira o numero do mês: ");

            num1 = ler.nextInt();

            switch (num1) {
                case 1:
                    mes = "Janeiro";
                break;
                case 2:
                    mes = "Fevereiro";
                break;
                case 3:
                    mes = "Março";
                break;
                case 4:
                    mes = "Abril";
                break;
                case 5:
                    mes = "Maio";
                break;
                case 6:
                    mes = "Junho";
                break;
                case 7:
                    mes = "Julho";
                break;
                case 8:
                    mes = "Agosto";
                break;
                case 9:
                    mes = "Setembro";
                break;
                case 10:
                    mes = "Outubro";
                break;
                case 11:
                    mes = "Novembro";
                break;
                case 12:
                    mes = "dezembro";
                break;
                default:
                    mes = "Coloque um numero válido!";
                break;
            }
            System.out.print("O mês é " + mes);
        }
        System.exit(0);
    }
}