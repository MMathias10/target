package perguntas;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número para verificar se pertence à sequência de Fibonacci: ");
		int numero = sc.nextInt();

		if (fibonacci(numero)) 
			System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
		 else 
			System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
		

		sc.close();

	}

	private static boolean fibonacci(int numero) {
		if (numero == 0 || numero == 1) 
			return true;
		

		int anterior = 0;
		int atual = 1;

		while (atual < numero) {
			int proximo = anterior + atual;
			anterior = atual;
			atual = proximo;
		}

		return atual == numero;
	}

}
