import java.util.Scanner;

public class Programa13 {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Escreva o seu salário: ");
            float salario = ler.nextFloat();
            float percentual_aumento = 0; 
            float valor_aumento = 0; 
            float novo_salario = 0;

            if (salario <= 280) {
                percentual_aumento = 20;
            }

            else if (salario > 280 && salario <= 700) {
                percentual_aumento = 15;
            }

            else if (salario > 700 && salario <= 1500) {
                percentual_aumento = 10;
            }

            else if (salario > 1500) {
                percentual_aumento = 5;
            }

            valor_aumento = salario * (percentual_aumento/100);
            novo_salario = salario + valor_aumento;

            System.out.println("Salário antes de reajuste: R$ " + salario);
            System.out.println("Percentual de aumento: " + percentual_aumento + "%");    
            System.out.println("Valor do aumento:  R$ " + valor_aumento); 
            System.out.println("Salário após aumento:  R$ " + novo_salario);
        } 
    }
}
