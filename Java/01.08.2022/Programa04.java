import java.util.Scanner;
public class Programa04{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int valor[] = new int[3];
            int maior = 0;
            for(int i = 0; i < valor.length; i++){
            System.out.print("Digite o " +(i+1)+"º valor: ");
            valor[i] = sc.nextInt();
            if(valor[i] > maior){
            maior = valor[i];
                }
            }
            System.out.println("Maior valor = "+ maior);
            }
        }
}
