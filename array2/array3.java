package array2;

import java.util.Scanner;

public class array3 {

	public static void main(String[] args) {
		/* 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui */
		
		Scanner sc = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		int i, j, count = 0;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println("\nEntre com o numero: ");
				matriz[i][j] = sc.nextInt();
				if (matriz[i][j] > 10) {
					count++;
				}
			}
		}
		System.out.println("\nPossue " + count + " numeros maiores que 10.");

	}

}