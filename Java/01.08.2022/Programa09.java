import java.util.Scanner;
public class Programa09 {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            String  nt;
            String res;
            res = "";
            System.out.printf("Qual a sigla: ");
            nt = ler.next();
            switch (nt) {
                case "ND":
                    res = "Não desenvolvido";
                break;
                case "ED":
                    res = "Em desenvolvimento";
                break;
                case "PD":
                    res = "Plenamente desenvolvido";
                break;
                default:
                    res = "Sigla inválida";
                    break;
            }
            System.out.print(res);
        }
        System.exit(0);
    }
}
