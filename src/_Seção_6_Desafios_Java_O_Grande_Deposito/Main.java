package _Se��o_6_Desafios_Java_O_Grande_Deposito;

import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        if (valor > 0) {
            //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
        	System.out.printf("Deposito realizado com sucesso! %nSaldo atual: R$ %.2f", valor);
        } else if (valor == 0) {
            //TODO: Imprimir a mensagem de valor inv�lido.
        	System.out.println("Encerrando o programa...");
        } else {
             //TODO: Imprimir a mensagem de encerrar o programa.
        	System.out.println("Valor invalido! Digite um valor maior que zero.");
        }
        
        scanner.close();
        
    }
    
}