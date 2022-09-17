import java.util.Scanner;
public class Programa04{
3
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int  res,md,as;
        int numero = 20;
        int soma = 0;

        for(int w = 0; w < numero; w++ ){
            System.out.printf("Digite as "+(w+1)+" idades: "); 
            as = ler.nextInt();  
            soma = as + soma;
        }
        
        res = soma/numero;
        System.out.println("A média das idades é "+res);
            System.exit(0);
        }
    }
