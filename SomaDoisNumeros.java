import java.util.*;

class SomaDoisNumeros {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]) {
		//Titulo do exercicio
		
		System.out.println("Exercicio01: Somat�rio de dois n�meros! \n");
		//Declara��o de vari�veis.
		int num1,num2,soma;
		
		//Leitura de dados.
		System.out.println("Digite um n�mero");
		num1 = sc.nextInt();
		System.out.println("Digite um n�mero");
		num2 = sc.nextInt();
		
		//Somat�rio dos dois numeros lidos.
		soma = num1 + num2;
		
		//Mostragem na tela
		System.out.println("A soma dos n�meros �:" + soma);
	}
}
