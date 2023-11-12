package quiz.repository;

import quiz.enums.Dificuldade;
import quiz.classes.Pergunta;
import java.util.ArrayList;

public class Repositorio {
	
	public ArrayList<Pergunta> getPerguntas() {

        ArrayList<Pergunta> perguntas = new ArrayList<>();

        perguntas.add(
                new Pergunta("Qual o operador lógico 'e' em Java?", Dificuldade.MEDIO)
                    .addAlternativa("||")
                    .addAlternativa("!")
                    .addAlternativa("&&", true)
                    .addAlternativa("+=")
            );
	    perguntas.add(
	                new Pergunta("O que é um objeto em Java?", Dificuldade.MEDIO)
	                    .addAlternativa("Uma variável")
	                    .addAlternativa("Um tipo de dado primitivo")
	                    .addAlternativa("Uma instância de uma classe", true)
	                    .addAlternativa("Um operado")
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
	    
        return perguntas;
	}
}
