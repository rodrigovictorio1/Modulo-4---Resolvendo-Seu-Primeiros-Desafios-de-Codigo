
## Desafio
Uma nova feature para um sistema bancário foi analisada pela equipe de desenvolvimento e será uma das tarefas a serem trabalhadas durante a sprint, como desenvolvedor da empresa você recebeu os requisitos para a nova implementação que consiste em uma solução algorítmica que permita aos clientes realizarem saques em caixas eletrônicos. No entanto, existem algumas regras a serem seguidas para garantir que um saque possa ser realizado com sucesso.

##Regras do saque:

- Cada cliente digitará o valor do seu <font color="pink">**saldoTotal**</font> de sua conta bancária e o <font color="pink">**valorSaque**</font>.
- Um saque só pode ser realizado se o <font color="pink">**saldoDisponivel**</font> na conta for igual ou superior ao valor solicitado.
- Se o saldo for suficiente, o valor solicitado deve ser subtraído do saldo disponível, indicando que o saque foi realizado.
- Se o saldo for insuficiente, o saque não deve ser realizado e uma mensagem adequada deve ser exibida.
	
## Entrada
A entrada consiste em dois valores inteiros que representam o total do <font color="pink">**saldo**</font> da conta e o <font color="pink">**valor**</font> do saque.

## Saída
Se o saque for realizado com sucesso, exibir a mensagem "<font color="pink">**Saque realizado com sucesso! Novo saldo: {saldo}**</font>", onde <font color="pink">**{saldo}**</font> é o novo saldo disponível na conta.

Se o saque não for possível devido a saldo insuficiente, exibir a mensagem "<font color="pink">**Saldo insuficiente. Saque nao realizado!**</font>"

##Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.


| ENTRADA | SAÍDA                           |
|---------|---------------------------------|
| 1000    | Saque realizado com sucesso!    |
| 200     | Novo saldo: 800                 |
| 1500    | Saldo insuficiente.             |
| 1800    | Saque nao realizado!            |
| 300     | Saque realizado com sucesso!    |
| 200     | Novo saldo: 100                 |