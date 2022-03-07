package iniciante;

import java.util.Scanner;

/*Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. 
		A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. 
		Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
		
		Entrada
		O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).
		
		Saída
		Imprima a variável MEDIA conforme exemplo abaixo, com 1 dígito após o ponto decimal 
		e com um espaço em branco antes e depois da igualdade. 
		Assim como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".*/

public class MediaDois1006 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		double A = leia.nextDouble();
		double B = leia.nextDouble();
		double C = leia.nextDouble();
		
		if ( A>=0 && A<=10 && B>=0 && B<=10 && C>=0 && C<=10) {
			A = 2 * A;
			B = 3 * B;
			C = 5 * C;

		double MEDIA = (A+B+C)/10;

		System.out.printf("MEDIA = %.1f%n", MEDIA);

		
		leia.close();	

		} 
					
	}

}
