package quiz.classes;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Jogador {

	private Scanner sc = new Scanner(System.in);
	
	private String nickname;
    private String senha;
    private byte acertos;
    private LocalDate dtCriacao;

    public byte escolherResposta() {
    	char resposta = '+';
	    do {
    		resposta = sc.next().charAt(0);
	        switch (resposta) {
	        
	            case '1':
	                return 0;
	            case '2':
	                return 1;
	            case '3':
	                return 2;
	            case '4':
	                return 3;
	            case 'p':
	                return -1;
	            case 'P':
	                return -1;
	            default:
	                System.out.println("Opção invalida, digite uma opção válida");
	                
	        }
	    }while(resposta != '1' && resposta != '2' && resposta != '3' && resposta != '4');
	    
        return -1;
    }
    
    public byte escolherDificuldade() {
    	
    	System.out.println("1 - Fácil\n"
                + "2 - Médio\n"
                + "3 - Difícil\n");
    	byte dif = -1;
        while (dif == -1) {
            try {
                dif = sc.nextByte();
                return dif;
            } catch (InputMismatchException e) {
                System.out.println("Ops .... Isso não e um numero, tente novamente");
                dif = -1;
                sc.nextLine();
                continue;
            }
    	
        }
    	return -1;
    }

    public void contadorAcertos(boolean acerto) {
        if (acerto == true) {
            this.acertos++;
        }
    }

    public LocalDate getData() {
        return dtCriacao;
    }

    public void setData(LocalDate data) {
        this.dtCriacao = data;
    }

    public Jogador(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public LocalDate getDtCriacao() {
		return dtCriacao;
	}

	public void setDtCriacao(LocalDate dtCriacao) {
		this.dtCriacao = dtCriacao;
	}

	public byte getAcertos() {
        return acertos;
    }

    public void setAcertos(byte acertos) {
        this.acertos = acertos;
    }
}
