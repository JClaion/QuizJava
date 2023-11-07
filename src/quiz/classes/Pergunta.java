package quiz.classes;

import quiz.enums.Dificuldade;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pergunta {
	
	private String titulo;
    private List<Alternativa> alternativas = new ArrayList<>();
    private ArrayList<Integer> ordemSorteio = new ArrayList<>();
    private int pontos;
    private Dificuldade dificuldade;

    public Pergunta(String titulo, Dificuldade dificuldade) {
        this.titulo = titulo;
        this.dificuldade = dificuldade;
        if (dificuldade == Dificuldade.FACIL) this.pontos = 5;
        if (dificuldade == Dificuldade.MEDIO) this.pontos = 10;
        if (dificuldade == Dificuldade.DIFICIL) this.pontos = 15;
    }
    
    public Pergunta addAlternativa(String descricao) {
        this.alternativas.add(new Alternativa(descricao));
        return this;
    }
    public Pergunta addAlternativa(String descricao, boolean correta) {
        this.alternativas.add(new Alternativa(descricao, correta));            
        return this;
    }

    public void embaralharAlternativas() {
    	//Limpa a ordemSorteio para novas rodadas
    	this.ordemSorteio.clear();
    	
    	ArrayList<Integer> indicesDisponiveis = new ArrayList<>();

        Random sorteia = new Random();
        Integer numeroEscolhido;

        for (int i = 0; i < alternativas.size(); i++) {
            indicesDisponiveis.add(i);
        }
        for (int i = 0; i < alternativas.size(); i++) {
            numeroEscolhido = (Integer) sorteia.nextInt(indicesDisponiveis.size());
            numeroEscolhido = indicesDisponiveis.get(numeroEscolhido);
            this.ordemSorteio.add((int) numeroEscolhido);
            indicesDisponiveis.remove(numeroEscolhido);
            System.out.print(i+1 + " - ");
            System.out.println(alternativas.get(numeroEscolhido).getDescricao());
        }
    }

    public Dificuldade getDificuldade() {
        return this.dificuldade;
    }

    public void setDificuldade(Dificuldade dificuldade) {
        this.dificuldade = dificuldade;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontuacao) {
        this.pontos = pontuacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String texto) {
        this.titulo = texto;
    }

    public Alternativa getAlternativas(int pos) {
        return alternativas.get(pos);
    }

    public void setAlternativas(List<Alternativa> alternativas) {
        this.alternativas = alternativas;
    }

	public ArrayList<Integer> getOrdemSorteio() {
		return this.ordemSorteio;
	}

	public void setOrdemSorteio(ArrayList<Integer> ordemSorteio) {
		this.ordemSorteio = ordemSorteio;
	}
	
}
