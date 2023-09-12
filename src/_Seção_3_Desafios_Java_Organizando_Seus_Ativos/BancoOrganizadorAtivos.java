package _Se��o_3_Desafios_Java_Organizando_Seus_Ativos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BancoOrganizadorAtivos {
	
	  public static void main(String[] args) {
		  
	    Scanner scanner = new Scanner(System.in);
	    
	    ArrayList < String > ativos = new ArrayList < > ();

	    //Entrada dos tipos de ativos
	    System.out.println("Digite a quantidade de ativos que o Sr.(a) possui:");
	    int quantidadeAtivos = scanner.nextInt();

	    // Entrada dos c�digos dos ativos
	    for (int i = 0; i <= quantidadeAtivos; i++) {
	      String codigoAtivo = scanner.nextLine();
	      ativos.add(codigoAtivo);
	    }

	    //TODO: Ordenar os ativos em ordem alfab�tica.
	    Collections.sort(ativos); 

	    //TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
	    
	    
	    for (int i = 0; i <= quantidadeAtivos; i++) {
	    	System.out.println(ativos.get(i));
	    }
	    
	    scanner.close();
	    
	  }
}
