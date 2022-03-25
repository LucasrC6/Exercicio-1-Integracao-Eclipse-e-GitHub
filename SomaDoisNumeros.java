import java.util.*;

class SomaDoisNumeros {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]) {
		//Titulo do exercicio
		
		System.out.println("Exercicio01: Somatório de dois números! \n");
		//Declaração de variáveis.
		int num1,num2,soma;
		
		//Leitura de dados.
		System.out.println("Digite um número");
		num1 = sc.nextInt();
		System.out.println("Digite um número");
		num2 = sc.nextInt();
		
		//Somatório dos dois numeros lidos.
		soma = num1 + num2;
		
		//Mostragem na tela
		System.out.println("A soma dos números é:" + soma);
	}
}
