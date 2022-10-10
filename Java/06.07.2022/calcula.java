import java.util.Scanner;

class Calcula{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int x, y, soma; 
        
        System.out.printf("Informe o primeiro valor:");
        x = ler.nextInt();
        System.out.printf("Informe o segundo valor");
        y = ler.nextInt();
        
        soma = x + y;
        
        System.out.print(soma);
        System.exit(0); 
    }
}
