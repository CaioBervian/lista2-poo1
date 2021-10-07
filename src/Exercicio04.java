import java.util.Scanner;

public class Exercicio04 {


	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	      int ano;
	        
	      System.out.println("Digite um ano para saber se é bissexto");
        ano = entrada.nextInt();
	        
	       
        if(ano % 400 == 0){
            System.out.println(ano + " é bissexto.");   
       } else if((ano % 4 == 0) && (ano % 100 != 0)){
            System.out.println(ano + " é bissexto.");
        } else{
            System.out.println(ano + " não é bissexto");
        }
        entrada.close();
    }
}