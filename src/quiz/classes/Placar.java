package quiz.classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Placar {

	private ArrayList<String> jogador = new ArrayList<>();
	private ArrayList<Integer> pontuacaoFinal = new ArrayList<>();
	private ArrayList<LocalDate> dtJogo = new ArrayList<>();

	public void addPlacar(String jogador, int pontuacao, LocalDate data) {
		this.jogador.add(jogador);
		this.pontuacaoFinal.add(pontuacao);
		this.dtJogo.add(data);
	}

	public void mostrarDados() {
		if (jogador.isEmpty()) {
			System.out.println("Placar está vazio");
			return;
		}
		System.out.println("Ind \t Data \t\t Pontuação \t Jogador");
		for (byte i = 0; i < jogador.size(); ++i) {
			System.out.println(i + 1 + "\t" + dtJogo.get(i) + "\t\t" + pontuacaoFinal.get(i) + "\t" + jogador.get(i));

		}
	}

	public void ordenarPlacar() {
		ArrayList<Integer> indices = new ArrayList<>();
		for (int i = 0; i < pontuacaoFinal.size(); i++) {
			indices.add(i);
		}

		Collections.sort(indices, Comparator.comparing(pontuacaoFinal::get).reversed());

		ArrayList<Integer> ordem_Pontuacao = new ArrayList<>();
		ArrayList<LocalDate> ordem_Data = new ArrayList<>();
		ArrayList<String> ordem_Jogador = new ArrayList<>();

		for (int index : indices) {
			ordem_Pontuacao.add(pontuacaoFinal.get(index));
			ordem_Data.add(dtJogo.get(index));
			ordem_Jogador.add(jogador.get(index));
		}

		this.pontuacaoFinal = ordem_Pontuacao;
		this.dtJogo = ordem_Data;
		this.jogador = ordem_Jogador;
	}
}
