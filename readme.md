# Banco - Cadastro de Conta Bancária

Este projeto tem como objetivo implementar um programa em Java que simula o cadastro e operações em uma conta bancária, utilizando os conceitos de Programação Orientada a Objetos (POO). O programa permite cadastrar uma conta bancária, realizar depósitos, saques e exibir os dados atualizados da conta após cada operação.

## Requisitos do Projeto

Para cadastrar uma conta bancária, são necessários os seguintes dados:
- Número da conta
- Nome do titular da conta
- Valor de depósito inicial (opcional)

É importante ressaltar que o depósito inicial é opcional. Caso o titular não tenha dinheiro para depositar no momento de abrir a conta, o saldo inicial será zero.

Regras e funcionalidades adicionais da conta bancária:
- O número da conta é único e não pode ser alterado após a abertura da conta.
- O nome do titular pode ser alterado.
- O saldo da conta só aumenta por meio de depósitos e só diminui por meio de saques.
- Para cada saque realizado, é cobrada uma taxa de $5.00.
- A conta pode ficar com saldo negativo caso não haja saldo suficiente para realizar o saque e pagar a taxa.

## Estrutura do Projeto

O projeto é composto pelos seguintes arquivos:

- `Conta.java`: Classe que representa uma conta bancária, contendo os atributos e métodos relacionados às operações da conta.
- `Program.java`: Classe principal que contém o programa principal para interação com o usuário e execução das operações da conta bancária.

## Como Utilizar

Ao executar o programa, você será guiado por uma série de instruções para realizar as operações na conta bancária. O programa irá solicitar os dados da conta, como número da conta, nome do titular e valor de depósito inicial (caso deseje realizar um depósito inicial).

Após cadastrar a conta, você poderá realizar as seguintes operações:
- Depositar um valor na conta
- Sacar um valor da conta

Após cada operação, os dados atualizados da conta serão exibidos.

## Contribuições

Contribuições são bem-vindas! Se você encontrou algum problema, tem sugestões de melhorias ou deseja adicionar novas funcionalidades, fique à vontade para abrir uma issue ou enviar um pull request.

## Licença

Este projeto está licenciado sob a [MIT License](https://opensource.org/licenses/MIT). Sinta-se livre para utilizar, modificar e distribuir o código conforme os termos da licença.
