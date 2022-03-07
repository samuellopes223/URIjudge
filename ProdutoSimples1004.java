package iniciante;

import java.util.Scanner;

public class ProdutoSimples1004 {

	/*
	 * Leia dois valores inteiros. A seguir, calcule o produto entre estes dois
	 * valores e atribua esta opera��o � vari�vel PROD. A seguir mostre a vari�vel
	 * PROD com mensagem correspondente.
	 * 
	 * Entrada O arquivo de entrada cont�m 2 valores inteiros.
	 * 
	 * Sa�da Imprima a vari�vel PROD conforme exemplo abaixo, com um espa�o em
	 * branco antes e depois da igualdade. N�o esque�a de imprimir o fim de linha
	 * ap�s o produto, caso contr�rio seu programa apresentar� a mensagem:
	 * �Presentation Error�.
	 */
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int A = leia.nextInt();
		int B = leia.nextInt();
		
		int PROD = Math.multiplyExact(A, B);
		
		System.out.print("PROD = " + PROD + "\n");
		
		leia.close();
		
		
	}

}
