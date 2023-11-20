package quiz.repository;

import quiz.enums.Dificuldade;
import quiz.classes.Pergunta;
import java.util.ArrayList;

public class Repositorio {
	
	public ArrayList<Pergunta> getPerguntas() {

        ArrayList<Pergunta> perguntas = new ArrayList<>();

        perguntas.add(
                new Pergunta("Qual o operador l�gico 'e' em Java?", Dificuldade.FACIL)
                    .addAlternativa("||")
                    .addAlternativa("!")
                    .addAlternativa("&&", true)
                    .addAlternativa("+=")
            );
	    perguntas.add(
	        new Pergunta("O que � um package(pacote) em Java?", Dificuldade.FACIL)
	            .addAlternativa("Um conjunto de classes relacionadas")
	            .addAlternativa("Um arquivo de c�digo Java")
	            .addAlternativa("Uma pasta que cont�m arquivos de c�digo Java", true)
	            .addAlternativa("Uma vari�vel de inst�ncia")
	    );
	    perguntas.add(
	                new Pergunta("O que � m�todo?", Dificuldade.FACIL)
	                    .addAlternativa("Um tipo de dado primitivo em Java")
	                    .addAlternativa("Uma vari�vel que armazena valores")
	                    .addAlternativa("Um bloco de c�digo que executa uma opera��o espec�fica", true)
	                    .addAlternativa("Um operador de compara��o")
	    );
	    perguntas.add(
	                new Pergunta("O que � um Objeto?", Dificuldade.FACIL)
	                    .addAlternativa("Um operador l�gico em Java")
	                    .addAlternativa("Uma vari�vel de tipo primitivo em Java")
	                    .addAlternativa("Uma inst�ncia de uma classe", true)
	                    .addAlternativa("Um identificador de vari�vel")
	    ); 
	    perguntas.add(
	                new Pergunta("O que � fun��o?", Dificuldade.FACIL)
	                    .addAlternativa("Um operador aritm�tico")
	                    .addAlternativa("Um tipo de dado em Java")
	                    .addAlternativa("Um bloco de c�digo que pode ser chamado e executado", true)
	                    .addAlternativa("Um tipo de estrutura de controle em programa��o")
	    );
	    perguntas.add(
	                new Pergunta("O que � atributo?", Dificuldade.FACIL)
	                    .addAlternativa("Um tipo de dado primitivo")
	                    .addAlternativa("Um operador de compara��o em Java")
	                    .addAlternativa("Uma vari�vel que est� associada a um objeto ou classe", true)
	                    .addAlternativa("Um identificador de m�todo")
	    );
	    perguntas.add(
	                new Pergunta("Qual o operador l�gico 'ou' em Java?", Dificuldade.FACIL)
	                    .addAlternativa("&&")
	                    .addAlternativa("!")
	                    .addAlternativa("||", true)
	                    .addAlternativa("+=")
	    );
	    perguntas.add(
	                new Pergunta("O que � o m�todo 'main' em Java?", Dificuldade.FACIL)
	                    .addAlternativa("Uma biblioteca importada do Java")
	                    .addAlternativa("Um operador aritm�tico utilizado para realizar adi��es")
	                    .addAlternativa("Um m�todo especial que indica o in�cio da execu��o de um programa Java", true)
	                    .addAlternativa("Uma tipo de tratamento de excess�es")
	    );
	    perguntas.add(
	                new Pergunta("o que � uma variavel Int?", Dificuldade.FACIL)
	                    .addAlternativa("Dado logico que pode assumir apenas dois valores, falso ou verdadeiro.")
	                    .addAlternativa("� um conjunto de caracteres dispostos em uma determinada ordem.")
	                    .addAlternativa("Caracteres num�ricos inteiros.", true)
	                    .addAlternativa("Caractere unico.")
	    );
	    perguntas.add(
	                new Pergunta("o que � uma variavel Char?", Dificuldade.FACIL)
	                    .addAlternativa("Caracteres num�ricos inteiros.")
	                    .addAlternativa("� um conjunto de caracteres dispostos em uma determinada ordem.")
	                    .addAlternativa("Caractere unico", true)
	                    .addAlternativa("Dado logico que pode assumir apenas dois valores, falso ou verdadeiro.")
	    );
	    perguntas.add(
	                new Pergunta("o que � uma variavel String?", Dificuldade.FACIL)
	                    .addAlternativa("Caracteres num�ricos inteiros.")
	                    .addAlternativa("Caractere unico.")
	                    .addAlternativa("� um conjunto de caracteres dispostos em uma determinada ordem.", true)
	                    .addAlternativa("Dado logico que pode assumir apenas dois valores, falso ou verdadeiro.")
	    );
	    perguntas.add(
	                new Pergunta("o que � uma variavel Boolean?", Dificuldade.FACIL)
	                    .addAlternativa("Caracteres num�ricos inteiros.")
	                    .addAlternativa("Caractere unico.")
	                    .addAlternativa("Dado logico que pode assumir apenas dois valores, falso ou verdadeiro.", true)
	                    .addAlternativa("� um conjunto de caracteres dispostos em uma determinada ordem.")
	    );
	    perguntas.add(
	                new Pergunta("o que � uma variavel Vetor?", Dificuldade.FACIL)
	                    .addAlternativa("Caracteres num�ricos inteiros.")
	                    .addAlternativa("Dado logico que pode assumir apenas dois valores, falso ou verdadeiro.")
	                    .addAlternativa("Estrutura de dados que armazena uma cole��o de elementos do mesmo tipo", true)
	                    .addAlternativa("� um conjunto de caracteres dispostos em uma determinada ordem.")
	    );
	    perguntas.add(
	                new Pergunta("Qual o operador l�gico 'igual' em Java?", Dificuldade.FACIL)
	                    .addAlternativa("=")
	                    .addAlternativa("+=")
	                    .addAlternativa("==", true)
	                    .addAlternativa("!=")
	    );
	    perguntas.add(
	            new Pergunta("Como o encapsulamento � alcan�ado em Java?", Dificuldade.MEDIA)
	                .addAlternativa("Declarando todos os membros da classe como p�blicos.")
	                .addAlternativa("Declarando todos os membros da classe como privados.")
	                .addAlternativa("Usando modificadores de acesso como public, private e protected.", true)
	                .addAlternativa("Utilizando somente m�todos est�ticos.")
		);

		perguntas.add(
		            new Pergunta("Qual � o objetivo principal do encapsulamento em programa��o orientada a objetos?", Dificuldade.MEDIA)
		                .addAlternativa("Permitir o acesso direto a todos os membros da classe sem restri��es.")
		                .addAlternativa("Promover o acoplamento forte entre as classes.")
		                .addAlternativa("Restringir o acesso a membros da classe, permitindo apenas acesso por m�todos p�blicos", true)
		                .addAlternativa("Tornar todos os membros de uma classe p�blicos para facilitar a acessibilidade.")
		);
	
		perguntas.add(
		            new Pergunta("Quais s�o os modificadores de visibilidade em Java?", Dificuldade.MEDIA)
		                .addAlternativa("public, private, global, local")
		                .addAlternativa("open, closed, restricted, shared")
		                .addAlternativa("public, protected, private, default", true)
		                .addAlternativa("visible, hidden, private, public")
		);
	
		perguntas.add(
		            new Pergunta("O que � polimorfismo em Java?", Dificuldade.MEDIA)
		                .addAlternativa("Um mecanismo que permite apenas a sobrecarga de m�todos.")
		                .addAlternativa("A capacidade de uma classe herdar de v�rias classes simultaneamente.")
		                .addAlternativa("A capacidade de uma classe fornecer uma implementa��o espec�fica de um m�todo que j� est� definido em sua classe base.", true)
		                .addAlternativa("Um princ�pio que pro�be a reutiliza��o de c�digo.")
		);
	
		perguntas.add(
		            new Pergunta("Ao declarar vari�veis para armazenar valores decimais, quando voc� usaria float em vez de double?", Dificuldade.MEDIA)
		                .addAlternativa("Quando voc� precisa de uma representa��o mais precisa.")
		                .addAlternativa("Sempre, pois float � mais eficiente em termos de espa�o.")
		                .addAlternativa("Quando a precis�o n�o � cr�tica e o espa�o de armazenamento � uma preocupa��o.", true)
		                .addAlternativa("Float nunca � recomendado para valores decimais em Java.")
	
		);
	
		perguntas.add(
		            new Pergunta("Qual � a diferen�a entre um vetor e uma matriz em Java?", Dificuldade.DIFICIL)
		                .addAlternativa("Um vetor � mais eficiente em termos de espa�o de armazenamento.")
		                .addAlternativa("Um vetor armazena elementos de tipos diferentes, enquanto uma matriz armazena elementos do mesmo tipo.")
		                .addAlternativa("Um vetor � unidimensional, enquanto uma matriz pode ser bidimensional ou tridimensional.", true)
		                .addAlternativa("Uma matriz � mais eficiente em termos de acesso aos elementos.")
		);
	
		perguntas.add(
		            new Pergunta("O que � um ArrayList em Java?", Dificuldade.DIFICIL)
		                .addAlternativa("Uma estrutura de dados que armazena elementos de tipos diferentes.")
		                .addAlternativa(" Um tipo de array convencional com tamanho fixo.")
		                .addAlternativa("Uma implementa��o espec�fica da classe List em Java que pode crescer dinamicamente.", true)
		                .addAlternativa("Uma classe abstrata para manipular listas encadeadas em Java.")
		);
	
		perguntas.add(
		            new Pergunta("Qual � o objetivo principal dos m�todos getter e setter em Java?", Dificuldade.MEDIA)
		                .addAlternativa("Manipular elementos em uma lista.")
		                .addAlternativa("Realizar modifica��es em vetores.")
		                .addAlternativa("Acesso e modifica��o controlada dos atributos de uma classe.", true)
		                .addAlternativa("Definir construtores para uma classe.")
		);
	
		perguntas.add(
		            new Pergunta("Em uma classe Pessoa com um atributo privado nome, como voc� criaria um m�todo getter para obter o valor do nome?", Dificuldade.MEDIA)
		                .addAlternativa("setNome()")
		                .addAlternativa("retrieveNome()")
		                .addAlternativa("getNome()", true)
		                .addAlternativa("returnNome()")
		);
	
		perguntas.add(
		            new Pergunta("Qual � a principal vantagem da heran�a em programa��o orientada a objetos?", Dificuldade.MEDIA)
		                .addAlternativa("Melhora o desempenho do programa.")
		                .addAlternativa("Maior encapsulamento.")
		                .addAlternativa("Redu��o de redund�ncia de c�digo.", true)
		                .addAlternativa("Facilita o polimorfismo.")
		);
		perguntas.add(
	            new Pergunta("Para que serve um bloco Try-Catch em Java?", Dificuldade.DIFICIL)
	                .addAlternativa("Definir uma nova vari�vel local")
	                .addAlternativa("Declarar uma nova classe")
	                .addAlternativa("Capturar e tratar exce��es", true)
	                .addAlternativa("Definir um novo m�todo")
		);
	
		perguntas.add(
		    new Pergunta("Dentre essas op��es, qual ocupa respectivamente o menor e maior espa�o em bits?", Dificuldade.DIFICIL)
		        .addAlternativa("Int e Bit")
		        .addAlternativa("Long e Short")
		        .addAlternativa("Bit e Long", true)
		        .addAlternativa("Short e Int")
		);
	
		perguntas.add(
		            new Pergunta("Qual � a principal diferen�a entre um m�todo e uma fun��o em programa��o?", Dificuldade.DIFICIL)
		                .addAlternativa("Um m�todo � uma fun��o que retorna um valor, enquanto uma fun��o n�o retorna nada.")
		                .addAlternativa("Um m�todo � utilizado em linguagens de programa��o orientadas a objetos, enquanto uma fun��o � utilizada em linguagens procedurais.")
		                .addAlternativa("Um m�todo � uma fun��o definida dentro de uma classe, enquanto uma fun��o � definida fora de qualquer classe.", true)
		                .addAlternativa("Um m�todo � sempre mais eficiente que uma fun��o em termos de desempenho.")
		);
        return perguntas;
	}
}
