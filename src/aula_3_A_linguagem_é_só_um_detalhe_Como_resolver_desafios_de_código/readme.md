
## Desafio

Fa�a um programa que calcule e imprima o sal�rio a ser transferido para o funcion�rio.

Para realizar o c�lculo receba o valor bruto do sal�rio e o adicional dos benef�cios.
O sal�rio a ser transferido � calculado da seguinte maneira:

(**valor bruto do sal�rio - percentual de imposto mediante ao sal�rio**) + **adicional dos benef�cios**

Para calcular o **percentual de imposto** segue as al�quotas:

	- De R$0.00 a R$1100.00 = 5,00%
	- De R$1100.01 a R$2500.00 = 10,00%
	- Maior que R$2500.00 = 15,00%
	
## Entrada
A entrada consiste em v�rios arquivos de teste, que conter� o **valor bruto do sal�rio** e **adicional dos benef�cios**. Conforme mostrado no exemplo de entrada a seguir.

## Sa�da
Para cada arquivo da entrada, ter� um arquivo de sa�da. E como mencionado no Desafio, ser� gerado uma linha com um n�mero que ser� a diferen�a entre o valor bruto do sal�rio e o percentual de imposto mediante a faixa salarial somando com o adicional dos benef�cios. Use o exemplo abaixo para clarear o que est� sendo pedido.


| ENTRADA | SA�DA |
|---------|-------|
| 2000    |2050.00|
| 250     |       |