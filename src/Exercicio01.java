import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
	System.out.println("Digite um número");
	float num = entrada.nextFloat();
	
	System.out.println("Digite outro número");
	float num1 = entrada.nextFloat();
	
if (num>num1) {
	System.out.println("O maior é " + num);}
if (num<num1) {
	System.out.println("O maior é " + num1);}
if (num==num1) {
		System.out.println("O números são iguais");}
	

	entrada.close();	
	}
}