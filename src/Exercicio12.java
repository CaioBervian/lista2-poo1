import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Informe o sal�rio do colaborador: ");
		float sal = entrada.nextFloat();
		
		double percAumento = 0;
		if(sal <= 280)
			percAumento = 20;
		else {
			if(sal <= 700)
				percAumento = 15;
			else {
				if(sal <= 1500)
					percAumento = 10;
				else {
					percAumento = 5;
				}
			}
		}
		float aumento = sal * ((float) percAumento / 100);
		float novoSal = sal + aumento;
		System.out.println("Seu sal�rio antes do reajute era: "+sal);
		System.out.println("O percentual de aumento aplicado foi de: "+percAumento+"%");
		System.out.println("O valor do aumento �: "+aumento+"R$");
		System.out.println("O novo sal�rio �:"+novoSal+"R$");
		
		entrada.close();
	}

}