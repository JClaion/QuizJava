package quiz.classes;

import quiz.enums.Dificuldade;
import java.util.ArrayList;
import java.util.Random;
import java.time.LocalDate;
import java.util.Scanner;

public class Quiz {

    private Jogador jogador;
    private ArrayList<Pergunta> listaPergunta;
    private int taxaAcerto;
    private int taxaErro;
    private int tempoResposta;
    private ArrayList<Historico> repo = new ArrayList<>();
    private Placar placar = new Placar();

    public Quiz(ArrayList<Pergunta> perguntas) {
    	this.listaPergunta = perguntas;
    }
    
    public void SorteioPergunta() {
    	//Cada quiz ao seu fim deve ser enviado ao banco de dados
    	//Então a cada vez que o quiz for jogado o repo será limpado
    	//para evitar acumulo de memória
    	repo.clear();
        ArrayList<Integer> indicesDisponiveis = new ArrayList<>();
        Random sorteia = new Random();
        Integer numeroEscolhido;
        for (int i = 0; i < listaPergunta.size(); ++i) {
            indicesDisponiveis.add(i);
        }
        for (int i = 0; i < listaPergunta.size(); ++i) {
        	//Sorteia alternativa
            numeroEscolhido = (Integer) sorteia.nextInt(indicesDisponiveis.size());
            numeroEscolhido = indicesDisponiveis.get(numeroEscolhido);
            indicesDisponiveis.remove(numeroEscolhido);
            //Exibe a pergunta sorteada
            System.out.println(listaPergunta.get(numeroEscolhido).getTitulo());
            //Embaralha as alternativas
            listaPergunta.get(numeroEscolhido).embaralharAlternativas();
            //Já vai adicionando a resposta ao Repo(Repositorio de repostas)
            repo.add(
            		new Historico(this.jogador, listaPergunta.get(numeroEscolhido), 
            				listaPergunta.get(numeroEscolhido).getOrdemSorteio().get(this.jogador.escolherResposta()))
            		);
            if(repo.get(i).VerificarResposta()) {
            	System.out.println("Alternativa Correta\n");
            }
            else {
            	//busca a resposta correta na lista de perguntas na alternativa de posição 3 (Sempre correta)
            	System.out.println("Que pena a resposta correta era: "+listaPergunta.get(numeroEscolhido).getAlternativas(2).getDescricao()+ "\n");
            }
        }
        System.out.println("Sua pontuação foi de "+ CalcularPontuacao());
        placar.addPlacar(jogador.getNickname(), CalcularPontuacao(), LocalDate.now());
    }

    public void SorteioPergunta(Dificuldade dif) {
    	//Cada quiz ao seu fim deve ser enviado ao banco de dados
    	//Então a cada vez que o quiz for jogado o repo será limpado
    	//para evitar acumulo de memória
    	repo.clear();
    	
        ArrayList<Integer> indicesDisponiveis = new ArrayList<>();
        Random sorteia = new Random();
        Integer numeroEscolhido;
        for (int i = 0; i < listaPergunta.size(); ++i) {
            if (dif == this.listaPergunta.get(i).getDificuldade()) {
                indicesDisponiveis.add(i);
            }
        }
        for (int i = 0; i <= indicesDisponiveis.size(); ++i) {
        	//Sorteia alternativa
            numeroEscolhido = (Integer) sorteia.nextInt(indicesDisponiveis.size());
            numeroEscolhido = indicesDisponiveis.get(numeroEscolhido);
            indicesDisponiveis.remove(numeroEscolhido);
            //Exibe a pergunta sorteada
            System.out.println(listaPergunta.get(numeroEscolhido).getTitulo());
            //Embaralha as alternativas
            listaPergunta.get(numeroEscolhido).embaralharAlternativas();
            //Já vai adicionando a resposta ao Repo(Repositorio de repostas)
            repo.add(
            		new Historico(this.jogador, listaPergunta.get(numeroEscolhido), 
            				listaPergunta.get(numeroEscolhido).getOrdemSorteio().get(this.jogador.escolherResposta()))
            		);
            if(repo.get(i).VerificarResposta()) {
            	System.out.println("Alternativa Correta\n");
            }
            else {
            	//busca a resposta correta na lista de perguntas na alternativa de posição 3 (Sempre correta)
            	System.out.println("Que pena a resposta correta era: "+listaPergunta.get(numeroEscolhido).getAlternativas(2).getDescricao()+ "\n");
            }
        }
        System.out.println("Sua pontuação foi de "+ CalcularPontuacao());
        placar.addPlacar(jogador.getNickname(), CalcularPontuacao(), LocalDate.now());
    }

    public int CalcularPontuacao() {
        int pontos = 0;
        for(int i=0; i<this.repo.size(); ++i) {
        	if(this.repo.get(i).VerificarResposta())
        		pontos += this.repo.get(i).getPergunta().getPontos();
        }
        return pontos;
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

	public void IniciarJogo() {

    }
}