import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		System.out.println("Introduza o turno que você estuda - M ou V ou N");
		Scanner entrada = new Scanner(System.in);
		char turno=entrada.next().toUpperCase().charAt(0);
		
		if (turno== 'M') {
			System.out.println("Bom dia");
			
		} else {
			if (turno == 'V') {
			System.out.println("Boa tarde");
		} else {
			if(turno == 'N') {
				System.out.println("Boa noite");
			} else {
			System.out.println("Digitou errado");
		}
			}}
		entrada.close();}}