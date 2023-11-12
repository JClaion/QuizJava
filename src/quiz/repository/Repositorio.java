package quiz.repository;

import quiz.enums.Dificuldade;
import quiz.classes.Pergunta;
import java.util.ArrayList;

public class Repositorio {
	
	public ArrayList<Pergunta> getPerguntas() {

        ArrayList<Pergunta> perguntas = new ArrayList<>();

        perguntas.add(
                new Pergunta("Qual o operador l�gico 'e' em Java?", Dificuldade.MEDIO)
                    .addAlternativa("||")
                    .addAlternativa("!")
                    .addAlternativa("&&", true)
                    .addAlternativa("+=")
            );
	    perguntas.add(
	                new Pergunta("O que � um objeto em Java?", Dificuldade.MEDIO)
	                    .addAlternativa("Uma vari�vel")
	                    .addAlternativa("Um tipo de dado primitivo")
	                    .addAlternativa("Uma inst�ncia de uma classe", true)
	                    .addAlternativa("Um operado")
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
	    
        return perguntas;
	}
}
