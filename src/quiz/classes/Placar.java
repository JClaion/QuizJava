package quiz.classes;

import java.time.LocalDate;
import java.util.ArrayList;

public class Placar {

	private ArrayList<String> jogador = new ArrayList<>();
	private ArrayList<Integer> pontuacaoFinal = new ArrayList<>();
	private ArrayList<LocalDate> dtJogo = new ArrayList<>();
	
	public void addPlacar(String jogador, int pontuacao, LocalDate data)
	{
		this.jogador.add(jogador);
		this.pontuacaoFinal.add(pontuacao);
		this.dtJogo.add(data);
	}
	public void mostrarDados()
	{	
		if(jogador.isEmpty()) {
			System.out.println("Placar está vazio");
			return;
		}
		for(byte i=0; i < jogador.size(); ++i)
		{
			System.out.println(i+1 +"\t"+ jogador.get(i) + "\t" + pontuacaoFinal.get(i) + "\t" + dtJogo.get(i));
		}
	}
	
}
