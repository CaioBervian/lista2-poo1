import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
	System.out.println("Digite um n�mero");
	float num = entrada.nextFloat();
	
	System.out.println("Digite outro n�mero");
	float num1 = entrada.nextFloat();
	
if (num>num1) {
	System.out.println("O maior � " + num);}
if (num<num1) {
	System.out.println("O maior � " + num1);}
if (num==num1) {
		System.out.println("O n�meros s�o iguais");}
	

	entrada.close();	
	}
}