import java.util.Scanner;

public class Programa3 {
    String marca, modelo;
    int velmax, ano;
    
            public Programa3(String marca, String modelo, int velmax, int ano){
            this.marca = marca;
            this.modelo = modelo;
            this.velmax = velmax;
            this.ano = ano;
        }
        
            public String getMarca(){
            return marca;
        }
    
        public String getModelo(){ 
           return modelo;
        }
        public int getVelmax(){
            return velmax;
        }
    
        public int getAno(){
            return ano;
        }
        
        public static void main (String[] args) {
            Scanner vrum = new Scanner(System.in);

        String marca, modelo;
        int velmax, ano;

        System.out.println("Qual a marca do carro? ");
        marca = vrum.next();

        System.out.println("Qual o modelo do carro? ");
        modelo = vrum.next();

        System.out.println("Qual a velocidade maxima do "+modelo+" ?");
        velmax = vrum.nextInt();

        System.out.println("Qual o ano do "+modelo+ " ?");
        ano = vrum.nextInt();

        Programa3 obj = new Programa3(marca, modelo, velmax, ano);
        
        System.out.println("Caracteristicas desejadas");
        System.out.println("Marca = "+obj.getMarca() );
        System.out.println("Modelo = "+obj.getModelo() );
        System.out.println("Velocidade Maxima = "+obj.getVelmax()+" km/h" );
        System.out.println("Ano = "+obj.getAno() );

        vrum.close();
        }
}