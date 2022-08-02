import java.util.Scanner;
public class Programa10 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int counter = 0;
            float[] precos = new float[3];
            int smallest = 0;
            while (counter < 3) {
                System.out.printf("Qual o preço do produto %d?\n", counter + 1);
                precos[counter] = scan.nextFloat();
                if (precos[counter] < precos[smallest]) {
                    smallest = counter;
                }
                counter++;
            }
            System.out.printf("Você deve comprar o produto %d.\n", smallest + 1);
        }
    }
}
