package quiz;

import quiz.enums.Dificuldade;
import quiz.classes.*;
import quiz.repository.Repositorio;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Game {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nickname;

        //Criando todos os Atributos para o Quiz
        Repositorio repo = new Repositorio();
        ArrayList<Pergunta> perguntas = repo.getPerguntas();
        Quiz GameQuiz = new Quiz(perguntas);
       

        apresentacao();
        limpatela();
        nickname = pegaNickname(sc);

        Jogador player = new Jogador(nickname);
        GameQuiz.setJogador(player);
        //defini��es Jogador
        LocalDate dt_Jogo = LocalDate.now();
        player.setData(dt_Jogo);

        opcaoDif(nickname);
        
        byte EscolhaDif = -1;
        while(EscolhaDif != 1 && EscolhaDif != 2)
        {
        	EscolhaDif = (byte) tryandCatch(EscolhaDif, sc);
        }
        if (EscolhaDif == 1) {
            byte dif = player.escolherDificuldade();

                switch (dif) {
                    case 1:
                    	inicarGame();
                        System.out.println("Dificuldade Selecionada: " + Dificuldade.FACIL);
                        GameQuiz.SorteioPergunta(Dificuldade.FACIL);
                        break;
                    case 2:
                    	inicarGame();
                        System.out.println("Dificuldade Selecionada: " + Dificuldade.MEDIO);
                        GameQuiz.SorteioPergunta(Dificuldade.MEDIO);
                        break;
                    case 3:
                    	inicarGame();
                        System.out.println("Dificuldade Selecionada: " + Dificuldade.DIFICIL);
                        GameQuiz.SorteioPergunta(Dificuldade.DIFICIL);
                        break;
                    default:
                        System.out.println("Op��o inv�lida");
                        dif = -1;
                }
            
        } else {
        	inicarGame();
           GameQuiz.SorteioPergunta();
        }

        
    }

    public static void apresentacao() {
        System.out.print("\n\n\t\t Bem Vindo ao QuizJava \n \n"
                + ""
                + "\tFeito por:\n"
                + ""
                + "\tEinstain Duarti\n"
                + "\tJos� Claion\n"
                + "\tLeander Batista\n"
                + "\tMatheus pantoja\n"
                + "\n\t\t Divirta-se :D\n");

        try {
            Thread.sleep(5000); // 5000 milissegundos = 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void opcaoDif(String nick) {
        System.out.println("\t\tSeja Bem Vindo " + nick + "\n"
                + "\t\t Vamos Iniciar o Quiz\n"
                + " \t\t Mas antes Deseja Escolher alguma Dificuldade?\n"
                + "1 - SIM\n"
                + "2 - N�O\n");
    }
    
    public static void limpatela() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "\n\n\n\n\n\n\n");
    }

    public static String pegaNickname(Scanner sc) {
        System.out.println("Vamos come�ar, mas informe seu Nickname: ");

        String nickname = sc.next();
        boolean aprovado = verificarNickname(nickname);

        while (aprovado == true) {
            System.out.println("Ops... Voc� digitou um nome com s�mbolos da lista de proibi��o"
                    + "\n tente novamente: ");
            nickname = sc.next();
            aprovado = verificarNickname(nickname);
        }
        return nickname;
    }

    public static boolean verificarNickname(String nickname) {
        String proibicao = "!\"#$%&'()*+,./:;<=>?@[\\]^`{|}~";
        for (short i = 0; i < nickname.length() - 1; i++) {

            if (proibicao.contains(nickname.substring(i, i + 1))) {
                return true;
            }
        }
        return false;
    }
    public static int tryandCatch(int valor, Scanner scan) {
    	
    	while(valor == -1) 
    	{
    		try {
    			valor = scan.nextInt();
    		}catch(InputMismatchException e) {
    			System.out.println("Ops .... Isso n�o e um numero, tente novamente");
                valor = -1;
                scan.nextLine();
                continue;
    		}
    	}
    	
    	return valor;
    }
    public static void inicarGame() {
    	limpatela();
    	System.out.println("Inciando em 5 segundos\n Esteja pronto!!!!");
    	try {
            Thread.sleep(5000); // 5000 milissegundos = 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    	limpatela();
    }
}
