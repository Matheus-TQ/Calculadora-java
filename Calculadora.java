package Aplicação;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String continuar = "S";
		System.out.println("Bem-Vindo a Calculadora java básica");
		while (continuar.equalsIgnoreCase("S")) {
		System.out.print("Qual operação vai utilizar (+, -, /, *) ?  ");
		String escolha = teclado.next();
		System.out.print("Insira o primeiro valor: ");
		int n1 = teclado.nextInt();
		System.out.print("Insira o segundo valor: ");
		int n2 = teclado.nextInt();
		
		if (escolha.equals("+")) {
			int adicao = n1 + n2;
			System.out.println("Adição = " + adicao );
			} else if (escolha.equals("-")){
				  int subtracao = n1 - n2;
				  System.out.println("Subtração = " + subtracao);
				      }	  else if (escolha.equals("*")) {
							  int multi = n1 * n2;
							  System.out.println("Multiplicação = " + multi );
						  } else if (escolha.equals("/")) {
							    if ( n2 != 0) {
							    	double resultado = (double) n1 / n2;
							    	System.out.println("Divisão = " + resultado);
							    } else {
							    	System.out.println("Erro: Divisão por zero não é permitida");
							   }
						  	   }  else {
						  				System.out.println("Operador inválido. Por favor, use (+, -, /, *) ");	
						  		}
		
			System.out.print("Deseja fazer outro calculo ? [S/N] ");
			continuar = teclado.next();
		}
		
		System.out.println("Obrigado por usar a calculadora");
		
		
		teclado.close();
	}

}
