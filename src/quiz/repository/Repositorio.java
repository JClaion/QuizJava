package quiz.repository;

import quiz.enums.Dificuldade;
import quiz.classes.Pergunta;
import java.util.ArrayList;

public class Repositorio {
	
	public ArrayList<Pergunta> getPerguntas() {

        ArrayList<Pergunta> perguntas = new ArrayList<>();

        perguntas.add(
                new Pergunta("Qual o operador lógico 'e' em Java?", Dificuldade.FACIL)
                    .addAlternativa("||")
                    .addAlternativa("!")
                    .addAlternativa("&&", true)
                    .addAlternativa("+=")
            );
	    perguntas.add(
	        new Pergunta("O que é um package(pacote) em Java?", Dificuldade.FACIL)
	            .addAlternativa("Um conjunto de classes relacionadas")
	            .addAlternativa("Um arquivo de código Java")
	            .addAlternativa("Uma pasta que contém arquivos de código Java", true)
	            .addAlternativa("Uma variável de instância")
	    );
	    perguntas.add(
	                new Pergunta("O que é método?", Dificuldade.FACIL)
	                    .addAlternativa("Um tipo de dado primitivo em Java")
	                    .addAlternativa("Uma variável que armazena valores")
	                    .addAlternativa("Um bloco de código que executa uma operação específica", true)
	                    .addAlternativa("Um operador de comparação")
	    );
	    perguntas.add(
	                new Pergunta("O que é um Objeto?", Dificuldade.FACIL)
	                    .addAlternativa("Um operador lógico em Java")
	                    .addAlternativa("Uma variável de tipo primitivo em Java")
	                    .addAlternativa("Uma instância de uma classe", true)
	                    .addAlternativa("Um identificador de variável")
	    ); 
	    perguntas.add(
	                new Pergunta("O que é função?", Dificuldade.FACIL)
	                    .addAlternativa("Um operador aritmético")
	                    .addAlternativa("Um tipo de dado em Java")
	                    .addAlternativa("Um bloco de código que pode ser chamado e executado", true)
	                    .addAlternativa("Um tipo de estrutura de controle em programação")
	    );
	    perguntas.add(
	                new Pergunta("O que é atributo?", Dificuldade.FACIL)
	                    .addAlternativa("Um tipo de dado primitivo")
	                    .addAlternativa("Um operador de comparação em Java")
	                    .addAlternativa("Uma variável que está associada a um objeto ou classe", true)
	                    .addAlternativa("Um identificador de método")
	    );
	    perguntas.add(
	                new Pergunta("Qual o operador lógico 'ou' em Java?", Dificuldade.FACIL)
	                    .addAlternativa("&&")
	                    .addAlternativa("!")
	                    .addAlternativa("||", true)
	                    .addAlternativa("+=")
	    );
	    perguntas.add(
	                new Pergunta("O que é o método 'main' em Java?", Dificuldade.FACIL)
	                    .addAlternativa("Uma biblioteca importada do Java")
	                    .addAlternativa("Um operador aritmético utilizado para realizar adições")
	                    .addAlternativa("Um método especial que indica o início da execução de um programa Java", true)
	                    .addAlternativa("Uma tipo de tratamento de excessões")
	    );
	    perguntas.add(
	                new Pergunta("o que é uma variavel Int?", Dificuldade.FACIL)
	                    .addAlternativa("Dado logico que pode assumir apenas dois valores, falso ou verdadeiro.")
	                    .addAlternativa("É um conjunto de caracteres dispostos em uma determinada ordem.")
	                    .addAlternativa("Caracteres numéricos inteiros.", true)
	                    .addAlternativa("Caractere unico.")
	    );
	    perguntas.add(
	                new Pergunta("o que é uma variavel Char?", Dificuldade.FACIL)
	                    .addAlternativa("Caracteres numéricos inteiros.")
	                    .addAlternativa("É um conjunto de caracteres dispostos em uma determinada ordem.")
	                    .addAlternativa("Caractere unico", true)
	                    .addAlternativa("Dado logico que pode assumir apenas dois valores, falso ou verdadeiro.")
	    );
	    perguntas.add(
	                new Pergunta("o que é uma variavel String?", Dificuldade.FACIL)
	                    .addAlternativa("Caracteres numéricos inteiros.")
	                    .addAlternativa("Caractere unico.")
	                    .addAlternativa("É um conjunto de caracteres dispostos em uma determinada ordem.", true)
	                    .addAlternativa("Dado logico que pode assumir apenas dois valores, falso ou verdadeiro.")
	    );
	    perguntas.add(
	                new Pergunta("o que é uma variavel Boolean?", Dificuldade.FACIL)
	                    .addAlternativa("Caracteres numéricos inteiros.")
	                    .addAlternativa("Caractere unico.")
	                    .addAlternativa("Dado logico que pode assumir apenas dois valores, falso ou verdadeiro.", true)
	                    .addAlternativa("É um conjunto de caracteres dispostos em uma determinada ordem.")
	    );
	    perguntas.add(
	                new Pergunta("o que é uma variavel Vetor?", Dificuldade.FACIL)
	                    .addAlternativa("Caracteres numéricos inteiros.")
	                    .addAlternativa("Dado logico que pode assumir apenas dois valores, falso ou verdadeiro.")
	                    .addAlternativa("Estrutura de dados que armazena uma coleção de elementos do mesmo tipo", true)
	                    .addAlternativa("É um conjunto de caracteres dispostos em uma determinada ordem.")
	    );
	    perguntas.add(
	                new Pergunta("Qual o operador lógico 'igual' em Java?", Dificuldade.FACIL)
	                    .addAlternativa("=")
	                    .addAlternativa("+=")
	                    .addAlternativa("==", true)
	                    .addAlternativa("!=")
	    );
	    perguntas.add(
	            new Pergunta("Como o encapsulamento é alcançado em Java?", Dificuldade.MEDIA)
	                .addAlternativa("Declarando todos os membros da classe como públicos.")
	                .addAlternativa("Declarando todos os membros da classe como privados.")
	                .addAlternativa("Usando modificadores de acesso como public, private e protected.", true)
	                .addAlternativa("Utilizando somente métodos estáticos.")
		);

		perguntas.add(
		            new Pergunta("Qual é o objetivo principal do encapsulamento em programação orientada a objetos?", Dificuldade.MEDIA)
		                .addAlternativa("Permitir o acesso direto a todos os membros da classe sem restrições.")
		                .addAlternativa("Promover o acoplamento forte entre as classes.")
		                .addAlternativa("Restringir o acesso a membros da classe, permitindo apenas acesso por métodos públicos", true)
		                .addAlternativa("Tornar todos os membros de uma classe públicos para facilitar a acessibilidade.")
		);
	
		perguntas.add(
		            new Pergunta("Quais são os modificadores de visibilidade em Java?", Dificuldade.MEDIA)
		                .addAlternativa("public, private, global, local")
		                .addAlternativa("open, closed, restricted, shared")
		                .addAlternativa("public, protected, private, default", true)
		                .addAlternativa("visible, hidden, private, public")
		);
	
		perguntas.add(
		            new Pergunta("O que é polimorfismo em Java?", Dificuldade.MEDIA)
		                .addAlternativa("Um mecanismo que permite apenas a sobrecarga de métodos.")
		                .addAlternativa("A capacidade de uma classe herdar de várias classes simultaneamente.")
		                .addAlternativa("A capacidade de uma classe fornecer uma implementação específica de um método que já está definido em sua classe base.", true)
		                .addAlternativa("Um princípio que proíbe a reutilização de código.")
		);
	
		perguntas.add(
		            new Pergunta("Ao declarar variáveis para armazenar valores decimais, quando você usaria float em vez de double?", Dificuldade.MEDIA)
		                .addAlternativa("Quando você precisa de uma representação mais precisa.")
		                .addAlternativa("Sempre, pois float é mais eficiente em termos de espaço.")
		                .addAlternativa("Quando a precisão não é crítica e o espaço de armazenamento é uma preocupação.", true)
		                .addAlternativa("Float nunca é recomendado para valores decimais em Java.")
	
		);
	
		perguntas.add(
		            new Pergunta("Qual é a diferença entre um vetor e uma matriz em Java?", Dificuldade.DIFICIL)
		                .addAlternativa("Um vetor é mais eficiente em termos de espaço de armazenamento.")
		                .addAlternativa("Um vetor armazena elementos de tipos diferentes, enquanto uma matriz armazena elementos do mesmo tipo.")
		                .addAlternativa("Um vetor é unidimensional, enquanto uma matriz pode ser bidimensional ou tridimensional.", true)
		                .addAlternativa("Uma matriz é mais eficiente em termos de acesso aos elementos.")
		);
	
		perguntas.add(
		            new Pergunta("O que é um ArrayList em Java?", Dificuldade.DIFICIL)
		                .addAlternativa("Uma estrutura de dados que armazena elementos de tipos diferentes.")
		                .addAlternativa(" Um tipo de array convencional com tamanho fixo.")
		                .addAlternativa("Uma implementação específica da classe List em Java que pode crescer dinamicamente.", true)
		                .addAlternativa("Uma classe abstrata para manipular listas encadeadas em Java.")
		);
	
		perguntas.add(
		            new Pergunta("Qual é o objetivo principal dos métodos getter e setter em Java?", Dificuldade.MEDIA)
		                .addAlternativa("Manipular elementos em uma lista.")
		                .addAlternativa("Realizar modificações em vetores.")
		                .addAlternativa("Acesso e modificação controlada dos atributos de uma classe.", true)
		                .addAlternativa("Definir construtores para uma classe.")
		);
	
		perguntas.add(
		            new Pergunta("Em uma classe Pessoa com um atributo privado nome, como você criaria um método getter para obter o valor do nome?", Dificuldade.MEDIA)
		                .addAlternativa("setNome()")
		                .addAlternativa("retrieveNome()")
		                .addAlternativa("getNome()", true)
		                .addAlternativa("returnNome()")
		);
	
		perguntas.add(
		            new Pergunta("Qual é a principal vantagem da herança em programação orientada a objetos?", Dificuldade.MEDIA)
		                .addAlternativa("Melhora o desempenho do programa.")
		                .addAlternativa("Maior encapsulamento.")
		                .addAlternativa("Redução de redundância de código.", true)
		                .addAlternativa("Facilita o polimorfismo.")
		);
		perguntas.add(
	            new Pergunta("Para que serve um bloco Try-Catch em Java?", Dificuldade.DIFICIL)
	                .addAlternativa("Definir uma nova variável local")
	                .addAlternativa("Declarar uma nova classe")
	                .addAlternativa("Capturar e tratar exceções", true)
	                .addAlternativa("Definir um novo método")
		);
	
		perguntas.add(
		    new Pergunta("Dentre essas opções, qual ocupa respectivamente o menor e maior espaço em bits?", Dificuldade.DIFICIL)
		        .addAlternativa("Int e Bit")
		        .addAlternativa("Long e Short")
		        .addAlternativa("Bit e Long", true)
		        .addAlternativa("Short e Int")
		);
	
		perguntas.add(
		            new Pergunta("Qual é a principal diferença entre um método e uma função em programação?", Dificuldade.DIFICIL)
		                .addAlternativa("Um método é uma função que retorna um valor, enquanto uma função não retorna nada.")
		                .addAlternativa("Um método é utilizado em linguagens de programação orientadas a objetos, enquanto uma função é utilizada em linguagens procedurais.")
		                .addAlternativa("Um método é uma função definida dentro de uma classe, enquanto uma função é definida fora de qualquer classe.", true)
		                .addAlternativa("Um método é sempre mais eficiente que uma função em termos de desempenho.")
		);
        return perguntas;
	}
}
