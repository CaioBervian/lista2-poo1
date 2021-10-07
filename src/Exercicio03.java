
import java.util.Scanner;

	public class Exercicio03 {


	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
	System.out.println("Digite F ou M");
	char valor = entrada.next().toUpperCase().charAt(0);


		
if (valor=='F') {
	System.out.println("Feminino");}
if (valor=='M') {
	System.out.println("Masculino");}

		

	entrada.close();	
	}
	}