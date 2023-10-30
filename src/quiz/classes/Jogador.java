package quiz.classes;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Jogador {

	private Scanner sc = new Scanner(System.in);
	
	private String nickname;
    private int pontuacaoFinal;
    private byte acertos;
    private LocalDate data;

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
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
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

    public int getPontuacaoFinal() {
        return pontuacaoFinal;
    }

    public void setPontuacaoFinal(int pontuacaoFinal) {
        this.pontuacaoFinal = pontuacaoFinal;
    }

    public byte getAcertos() {
        return acertos;
    }

    public void setAcertos(byte acertos) {
        this.acertos = acertos;
    }
}
