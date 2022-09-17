import java.util.Scanner;
public class Programa12 {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);

String h;

System.out.println("Qual horário você deseja? (06:00 - 23:00)");
h = ler.next();

switch (h) {
case "6hrs":
System.out.println("Bom dia!");
break;

case "7hrs":
System.out.println("Bom dia!");
break;

case "8hrs":
System.out.println("Bom dia!");
break;

case "9hrs":
System.out.println("Bom dia!");
break;

case "10hrs":
System.out.println("Bom dia!");
break;

case "11hrs":
System.out.println("Bom dia!");
break;

case "12hrs":
System.out.println("Bom dia!");
break;

case "13hrs":
System.out.println("Boa tarde!");
break;

case "14hrs":
System.out.println("Boa tarde!");
break;

case "15hrs":
System.out.println("Boa tarde!");
break;

case "16hrs":
System.out.println("Boa tarde!");
break;

case "17hrs":
System.out.println("Boa tarde!");
break;

case "18hrs":
System.out.println("Boa tarde!");
break;
case "19hrs":
System.out.println("Boa noite!");
break;

case "20hrs":
System.out.println("Boa noite!");
break;

case "21hrs":
System.out.println("Boa noite!");
break;

case "22hrs":
System.out.println("Boa noite!");
break;

case "23hrs":
System.out.println("Boa noite!");
break;

default:
System.out.println("Código Inválido");
break;
    }
ler.close();
}
}