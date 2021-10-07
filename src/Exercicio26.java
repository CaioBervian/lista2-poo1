import java.util.Scanner;

public class Exercicio26 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um número: ");
		double num = entrada.nextDouble();
		double teste = Math.floor(num);
		if (num == teste)
			System.out.println("É inteiro!");
		else {
			System.out.println("É decimal!");
		}
		entrada.close();
	}

}