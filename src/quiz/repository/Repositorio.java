package quiz.repository;

import quiz.enums.Dificuldade;
import quiz.classes.Alternativa;
import quiz.classes.Pergunta;
import java.util.ArrayList;
import java.util.Arrays;

public class Repositorio {
	
	public ArrayList<Pergunta> getPerguntas() {

        ArrayList<Pergunta> perguntas = new ArrayList<>();

        perguntas.add(
            new Pergunta("Qual o operador l�gico *e* em Java?", Dificuldade.FACIL)
                .addAlternativa("||")
                .addAlternativa("!")
                .addAlternativa("&&", true)
                .addAlternativa("+=")
        );

        perguntas.add(
            new Pergunta("O que � um objeto em Java?", Dificuldade.FACIL)
                .addAlternativa("Uma vari�vel")
                .addAlternativa("Um tipo de dado primitivo")
                .addAlternativa("Uma inst�ncia de classe", true)
                .addAlternativa("Um operador")
        );

        perguntas.add(
            new Pergunta("Para que serve o try-catch?", Dificuldade.MEDIO)
                .addAlternativa("Definir uma nova vari�vel local")
                .addAlternativa("Declarar uma nova classe")
                .addAlternativa("Capturar e tratar exce��es", true)
                .addAlternativa("Definir um novo m�todo")
        );

        return perguntas;
	}
}
