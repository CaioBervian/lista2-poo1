import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe as duas notas do aluno: ");
		float n1 = entrada.nextFloat();
		float n2 = entrada.nextFloat();

		float media = (n1 + n2) / 2;
		System.out.println("A média do aluno é: " + media);
		if (media <= 3)
			System.out.println("Reprovado");
		else {
			if (media <= 6.9)
				System.out.println("Em exame");
			else {
				System.out.println("Aprovado");
			}
		}

		entrada.close();
	}

}