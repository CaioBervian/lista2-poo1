import java.util.Scanner;

public class Exercicio26 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um n�mero: ");
		double num = entrada.nextDouble();
		double teste = Math.floor(num);
		if (num == teste)
			System.out.println("� inteiro!");
		else {
			System.out.println("� decimal!");
		}
		entrada.close();
	}

}