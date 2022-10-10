import java.util.Scanner;

    public class Programa4 {
    
    String nome, endereco, texto;
    int cpf, telefone;

    public Programa4(String nome, String endereco, int telefone, int cpf){
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
    this.cpf = cpf;

    }

    public String getNome(){
        return nome;
    }
    
    public String getEndereco(){ 
        return endereco;
    }
    
    public int getTelefone(){
        return telefone;
    }
    
    public int getCpf(){
        return cpf;
    }
    public static void main(String[] args) {
        
    Scanner ler = new Scanner(System.in);

        String nome, endereco;
        int telefone, cpf;

        System.out.print("Qual seu nome ? ");
        nome = ler.next();

        System.out.println("Qual seu endereço ? ");
        endereco = ler.next();

        System.out.println("Qual seu CPF ? ");
        cpf = ler.nextInt();

        System.out.println("Qual seu telefone ? ");
        telefone = ler.nextInt();


        Programa4 obj = new Programa4 (nome, endereco, cpf, telefone);
        
        System.out.println("Informações: ");
        System.out.println("Nome: "+obj.getNome());
        System.out.println("Endereco: "+obj.getEndereco());
        System.out.println("CPF: "+obj.getCpf());
        System.out.println("Telefone: "+obj.getTelefone());

    }
}
