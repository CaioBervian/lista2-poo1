import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		System.out.println("Introduza o valor 1:");
		Scanner entrada = new Scanner(System.in);
		int x=entrada.nextInt();

		System.out.println("Introduza o valor 2:");
		int y=entrada.nextInt();
		System.out.println("Introduza o valor 3:");
		int z=entrada.nextInt();
		
		if( ( x > y && x > z ) && ( y > z ) ) { 
		    System.out.println(x + " � o maior");
		    System.out.println(z + " � o menor");
		}
		else if( ( x > y && x > z ) && ( z > y ) ) { 
		    System.out.println(x + " � o maior");
		    System.out.println(y + " � o menor");
		}
		else if( ( y > x && y > z ) && ( x > z ) ) { 
		    System.out.println(y + " � o maior");
		    System.out.println(z + " � o menor");
		}
		else if( ( y > x && y > z ) && ( z > x ) ) { 
		    System.out.println(y + " � o maior");
		    System.out.println(x + " � o menor");
		}
		else if( ( z > x && z > y ) && ( x > y ) ) { 
		    System.out.println(z + " � o maior");
		    System.out.println(y + " � o menor");
		}
		else if( ( z > x && z > y ) && ( y > x ) ) { 
		    System.out.println(z + " � o maior");
		    System.out.println(x + " � o menor");
		}
entrada.close();
}}