package array2;

/* 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados. */

	import java.util.Scanner;

	public class array2 {

		public static void main(String[] args) {
					
			Scanner sc = new Scanner(System.in);

			int vetor[] = new int[6];
			int i, soma = 0, countImp = 0;

			for (i = 0; i < 6; i++) {
				System.out.println("\nEntre com o numero: ");
				vetor[i] = sc.nextInt();
			}
			
			System.out.println("\nNumeros pares digitados:");
			for (i = 0; i < 6; i++) {
				if (vetor[i] % 2 == 0) {
					soma += vetor[i];
					System.out.println("posicao [" + i + "] = " + vetor[i]);
				}
			}
			
			System.out.println("\nNumeros impares digitados:");
			for (i = 0; i < 6; i++) {
				if (vetor[i] % 2 == 1) {
					countImp++;
					System.out.println("posicao [" + i + "] = " + vetor[i]);
				}
			}
			System.out.println("\nA soma do numeros pares difgitados: " + soma);
			System.out.println("\nA quantidade de numeros impares digitados: " + countImp);


		}

	}