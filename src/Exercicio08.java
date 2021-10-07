import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		System.out.println("Introduza o valor 1:");
		Scanner entrada = new Scanner(System.in);
		float x=entrada.nextFloat();

		System.out.println("Introduza o valor 2:");
		float y=entrada.nextFloat();

		if ((x+y/2) >= 7) {
			System.out.println("Aprovado com " + ((x+y)/2));
		} else {
			System.out.println("Reprovado com " + ((x+y)/2));
		}
		entrada.close();
	}
}
