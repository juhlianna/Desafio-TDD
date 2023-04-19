# DesafioTDD

Desafio TDD

## Objetivo

Aplicar os conceitos de testes aprendidos durante a semana de estudo.

## IDE Eclipse

## Testes unitários aplicados aos exercícios

## Exercício 1

Seguindo o diagrama UML a seguir, implemente a classe Veiculo e seus
métodos. Após a implementação, testar cada um dos métodos via console.
acelerar(): este método acrescenta um valor de 20 no atributo
velocidade.
abastecer(int combustivel): recebe como parâmetro uma quantidade de
combustível e atribui a listrosCombustivel. OBS O limite do tanque de
combustível é de 60 litros, validar para não ultrapassar.
frear(): a cada chamada do método diminui a velocidade em 20. Não
aceitar a chamada do método se o veiculo estiver parado.
pintar(String cor): recebe uma cor como parâmetro e altera o atributo.
ligar(): Verifica se o veículo já se encontra ligado, caso não, liga o carro.
desligar(): Verifica se o veículo já se encontra desligado, caso não, desliga
o carro. Não permitir que desligue o veículo com (velocidade > 0).

## Exercício 2

Seguindo o diagrama UML a seguir, implemente as classes, interfaces e as saídas do programa. Após a implementação, testar cada um dos métodos via console.

## Exercício 3

Seguindo o diagrama UML, implemente as classes e exiba no console
conforme a imagem a seguir:
3.1 Usando o conceito de polimorfismo, implemente o método lvlUp(), de
forma que o Mago ao subir de nível possua um aumento maior nos
atributos Mana e Inteligência e o Guerreiro possua um aumento maior nos
atributos Vida e Força.
Implemente o método attack() de forma que siga a seguinte regra:
Mago 🧹 : ( Inteligência * Level ) + numeroRandomico( 0 até 300 ).
Guerreiro ⚔: ( Força * Level ) + numeroRandomico( 0 até 300 ).

3.2 Exiba a quantidade de Personagens criados, utilize atributo static para
implementar a solução.

## Exercício 7

Considerando os conceitos de Orientação a Objetos, crie uma classe Pai de
nome Funcionário com os seguintes atributos (nome, idade e salário) e mais
três classes Filhas Gerente, Supervisor e Vendedor). Na classe Funcionário
deve existir um método de nome bonificação que retorna o salário, nas
classes filhas deve existir o mesmo método bonificação porem com as
seguintes regras:
Para Gerente, o método bonificação deve retornar o salário + 10000.00;
Para Supervisor, o método bonificação deve retornar o salário + 5000.00;
Para Vendedor, o método bonificação deve retornar o salário + 3000.00;
Por fim, criar uma classe principal que instancie objetos de Gerente,
Supervisor e Vendedor e adicione no mínimo um valor para cada atributo e
imprima cada funcionário (Gerente, Supervisor e Vendedor) com suas devidas
bonificações.
