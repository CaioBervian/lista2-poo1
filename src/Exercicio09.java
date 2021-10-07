import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		System.out.println("Introduza o peso");
		Scanner entrada = new Scanner(System.in);
		float peso=entrada.nextFloat();

		System.out.println("Introduza a altura:");
		float y=entrada.nextFloat();
		
		System.out.println("Introduza o sexo - M ou F");
		char sexo=entrada.next().toUpperCase().charAt(0);
		
		
		if (sexo== 'M') {
			System.out.println("Sexo Masculino:" + ((72.7*y)-58) + " é seu peso ideal, e você está com " + peso);
			if (((72.7*y)-58) < peso) {
				System.out.println("Está acima do peso ideal");
			} else {
				if (((72.7*y)-58) > peso) {
					System.out.println("Está abaixo do peso ideal");
				} else {
					System.out.println("Está igual o peso ideal");
				}
			}
			
		} else {
			if (sexo == 'F') {
			System.out.println("Sexo Feminino: " + ((62.1*y)-44.7) + " é seu peso ideal, e você está com " + peso);
			if (((62.1*y)-44.7) < peso) {
				System.out.println("Está acima do peso ideal");
			} else {
				if (((62.1*y)-44.7) > peso) {
					System.out.println("Está abaixo do peso ideal");
				} else {
					System.out.println("Está igual o peso ideal");
				}
			}
		} else {
			System.out.println("Sexo errado");
		}
			}
		entrada.close();
	}

}