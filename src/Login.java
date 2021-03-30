	import java.util.Scanner;

	public class Login {


	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        
	        System.out.println("Login> ");
	        String login = in.nextLine();
	        
	        System.out.println("Senha> ");
	        String senha = in.nextLine();
	        
	        if(login.equals("Andre") && senha.equals("andreschwab")){
	            System.out.printf("Usuário %s conectado, login realizado com sucesso.", login);
	        }else{
	            System.out.println("Login inválido, tente novamente.");
	        }
	    }
	}

