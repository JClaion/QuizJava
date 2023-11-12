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

		// Criando todos os Atributos para o Quiz
		Repositorio repo = new Repositorio();
		ArrayList<Pergunta> perguntas = repo.getPerguntas();
		Quiz GameQuiz = new Quiz(perguntas);

		Jogador player = new Jogador();
		GameQuiz.setJogador(player);
		
		apresentacao();
		limpatela();

		while (true) {
			
			System.out.println("1 - Fazer login | Cadastro\n"
					+ "2 - Sair do Jogo");
			
			byte opc = -1;
			opc = (byte) tryandCatch(opc, sc);
			
			if(opc == 2)
				break;
			else if(opc != 1 && opc != 2)
			{
				System.out.println("Opção Invalida");
				continue;
			}
			System.out.println("Digite seu apelido(nickname) para continuar:");
			do {
				player.login(pegaNickname(sc));
			} while (verificarNickname(player.getNickname()));
			limpatela();
			// definições Jogador
			LocalDate dt_Jogo = LocalDate.now();
			player.setData(dt_Jogo);

			byte escolha = -1;
			while (escolha != 3) {
				escolha = menu(sc);
				if (escolha == 1) {
					limpatela();
					opcaoDif(player.getNickname());
					sc.nextLine();
					byte EscolhaDif = -1;
					while (EscolhaDif != 1 && EscolhaDif != 2) {
						EscolhaDif = (byte) tryandCatch(EscolhaDif, sc);
						if(EscolhaDif != 1 && EscolhaDif != 2) {
							sc.nextLine();
							EscolhaDif = -1;
						}
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
							System.out.println("Opção inválida");
							dif = -1;
						}

					} else {
						inicarGame();
						GameQuiz.SorteioPergunta();
					}
					temporizador(5);
					limpatela();

					if (player.jogarNovamente())
						continue;
					else
						break;
				}
				if (escolha == 2) {
					limpatela();
					GameQuiz.getPlacar().ordenarPlacar();
					GameQuiz.getPlacar().mostrarDados();
					System.out.println("\nAperte Qualquer tecla para continuar e depois aperte enter:");
					if (sc.next().length() >= -1)
						limpatela();
				}
				else {
					System.out.println("Opção invalida");
					continue;
				}
			}
		}

	}

	public static void temporizador(int tempo) {
		tempo *= 1000;
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void apresentacao() {
		System.out.print("\n\n\t\t Bem Vindo ao QuizJava \n \n" + "" + "\tFeito por:\n" + "" + "\tEinstain Duarti\n"
				+ "\tJosé Claion\n" + "\tLeander Batista\n" + "\tMatheus pantoja\n" + "\n\t\t Divirta-se :D\n");
		temporizador(5);
	}

	public static void opcaoDif(String nick) {
		System.out.println("\t\tSeja Bem Vindo " + nick + "\n" + "\t\t Vamos Iniciar o Quiz\n"
				+ " \t\t Mas antes Deseja Escolher alguma Dificuldade?\n" + "1 - SIM\n" + "2 - NÃO\n");
	}

	public static void limpatela() {
		System.out
				.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
						+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
						+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
						+ "\n\n\n\n\n\n\n");
	}

	public static String pegaNickname(Scanner sc) {
		String nickname;
		nickname = sc.next();

		boolean aprovado = verificarNickname(nickname);
		while (aprovado == true) {
			System.out
					.println("Ops... Você digitou um nome com símbolos da lista de proibição" + "\n tente novamente: ");
			nickname = sc.next();
			aprovado = verificarNickname(nickname);
		}
		return nickname;
	}

	public static boolean verificarNickname(String nickname) {
		String proibicao = "!\"#$%&'()*+,./:;<=>?@[\\]^`{|}~";
		for (short i = 0; i < nickname.length(); i++) {

			if (proibicao.contains(nickname.substring(i, i + 1))) {
				return true;
			}
		}
		return false;
	}

	public static int tryandCatch(int valor, Scanner scan) {

		while (valor == -1) {
			try {
				valor = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Ops .... tente novamente");
				valor = -1;
				scan.nextLine();
				continue;
			}
		}

		return valor;
	}

	public static void inicarGame() {
		limpatela();
		System.out.println("Inciando em 5 segundos\n Esteja pronto!!!!\n Caso queira encerrar o quiz basta apertar (x)");
		try {
			Thread.sleep(5000); // 5000 milissegundos = 5 segundos
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		limpatela();
	}

	public static byte menu(Scanner sc) {
		System.out.println("\t\t\t Quiz Java\n" + "\n\t\t\t MENU\n\n" + "\t\t 1 - Jogar\n\n" + "\t\t 2 - Ver Placar\n\n"
				+ "\t\t 3 - Sair");
		byte escolha = 0;
		escolha = sc.nextByte();

		return escolha;
	}
}
