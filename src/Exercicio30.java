import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a quantidade (Kg) de morangos adquiridos");
		float qtdMorangos = entrada.nextInt();
		System.out.println("Informe a quantidade (Kg) de maças adquiridos");
		float qtdMacas = entrada.nextInt();
		
		float qtdKg = qtdMorangos + qtdMacas;
		float preco = 0;
		if (qtdMorangos <= 5)
			preco = qtdMorangos * (float)2.50;
		else {
			preco = qtdMorangos * (float)2.20;
		}
		if (qtdMacas <= 5)
			preco = preco + (qtdMorangos * (float)1.80);
		else {
			preco = preco + (qtdMorangos * (float)1.50);
		}
		
		if (qtdKg > 8 || preco > 25)
			preco = preco * (float)0.90;
		
		System.out.println("O valor a ser pago pelo cliente é "+preco+" R$");
		
		entrada.close();
	}

}