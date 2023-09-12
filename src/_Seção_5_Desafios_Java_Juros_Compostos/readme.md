
## Desafio
Imagine que voc� est� desenvolvendo um aplicativo para um banco que deseja calcular os juros compostos de um investimento. Seu objetivo � criar uma fun��o que receba tr�s par�metros: o valor inicial do investimento, a taxa de juros anual e o per�odo de tempo em anos. A fun��o deve calcular e retornar o valor final do investimento ap�s o per�odo determinado, levando em considera��o os juros compostos.
	
## Entrada
A fun��o deve receber os seguintes par�metros:

valor_inicial: um n�mero inteiro ou decimal representando o valor inicial do investimento.

taxa_juros: um n�mero decimal representando a taxa de juros anual. Por exemplo, se a taxa for de 5%, o valor passado ser� 0.05.

periodo: um n�mero inteiro representando a quantidade de anos do investimento.

## F�rmula
valorFinal = valorInicial (1 + taxaJuros) ^ periodo

## Sa�da
A fun��o deve retornar o valor final do investimento ap�s o per�odo determinado, considerando os juros compostos. O valor final deve ser arredondado para duas casas decimais.

##Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas sa�das esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos poss�veis.


| ENTRADA | SA�DA                           |
|---------|---------------------------------|
| 5000    | Valor final do investimento: R$ 7346.64   |
| 0.08    |                                 |
| 5       |                                 |
| 1000    | Valor final do investimento: R$ 1191.02   |
| 0.06    |                                 |
| 3       |                                 |
| 20000   | Valor final do investimento: R$ 29604.89  |
| 0.04    |                                 |
| 10      |                                 |