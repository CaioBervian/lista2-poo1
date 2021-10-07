import java.util.Scanner;

public class Exercicio25b {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int num = entrada.nextInt();
		if(num % 2 == 0)
			System.out.println(num+" é par!");
		else {
			System.out.println(num+" é impar!");
		}
		entrada.close();
	}

}