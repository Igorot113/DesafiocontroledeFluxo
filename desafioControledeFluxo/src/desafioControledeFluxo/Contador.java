package desafioControledeFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int parametro1 = terminal.nextInt();
		System.out.println("Digite outro número");
		int parametro2 = terminal.nextInt();
		
		
		try {
			contar(parametro1, parametro2);
			
		} catch (ParametrosInvalidosException e) {
			System.out.println("O paramentro 2 tem que ser maior que o paramentro 1");
		}
				terminal.close();
		}
	static void contar (int parametro1, int parametro2) throws ParametrosInvalidosException {
		int contagem = parametro2 - parametro1;
		
		for(int i = 0; i <= contagem; i++) {
			System.out.println(i);
		}
	}

	}
