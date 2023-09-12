package aula_3_A_linguagem_�_s�_um_detalhe_Como_resolver_desafios_de_c�digo;

import java.util.Scanner;

public class Desafio {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner leitorDeEntrada = new Scanner(System.in);
		
		System.out.println("Digite o valor do seu sal�rio:");
		float valorSalario = leitorDeEntrada.nextFloat();
		System.out.println("Digite o valor do seu benef�cio:");
		float valorBeneficios = leitorDeEntrada.nextFloat();
		float valorImposto = 0;
		
		if (valorSalario >= 0 && valorSalario <= 1100) {
			// atribua a al�quota de 5% mediante o sal�rio:
			valorImposto = 0.05F * valorSalario;
		} else if (valorSalario >= 1100.01 && valorSalario <= 2500) {
			// atribua a al�quota de 10% mediante o sal�rio:
			valorImposto = 0.10F * valorSalario;
		} else {
			// atribua a al�quota de 10% mediante o sal�rio:
			valorImposto = 0.15F * valorSalario;
		}
		
		// Calcula e imprime a Sa�da (com 2 casas decimais):
		float saida = (valorSalario - valorImposto) + valorBeneficios;
		System.out.println(String.format("Sal�rio no valor de R$%.2f.", saida));
	}
	
}
