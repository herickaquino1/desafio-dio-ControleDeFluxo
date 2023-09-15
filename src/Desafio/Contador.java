package Desafio;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Digite o primeiro par�metro");
		int parametroUm = sca.nextInt();
		System.out.println("Digite o segundo par�metro");
		int parametroDois = sca.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo par�metro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroDois < parametroUm) {
			throw new ParametrosInvalidosException();
			
		}else {
			int contagem = parametroDois - parametroUm;
			for(int indice = 1; indice <= contagem; indice++) {
				System.out.println("imprimindo numero: "+indice);
			}
		}
		
		
	}

}
