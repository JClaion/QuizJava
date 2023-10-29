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
            new Pergunta("Qual o operador lógico *e* em Java?", Dificuldade.FACIL)
                .addAlternativa("||")
                .addAlternativa("!")
                .addAlternativa("&&", true)
                .addAlternativa("+=")
        );

        perguntas.add(
            new Pergunta("O que é um objeto em Java?", Dificuldade.FACIL)
                .addAlternativa("Uma variável")
                .addAlternativa("Um tipo de dado primitivo")
                .addAlternativa("Uma instância de classe", true)
                .addAlternativa("Um operador")
        );

        perguntas.add(
            new Pergunta("Para que serve o try-catch?", Dificuldade.MEDIO)
                .addAlternativa("Definir uma nova variável local")
                .addAlternativa("Declarar uma nova classe")
                .addAlternativa("Capturar e tratar exceções", true)
                .addAlternativa("Definir um novo método")
        );

        return perguntas;
	}
}
