
## Desafio
Uma nova feature para um sistema banc�rio foi analisada pela equipe de desenvolvimento e ser� uma das tarefas a serem trabalhadas durante a sprint, como desenvolvedor da empresa voc� recebeu os requisitos para a nova implementa��o que consiste em uma solu��o algor�tmica que permita aos clientes realizarem saques em caixas eletr�nicos. No entanto, existem algumas regras a serem seguidas para garantir que um saque possa ser realizado com sucesso.

##Regras do saque:

- Cada cliente digitar� o valor do seu <font color="pink">**saldoTotal**</font> de sua conta banc�ria e o <font color="pink">**valorSaque**</font>.
- Um saque s� pode ser realizado se o <font color="pink">**saldoDisponivel**</font> na conta for igual ou superior ao valor solicitado.
- Se o saldo for suficiente, o valor solicitado deve ser subtra�do do saldo dispon�vel, indicando que o saque foi realizado.
- Se o saldo for insuficiente, o saque n�o deve ser realizado e uma mensagem adequada deve ser exibida.
	
## Entrada
A entrada consiste em dois valores inteiros que representam o total do <font color="pink">**saldo**</font> da conta e o <font color="pink">**valor**</font> do saque.

## Sa�da
Se o saque for realizado com sucesso, exibir a mensagem "<font color="pink">**Saque realizado com sucesso! Novo saldo: {saldo}**</font>", onde <font color="pink">**{saldo}**</font> � o novo saldo dispon�vel na conta.

Se o saque n�o for poss�vel devido a saldo insuficiente, exibir a mensagem "<font color="pink">**Saldo insuficiente. Saque nao realizado!**</font>"

##Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas sa�das esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos poss�veis.


| ENTRADA | SA�DA                           |
|---------|---------------------------------|
| 1000    | Saque realizado com sucesso!    |
| 200     | Novo saldo: 800                 |
| 1500    | Saldo insuficiente.             |
| 1800    | Saque nao realizado!            |
| 300     | Saque realizado com sucesso!    |
| 200     | Novo saldo: 100                 |