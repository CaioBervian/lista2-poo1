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
			System.out.println("Sexo Masculino:" + ((72.7*y)-58) + " � seu peso ideal, e voc� est� com " + peso);
			if (((72.7*y)-58) < peso) {
				System.out.println("Est� acima do peso ideal");
			} else {
				if (((72.7*y)-58) > peso) {
					System.out.println("Est� abaixo do peso ideal");
				} else {
					System.out.println("Est� igual o peso ideal");
				}
			}
			
		} else {
			if (sexo == 'F') {
			System.out.println("Sexo Feminino: " + ((62.1*y)-44.7) + " � seu peso ideal, e voc� est� com " + peso);
			if (((62.1*y)-44.7) < peso) {
				System.out.println("Est� acima do peso ideal");
			} else {
				if (((62.1*y)-44.7) > peso) {
					System.out.println("Est� abaixo do peso ideal");
				} else {
					System.out.println("Est� igual o peso ideal");
				}
			}
		} else {
			System.out.println("Sexo errado");
		}
			}
		entrada.close();
	}

}