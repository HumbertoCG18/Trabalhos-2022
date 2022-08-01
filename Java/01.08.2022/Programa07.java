import java.util.Scanner;
public class Programa07 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
    
            int mes;
    
            System.out.println("Informe o código do produto: ");
            mes = in.nextInt();
    
            switch (mes) {
                case 1:
                    System.out.println("Alimento não-perecível");
                    break;
                case 2:
                    System.out.println("Alimento perecível");
                    break;
                case 3:
                    System.out.println("Alimento perecível");
                    break;
                case 4:
                    System.out.println("Alimento perecível");
                    break;
                case 5:
                    System.out.println("Vestuário");
                    break;
                case 6:
                    System.out.println("Vestuário");
                    break;
                case 7:
                    System.out.println("Higiene Pessoal");
                    break;
                case 8:
                    System.out.println("Limpeza e Utensílios Domésticos");
                    break;
                case 9:
                    System.out.println("Limpeza e Utensílios Domésticos");
                    break;
                case 10:
                    System.out.println("Limpeza e Utensílios Domésticos");
                    break;
                case 11:
                    System.out.println("Limpeza e Utensílios Domésticos");
                    break;
                case 12:
                    System.out.println("Limpeza e Utensílios Domésticos");
                    break;
                case 13:
                    System.out.println("Limpeza e Utensílios Domésticos");
                    break;
                case 14:
                    System.out.println("Limpeza e Utensílios Domésticos");
                    break;
                case 15:
                    System.out.println("Limpeza e Utensílios Domésticos");
                    break;
            }
            
            in.close();
        }
    }
