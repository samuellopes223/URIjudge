package iniciante;

import java.util.Scanner;

public class ProdutoSimples1004 {

	/*
	 * Leia dois valores inteiros. A seguir, calcule o produto entre estes dois
	 * valores e atribua esta operação à variável PROD. A seguir mostre a variável
	 * PROD com mensagem correspondente.
	 * 
	 * Entrada O arquivo de entrada contém 2 valores inteiros.
	 * 
	 * Saída Imprima a variável PROD conforme exemplo abaixo, com um espaço em
	 * branco antes e depois da igualdade. Não esqueça de imprimir o fim de linha
	 * após o produto, caso contrário seu programa apresentará a mensagem:
	 * “Presentation Error”.
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
