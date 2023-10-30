package quiz.classes;

import quiz.enums.Dificuldade;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Quiz {

    public String nickname;
    private Jogador jogador;
    private ArrayList<Pergunta> listaPergunta;
    private int taxaAcerto;
    private int taxaErro;
    private int tempoResposta;
    private ArrayList<Historico> repo = new ArrayList<>();

    public Quiz(ArrayList<Pergunta> perguntas) {
    	this.listaPergunta = perguntas;
    }
    
    public void SorteioPergunta() {
        ArrayList<Integer> indicesDisponiveis = new ArrayList<>();
        Random sorteia = new Random();
        Integer numeroEscolhido;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < listaPergunta.size(); ++i) {
            indicesDisponiveis.add(i);
        }
        for (int i = 0; i < listaPergunta.size(); ++i) {
            numeroEscolhido = (Integer) sorteia.nextInt(indicesDisponiveis.size());
            numeroEscolhido = indicesDisponiveis.get(numeroEscolhido);
            indicesDisponiveis.remove(numeroEscolhido);
            System.out.println(listaPergunta.get(numeroEscolhido).getTitulo());
            listaPergunta.get(numeroEscolhido).embaralharAlternativas();
            //Já vai adicionando a resposta ao Repo(Repositorio de repostas)
            repo.add(
            		new Historico(this.jogador, listaPergunta.get(numeroEscolhido), 
            				listaPergunta.get(numeroEscolhido).getOrdemSorteio().get(this.jogador.escolherResposta()))
            		);
            if(repo.get(i).VerificarResposta()) {
            	System.out.println("Alternativa Correta");
            }
            else {
            	System.out.println("Que pena a resposta correta era: "+listaPergunta.get(numeroEscolhido).getAlternativas(2).getDescricao());
            }
        }
        
    }

    public void SorteioPergunta(Dificuldade dif) {
        ArrayList<Integer> indicesDisponiveis = new ArrayList<>();
        Random sorteia = new Random();
        Integer numeroEscolhido;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < listaPergunta.size(); ++i) {
            if (dif == this.listaPergunta.get(i).getDificuldade()) {
                indicesDisponiveis.add(i);
            }
            System.out.println(indicesDisponiveis.size());
        }
        for (int i = 0; i <= indicesDisponiveis.size(); ++i) {
            numeroEscolhido = (Integer) sorteia.nextInt(indicesDisponiveis.size());
            numeroEscolhido = indicesDisponiveis.get(numeroEscolhido);
            indicesDisponiveis.remove(numeroEscolhido);
            System.out.println(listaPergunta.get(numeroEscolhido).getTitulo());
            listaPergunta.get(numeroEscolhido).embaralharAlternativas();
            //Já vai adicionando a resposta ao Repo(Repositorio de repostas)
            repo.add(
            		new Historico(this.jogador, listaPergunta.get(numeroEscolhido), 
            				listaPergunta.get(numeroEscolhido).getOrdemSorteio().get(this.jogador.escolherResposta()))
            		);
            if(repo.get(i).VerificarResposta()) {
            	System.out.println("Alternativa Correta");
            }
            else {
            	System.out.println("Que pena a resposta correta era: "+listaPergunta.get(numeroEscolhido).getAlternativas(2).getDescricao());
            }
        }
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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

    public void IniciarJogo() {

    }

    public void CalcularPontuacao(ArrayList<Historico> respostas) {
        int pontos = 0;
        for (short i = 0; i < respostas.size(); i++) {
            Historico resp = respostas.get(i);
            if (resp.getAcertou()) {
                pontos += resp.getPontuacaoPergunta();
            }
        }
        jogador.setPontuacaoFinal(pontos);
    }
}