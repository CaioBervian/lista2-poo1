import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		System.out.println("Introduza o valor 1:");
		Scanner entrada = new Scanner(System.in);
		int x=entrada.nextInt();

		System.out.println("Introduza o valor 2:");
		int y=entrada.nextInt();
		System.out.println("Introduza o valor 3:");
		int z=entrada.nextInt();
		
		if( ( x > y && x > z ) && ( y > z ) ) { 
		    System.out.println(x);
		    System.out.println(y);
		    System.out.println(z);
		}
		else if( ( x > y && x > z ) && ( z > y ) ) { 
		    System.out.println(x);
		    System.out.println(z);
		    System.out.println(y);
		}
		else if( ( y > x && y > z ) && ( x > z ) ) { 
		    System.out.println(y);
		    System.out.println(x);
		    System.out.println(z);
		}
		else if( ( y > x && y > z ) && ( z > x ) ) { 
		    System.out.println(y);
		    System.out.println(z);
		    System.out.println(x);
		}
		else if( ( z > x && z > y ) && ( x > y ) ) { 
		    System.out.println(z);
		    System.out.println(x);
		    System.out.println(y);
		}
		else if( ( z > x && z > y ) && ( y > x ) ) { 
		    System.out.println(z);
		    System.out.println(y);
		    System.out.println(x);
		}
entrada.close();
}}