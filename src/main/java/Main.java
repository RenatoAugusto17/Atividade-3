import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    System.out.println("Bem vindo ao Posto Ipiranga.");
    System.out.println("");
    System.out.println("Ensira o valor do combustível que você quer:");
    System.out.println("1-Álcool");
    System.out.println("2-Gasolina Comum");
    System.out.println("3-Diesel");
    System.out.println("Coloque 0 para encerrar o sistema");
    System.out.println("Valor:");
    
   int gasolina = sc.nextInt();
  int diesel = 1;
  int comum = 1;
  int alcool = 1;
    
    while ( gasolina != 4 ) {
      System.out.println("Insira outro valor:");
      gasolina = sc.nextInt();
    }

    while (gasolina != 4) {
    if ( gasolina == 1) {
      soma = alcool + 1;
    }
    if ( gasolina == 2) {
      soma2 = comum + 1;
    }
    if ( gasolina == 3) {
      soma3 = diesel + 1;
    }
}
    int dieselfinal = diesel;
    int alcoolfinal = alcool;
    int comumfinal = comum;
    
   if ( gasolina == 4 ) {
     System.out.print("Fim do Sistema");
   }
    System.out.println("");
    System.out.println("Valor total de vendas");
    System.out.println("Álcool: " + alcoolfinal);
    System.out.println("Gasolina Comum: " + comumfinal);
    System.out.println("Diesel:  " + dieselfinal);

    
   sc.close();
  }
}