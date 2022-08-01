import java.util.Scanner;
public class Programa08 {
     public static void main(String[] args) {
     try (Scanner ler = new Scanner(System.in)) {
        int num1;
        int num2;
        int ope;
        int num;
        String res;
        res = "";
        
   System.out.printf("Primeiro numero: ");
   num1 = ler.nextInt();
   System.out.printf("Segundo numero: ");
   num2 = ler.nextInt();
   System.out.printf("Operação: 1 = Adição/ 2 = Subtração/ 3 = Multiplicação/ 4 = Divisão ");
   ope = ler.nextInt();
        
   switch (ope) {
   case 1:
   num = num1 + num2;
   break;
   case 2:
   num = num1 - num2;
   break;
   case 3:
   num = num1 * num2;
   break;
   case 4:
        num = num1 / num2;    
        break;
        default:
        num = 0;
        res = "Operação inválida";
        break;
            }
        System.out.print(num + res);
    }
    
    System.exit(0);
        }
    }