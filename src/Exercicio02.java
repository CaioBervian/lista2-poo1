import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
	System.out.println("Digite um número");
	float num = entrada.nextFloat();
	

	
if (num>0) {
	System.out.println("é positivo");}
if (num<0) {
	System.out.println("é negativo");}
if (num==0) {
		System.out.println("Zero");}
	

	entrada.close();	
	}
}