# Alura-Java-Aulas
* Aulas Iniciais do Bootcamp Alura de Java:
* Herança, Polimorfismo, Encapsulamento, Orientação a Objetos, Enum, Interfaces, Abstract;

# Topicos

* Public: O modificador public deixará visível a classe ou membro para todas as outras classes, subclasses e pacotes do projeto Java.
* Protected: O modificador protected deixará visível o atributo para todas as outras classes e subclasses que pertencem ao mesmo pacote. A principal diferença é que apenas as classes do mesmo pacote têm acesso ao membro. O pacote da subclasse não tem acesso ao membro.
* Private: O modificador private deixará visível o atributo apenas para a classe em que este atributo se encontra.
* Package-Private: É o modificador padrão quando outro não é definido. Isto torna acessível na própria classe, nas classes e subclasses do mesmo pacote. Ele geralmente é utilizado para construtores e métodos que só dever ser invocados pelas classes e subclasses do pacote, 
constantes estáticas que são úteis apenas dentro do pacote em que estive inserido

#Herença
* A herança é um mecanismo da Orientação a Objeto que permite criar novas classes a partir de classes já existentes, 
aproveitando-se das características existentes na classe a ser estendida. Este mecanismo é muito interessante, 
pois promove um grande reuso e reaproveitamento de código existente.
Com Herança, quando criamos uma Classe principal, por exemplo "Funcionario", e não queremos ficar repetindo o codigo, todas as vezes que formos criar outras classes,
que podem ser derivadas de "Funcionario", podemos utilizar a Herança, que no Java seria a palavra Reservada EXTENDS, Fazendo com que, Gerente, Administrador, Contador, Herdem os atributos da classe Funcionario.
E o mais interessante é que cada classe pode ter o seu proprio atributo ou metodo unico. 

#Polimorfismo
* De forma genérica, polimorfismo significa várias formas. No caso da Orientação a Objetos, polimorfismo denota uma situação na qual um objeto pode se comportar de maneiras diferentes ao receber uma mensagem, dependendo do seu tipo de criação.
Polimorfismo é o princípio pelo qual duas ou mais classes derivadas de uma mesma superclasse podem invocar métodos que têm a mesma identificação, assinatura, mas comportamentos distintos, especializados para cada classe derivada, usando para tanto uma referência a um objeto do tipo da superclasse.

#Encapsulamento
* Encapsulamento vem de encapsular, que em programação orientada a objetos significa separar o programa em partes, o mais isolado possível. A idéia é tornar o software mais flexível, fácil de modificar e de criar novas implementações. 
O Encapsulamento serve para controlar o acesso aos atributos e métodos de uma classe. É uma forma eficiente de proteger os dados manipulados dentro da classe, além de determinar onde esta classe poderá ser manipulada. Usamos o nível de acesso mais restritivo, private, que faça sentido para um membro particular. 
Sempre usamos private, a menos que tenhamos um bom motivo para deixá-lo com outro nível de acesso. Não devemos permitir o acesso público aos membros, exceto em caso de ser constantes. Isso porque membros públicos tendem a nos ligar a uma implementação em particular e limita a nossa flexibilidade em mudar o código. 

#Enum
* São tipos de campos que consistem em um conjunto fixo de constantes (static final), sendo como uma lista de valores pré-definidos. Na linguagem de programação Java, pode ser definido um tipo de enumeração usando a palavra chave enum.
Todos os tipos enums implicitamente estendem a classe java.lang.Enum, sendo que o Java não suporta herança múltipla, não podendo estender nenhuma outra classe.

#Interfaces
* São tipos de campos que consistem em um conjunto fixo de constantes (static final), sendo como uma lista de valores pré-definidos. Na linguagem de programação Java, pode ser definido um tipo de enumeração usando a palavra chave enum.
Todos os tipos enums implicitamente estendem a classe java.lang.Enum, sendo que o Java não suporta herança múltipla, não podendo estender nenhuma outra classe.
