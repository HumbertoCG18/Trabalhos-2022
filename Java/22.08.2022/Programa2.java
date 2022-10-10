import java.util.Scanner;

    public class Programa2 {
    
    String nome, texto;
    int idade, peso, altura;

    public Programa2(String nome, int idade, int peso, int altura){
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
    this.altura = altura;
    
    }

    public String getNome(){
        return nome;
    }
    
    public int getIdade(){ 
        return idade;
    }
    public int getPeso(){
        return peso;
    }
    
    public int getAltura(){
        return altura;
    }
    public static void main(String[] args) {
        
    Scanner ler = new Scanner(System.in);

        String nome;
        int idade, peso, altura;

        System.out.println("Qual seu nome ? ");
        nome = ler.next();

        System.out.println("Qual sua idade ? ");
        idade = ler.nextInt();

        System.out.println("Qual seu peso ? ");
        peso = ler.nextInt();

        System.out.println("Qual sua altura ? ");
        altura = ler.nextInt();


        tarefa2 obj = new tarefa2 (nome, idade, peso, altura);
        
        System.out.println("Características: ");
        System.out.println("Nome: "+obj.getNome());
        System.out.println("Idade: "+obj.getIdade());
        System.out.println("Peso: "+obj.getPeso());
        System.out.println("Altura em centímetros: "+obj.getAltura());

    }
}
