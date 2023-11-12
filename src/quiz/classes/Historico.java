package quiz.classes;

public class Historico {
	
	private Jogador jogador;
	private Pergunta pergunta;
	private byte resposta; 
	private boolean acertou;
	
	public Historico(Jogador player, Pergunta questao, Integer Resposta){
		this.jogador = player;
		this.pergunta = questao;
		this.resposta = Resposta.byteValue();
	}
	
	
	public void registraAcerto(){
		Alternativa resp = this.pergunta.getAlternativas(this.resposta);
		this.acertou = resp.getCorreta();
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


	public byte getResposta() {
		return resposta;
	}


	public void setResposta(byte resposta) {
		this.resposta = resposta;
	}
	

}
