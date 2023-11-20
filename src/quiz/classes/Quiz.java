package quiz.classes;

import quiz.enums.Dificuldade;
import java.util.ArrayList;
import java.util.Random;
import java.time.LocalDate;

/**
 * Esta classe e a classe de controle ela e responsavel por boa parte do
 * gerenciamento de objetos do jogo
 **/

public class Quiz {

	private Jogador jogador;
	private ArrayList<Pergunta> listaPergunta;
	private int taxaAcerto;
	private int taxaErro;
	private ArrayList<Historico> repo = new ArrayList<>();
	private Placar placar = new Placar();

	public Quiz(ArrayList<Pergunta> perguntas) {
		this.listaPergunta = perguntas;
	}

	/** Este método serve para iniciar o jogo além de embaralhar as perguntas e alternativas **/
	public void SorteioPergunta() {

		// Cada quiz ao seu fim deve ser enviado ao banco de dados
		// Então a cada vez que o quiz for jogado o repo será limpado
		// para evitar acumulo de memória | Reset de algumas variaveis
		// Para manter a integridade dos dados
		repo.clear();
		this.taxaAcerto = 0;
		this.taxaErro = 0;

		ArrayList<Integer> indicesDisponiveis = new ArrayList<>();
		Random sorteia = new Random();
		Integer numeroEscolhido;
		for (int i = 0; i < listaPergunta.size(); ++i) {
			indicesDisponiveis.add(i);
		}
		for (int i = 0; i < listaPergunta.size(); ++i) {
			// Sorteia pergunta
			numeroEscolhido = (Integer) sorteia.nextInt(indicesDisponiveis.size());
			numeroEscolhido = indicesDisponiveis.get(numeroEscolhido);
			indicesDisponiveis.remove(numeroEscolhido);
			// Exibe a pergunta sorteada
			System.out.println(listaPergunta.get(numeroEscolhido).getTitulo());
			// Embaralha as alternativas
			listaPergunta.get(numeroEscolhido).embaralharAlternativas();

			byte resp = this.jogador.escolherResposta();

			if (resp == -1)
				break;
			// Já vai adicionando a resposta ao Repo(Repositorio de repostas)
			repo.add(new Historico(this.jogador, listaPergunta.get(numeroEscolhido),
					listaPergunta.get(numeroEscolhido).getOrdemSorteio().get(resp)));

			repo.get(i).registraAcerto();
			if (repo.get(i).getAcertou()) {
				System.out.println("Alternativa Correta\n");
			} else {
				// busca a resposta correta na lista de perguntas na alternativa de posição 3
				// (Sempre correta)
				System.out.println("Que pena a resposta correta era: "
						+ listaPergunta.get(numeroEscolhido).getAlternativas(2).getDescricao() + "\n");
			}
		}
		System.out.println("Sua pontuação foi de " + calcularPontuacao() + " Pontos");

		calcularTaxas((short) repo.size());

		this.taxaErro = 100 - this.taxaAcerto;

		System.out.println("Sua taxa de Acerto foi de " + this.taxaAcerto + "%");
		placar.addPlacar(jogador.getNickname(), calcularPontuacao(), LocalDate.now());
	}

	public void SorteioPergunta(Dificuldade dif) {
		// Cada quiz ao seu fim deve ser enviado ao banco de dados
		// Então a cada vez que o quiz for jogado o repo será limpado
		// para evitar acumulo de memória
		repo.clear();
		this.taxaAcerto = 0;
		this.taxaErro = 0;

		ArrayList<Integer> indicesDisponiveis = new ArrayList<>();
		Random sorteia = new Random();
		Integer numeroEscolhido;
		for (int i = 0; i < listaPergunta.size(); ++i) {
			if (dif == this.listaPergunta.get(i).getDificuldade()) {
				indicesDisponiveis.add(i);
			}
		}

		for (int i = 0; i < listaPergunta.size(); ++i) {
			// Sorteia pergunta
			numeroEscolhido = (Integer) sorteia.nextInt(indicesDisponiveis.size());
			numeroEscolhido = indicesDisponiveis.get(numeroEscolhido);
			indicesDisponiveis.remove(numeroEscolhido);
			// Exibe a pergunta sorteada
			System.out.println(listaPergunta.get(numeroEscolhido).getTitulo());
			// Embaralha as alternativas
			listaPergunta.get(numeroEscolhido).embaralharAlternativas();

			byte resp = this.jogador.escolherResposta();

			if (resp == -1)
				break;
			// Já vai adicionando a resposta ao Repo(Repositorio de repostas)
			repo.add(new Historico(this.jogador, listaPergunta.get(numeroEscolhido),
					listaPergunta.get(numeroEscolhido).getOrdemSorteio().get(resp)));

			repo.get(i).registraAcerto();
			if (repo.get(i).getAcertou()) {
				System.out.println("Alternativa Correta\n");
			} else {
				// busca a resposta correta na lista de perguntas na alternativa de posição 3
				// (Sempre correta)
				System.out.println("Que pena a resposta correta era: "
						+ listaPergunta.get(numeroEscolhido).getAlternativas(2).getDescricao() + "\n");
			}
		}
		System.out.println("Sua pontuação foi de " + calcularPontuacao() + " Pontos");

		calcularTaxas((short) repo.size());

		this.taxaErro = 100 - this.taxaAcerto;

		System.out.println("Sua taxa de Acerto foi de " + this.taxaAcerto + "%");
		placar.addPlacar(jogador.getNickname(), calcularPontuacao(), LocalDate.now());
	}

	public int calcularPontuacao() {
		int pontos = 0;
		for (int i = 0; i < this.repo.size(); ++i) {
			if (repo.get(i).getAcertou())
				pontos += this.repo.get(i).getPergunta().getPontos();
		}
		return pontos;
	}

	public void calcularTaxas(short quantidade) {
		short acertos = 0;
		for (short i = 0; i < repo.size(); i++) {
			if (repo.get(i).getAcertou())
				acertos++;
		}
		jogador.setAcertos(acertos);
		if(acertos == 0 || quantidade == 0)
			return;
		this.taxaAcerto = (int) (((double) acertos/quantidade) * 100);
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public ArrayList<Pergunta> getListaPergunta() {
		return listaPergunta;
	}

	public void setListaPergunta(ArrayList<Pergunta> listaPergunta) {
		this.listaPergunta = listaPergunta;
	}

	public int getTaxaAcerto() {
		return taxaAcerto;
	}

	public void setTaxaAcerto(int taxaAcerto) {
		this.taxaAcerto = taxaAcerto;
	}

	public int getTaxaErro() {
		return taxaErro;
	}

	public void setTaxaErro(int taxaErro) {
		this.taxaErro = taxaErro;
	}

	public ArrayList<Historico> getRepo() {
		return repo;
	}

	public void setRepo(ArrayList<Historico> repo) {
		this.repo = repo;
	}

	public Placar getPlacar() {
		return placar;
	}

	public void setPlacar(Placar placar) {
		this.placar = placar;
	}
}