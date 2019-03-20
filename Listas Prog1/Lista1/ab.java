
 import java.util.Scanner; 
 public class ab
 {
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    
    
    
    System.out.println ("Digite seu Nome") ; 
    String nome = input.nextLine();
    
    mostrarMensagem(nome);	
  }
 	// exibe uma mensagem de boas-vindas para o usuário GradeBook 
	public static void mostrarMensagem (String nome )
 		{
 		System.out.printf ( "Bem vindo, %s\n" , nome ) ; 
 	} // fim do método mostrarmensagem
 }