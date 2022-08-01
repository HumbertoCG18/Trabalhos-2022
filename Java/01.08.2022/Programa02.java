import java.util.Scanner;

public class Programa02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int valor[] = new int[4];
            int maior = 0, menor = 0;
            for(int i = 0; i < valor.length; i++){
            System.out.print("Digite o " +(i+1)+"º valor: ");
            valor[i] = sc.nextInt();
            if(valor[i] > maior){
            maior = valor[i];
                }
            }
            menor = maior;
            for (int j = 0; j < valor.length; j++) {
            if(valor[j] < menor){
            menor = valor[j];
                }
            }
            System.out.println("Maior valor = "+ maior);
            System.out.println("Menor valor = "+ menor);
            }
        }
}
