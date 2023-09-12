package _Seção_5_Desafios_Java_Juros_Compostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
	
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("###0.00");
        
        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();
        double valorFinal = valorInicial * Math.pow((1 + taxaJuros), periodo);

        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros. 
        

        System.out.printf("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
        
    }
  
}
