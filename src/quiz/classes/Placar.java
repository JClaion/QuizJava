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
		
		ordenarPlacar();
		
		System.out.println("Ind \t Data \t\t Pontuação \t Jogador");
		for(byte i=0; i < jogador.size(); ++i)
		{	
			System.out.println(i+1 +"\t"+ dtJogo.get(i) + "\t\t" + pontuacaoFinal.get(i) + "\t" + jogador.get(i));

		}
	}
	public void ordenarPlacar()
	{
		Integer ind = -1;
		ArrayList<Integer> ordem_Pontuaca = new ArrayList<>();
		ArrayList<String> ordem_Jogador = new ArrayList<>();
		ArrayList<LocalDate> ordem_Data = new ArrayList<>();
		ArrayList<Integer> indicesDisponiveis = new ArrayList<>();
		for(short j = 0; j<pontuacaoFinal.size(); j++)
		{
			indicesDisponiveis.add((int)j);
		}
		for(short i = 0; i<pontuacaoFinal.size(); i++) {
			for(short j = 0; j<pontuacaoFinal.size(); j++)
			{
				ind = -1;
				if(this.pontuacaoFinal.get(indicesDisponiveis.get(j)) > ind) {
					ind = (int) indicesDisponiveis.get(j);
					
					ordem_Pontuaca.add(this.pontuacaoFinal.get(ind));
					ordem_Data.add(this.dtJogo.get(ind));
					ordem_Jogador.add(this.jogador.get(ind));
					indicesDisponiveis.remove(j);
					break;
				}
			}
			
		}
		this.jogador = ordem_Jogador;
		this.pontuacaoFinal = ordem_Pontuaca;
		this.dtJogo = ordem_Data;
	}
}
