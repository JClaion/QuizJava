package quiz.classes;

public class Historico {
	
	private Jogador jogador;
	private Pergunta pergunta;
	private byte Resposta; 
	private boolean acertou;
	private int pontuacaoPergunta;
	
	public Historico(Jogador player, Pergunta questao, Integer Resposta){
		this.jogador = player;
		this.pergunta = questao;
		this.Resposta = Resposta.byteValue();
	}
	
	
	public boolean VerificarResposta(){
		Alternativa resp = this.pergunta.getAlternativas(this.Resposta);
		this.acertou = resp.getCorreta();
		return this.acertou;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public Pergunta getPergunta() {
		return pergunta;
	}

	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}

	public boolean getAcertou() {
		return acertou;
	}

	public void setAcertou(boolean acertou) {
		this.acertou = acertou;
	}

	public int getPontuacaoPergunta() {
		return pontuacaoPergunta;
	}

	public void setPontuacaoPergunta(int pontuacaoPergunta) {
		this.pontuacaoPergunta = pontuacaoPergunta;
	}
	

}
