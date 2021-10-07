import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int nota = 0;
		
		
		System.out.println("Digite o gabarito");	
		System.out.println("Q1: "); 
		char resposta1 = entrada.next().toUpperCase().charAt(0);
		if (resposta1 == 'A'){
			nota += 1;	} 
		
		System.out.println("Digite o gabarito");
		System.out.println("Q2: "); 
		char resposta2 = entrada.next().toUpperCase().charAt(0);
		if (resposta2 == 'A'){
			nota += 1;	} 
		
			
		System.out.println("Digite o gabarito");
		System.out.println("Q3: "); 	
		char resposta3 = entrada.next().toUpperCase().charAt(0);
		if (resposta3 == 'B'){
			nota += 1;	} 
		
		System.out.println("Digite o gabarito");
		System.out.println("Q4: "); 	
		char resposta4 = entrada.next().toUpperCase().charAt(0);
		if (resposta4 == 'B'){
			nota += 1;	} 
		
		System.out.println("Digite o gabarito");
		System.out.println("Q5: "); 	
		char resposta5 = entrada.next().toUpperCase().charAt(0);
		if (resposta5 == 'C'){
			nota += 1;	} 
		
		System.out.println("Digite o gabarito");
		System.out.println("Q6: "); 
		char resposta6 = entrada.next().toUpperCase().charAt(0);
		if (resposta6 == 'C'){
			nota += 1;	} 
		
		System.out.println("Digite o gabarito");
		System.out.println("Q7: "); 
		char resposta7 = entrada.next().toUpperCase().charAt(0);
		if (resposta7 == 'D'){
			nota += 1;	} 
		
		System.out.println("Digite o gabarito");
		System.out.println("Q8: "); 	
		char resposta8 = entrada.next().toUpperCase().charAt(0);
		if (resposta8 == 'D'){
			nota += 1;	} 
		
		System.out.println("Digite o gabarito");
		System.out.println("Q9: "); 
		char resposta9 = entrada.next().toUpperCase().charAt(0);
		if (resposta9 == 'E'){
			nota += 1;	} 
		
		System.out.println("Digite o gabarito");
		System.out.println("Q10: "); 		
		char resposta10 = entrada.next().toUpperCase().charAt(0);
		if (resposta10 == 'E'){
			nota += 1;	} 
		
		System.out.println();
		System.out.print("Q1: " + resposta1 + " : ");
		if (resposta1 == 'A'){
			System.out.print("Correto");	} 
		else { System.out.print("Errado, resposta correta(a)");
		
		}

		System.out.println();
		System.out.print("Q2: " + resposta2 + " : ");
		if (resposta2 == 'A'){
			System.out.print("Correto");	} 
		else { System.out.print("Errado, resposta correta(a)");
		
		}
		
		System.out.println();
		System.out.print("Q3: " + resposta3 + " : ");
		if (resposta3 == 'B'){
			System.out.print("Correto");	} 
		else { System.out.print("Errado, resposta correta(b)");
		
		}
		
		System.out.println();
		System.out.print("Q4: " + resposta4 + " : ");
		if (resposta4 == 'B'){
			System.out.print("Correto");	} 
		else { System.out.print("Errado, resposta correta(b)");
		
		}
		
		System.out.println();
		System.out.print("Q5: " + resposta5 + " : ");
		if (resposta5 == 'C'){
			System.out.print("Correto");	} 
		else { System.out.print("Errado, resposta correta(c)");
		
		}
		
		System.out.println();
		System.out.print("Q6: " + resposta6 + " : ");
		if (resposta6 == 'C'){
			System.out.print("Correto");	} 
		else { System.out.print("Errado, resposta correta(c)");
		
		}
		
		System.out.println();
		System.out.print("Q7: " + resposta7 + " : ");
		if (resposta7 == 'D'){
			System.out.print("Correto");	} 
		else { System.out.print("Errado, resposta correta(d)");
		
		}
		
		System.out.println();
		System.out.print("Q8: " + resposta8 + " : ");
		if (resposta8 == 'D'){
			System.out.print("Correto");	} 
		else { System.out.print("Errado, resposta correta(d)");
		
		}
		
		System.out.println();
		System.out.print("Q9: " + resposta9 + " : ");
		if (resposta9 == 'E'){
			System.out.print("Correto");	} 
		else { System.out.print("Errado, resposta correta(e)");
		
		}
		
		System.out.println();
		System.out.print("Q10: " + resposta10 + " : ");
		if (resposta10 == 'E'){
			System.out.print("Correto");	} 
		else { System.out.print("Errado, resposta correta(e)");
		
		}
		System.out.println();
		System.out.println("Nota Final: " + nota);	
		entrada.close();
	}
	}
		
