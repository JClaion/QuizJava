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
	            case 'x':
	                return -1;
	            case 'X':
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
    
    public boolean jogarNovamente() {
    	
    	System.out.println("Deseja jogar novamente?\n"
    			+ "1 - Sim\n"
    			+ "2 - Não");
    	byte opcao = -1;
        while (opcao == -1) {
            try {
                opcao = sc.nextByte();
                
            } catch (InputMismatchException e) {
            	
                System.out.println("Ops .... Isso não e um numero, tente novamente");
                opcao = -1;
                sc.nextLine();
                continue;
            }
            if(opcao == 1)
            	return true;
            else if(opcao == 2)
            	return false;
            else
            {
            	System.out.println("Opção invalida.");
            	continue;
            }
    	
        }
    	return false;
    }

    public void contadorAcertos(boolean acerto) {
        if (acerto == true) {
            this.acertos++;
        }
    }
    
    public void login(String apelido){
    	
    	if(this.nickname == null)
    	{
    		this.nickname = apelido;
    	}
    	else {
    		
    		while(this.nickname.equals(apelido)) 
    		{
    			System.out.println("Seja bem vindo de volta "
    		+ this.nickname +"\nDigite sua senha:");
    			String senha;
    			//limpa buffer
    			sc.nextLine();
    			senha = sc.nextLine();
    			if(this.senha.equals(senha)) {
    				return;
    			}
    			while(!this.senha.equals(senha))
    			{
    				System.out.println("Senha incorreta | Caso queira sair digite (Sair)\n"
    						+ "digite novamente:");
    				senha = sc.nextLine();
    				if(senha.equalsIgnoreCase("sair"))
    				{
    					System.out.println("Digite um novo nickname:");
    					apelido = sc.next();
    					break;
    				}
    				if(this.senha.equals(senha))
    					return;
    			}
    		}
    		
    	}
    	//if(verificarConta) campo dedicado para verificar existencia da conta
    	
    	//else campo para caso o usuário não tenha conta
    	
    	// Como no caso a conta do usuário e deletada a cada jogo não e possivel realizar tais verificações
    	// desta forma iremos apenas solicitar o apelido
    	
    	byte opcao = -1;
    	
    	System.out.println("Conta inexistente\n Deseja criar uma conta com esse apelido?\n"
    			+ "1 - Sim\n"
    			+ "2 - Não");
	    while(opcao != 1)
	    {
	    	
    		try {
	    		
	    		opcao = sc.nextByte();
	    		
	    	}catch(InputMismatchException e) {
	    		
	    		System.out.println("Ops .... Isso não e um numero, tente novamente");
	    		opcao = -1;
	    		sc.nextLine();
	    		continue;
	    	}
    		if(opcao == 1)
    		{
    			this.nickname = apelido;
    			System.out.println("Crie uma senha com 8 digitos:");
    			String senha;
    			//limpando buffer
    			sc.nextLine();
    			senha = sc.nextLine();
    			while(senha.length() < 8)
    			{
    				System.out.println("Sua senha e menor que 8 digitos tente novamente");
    				senha = sc.nextLine();
    			}
    			this.senha = senha;
    		}
    		else if(opcao == 2)
    		{
    			System.out.println("Digite o novo nickname: ");
    			apelido = sc.next();
    			if(this.nickname.equals(apelido))
    			{
    				login(this.nickname);
    				return;
    			}
    			else
    				this.nickname = apelido;
    			
    			System.out.println("Deseja criar uma conta com esse apelido?\n"
    					+"1 - Sim\n"
    					+"2 - Não");
    			
    			continue;
    		}
    		else
    		{
    			System.out.println("Opção invalida");
    			continue;
    		}
	    }
    	
    }
    
    public LocalDate getData() {
        return dtCriacao;
    }

    public void setData(LocalDate data) {
        this.dtCriacao = data;
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
