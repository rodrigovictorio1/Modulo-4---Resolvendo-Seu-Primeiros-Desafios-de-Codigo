package _Seção_4_Desafios_Java_Condicionalmente_Rico;

import java.util.Scanner;

public class Main {
	
  public static void main(String[] args) {

    // Entrada de dados
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite seu saldo: ");
    int saldoTotal = scanner.nextInt();
    System.out.println("Digite o valor a ser sacado: ");
    int valorSaque = scanner.nextInt();

    //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
    if (valorSaque <= saldoTotal) {
    	System.out.printf("Saque realizado com sucesso. Novo saldo: %d", (saldoTotal - valorSaque));
    } else {
    	System.out.printf("Saldo insuficiente. Saque não realizado!");    	
    }
    
  }
  
}
