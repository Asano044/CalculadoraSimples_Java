package exercicio2;

// Importando a classe Scanner para ter acesso a entrada de dados.
import java.util.Scanner;

public class CalculadoraSimples {
	
	public static void main(String[] args) {
		// Começo da declaração de variáveis
		Scanner input = new Scanner(System.in);
		int sinal;
		int numero1;
		int numero2;
		float resultado = 0f;
		// -- Fim da declaração de variáveis
		
		// Solicitando que o usuário forneça o tipo de operação
		System.out.println("==============================");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("==============================");		
		sinal = Integer.parseInt(input.nextLine());
		
		// Solicitando que o usuário forneça os dois números da operação
		System.out.print("Selecione o primeiro número: ");
		numero1 = Integer.parseInt(input.nextLine());
		System.out.print("Selecione o segundo número: ");
		numero2 = Integer.parseInt(input.nextLine());
		
		// Verificando qual sinal o usuário forneceu e então efetuando a operação
		switch (sinal) {
			case 1:
				resultado = numero1 + numero2;
			break;
			case 2:
				resultado = numero1 - numero2;
			break;
			case 3:
				resultado = numero1 * numero2;
			break;
			case 4:
				resultado = numero1 / numero2;
			break;
			default:
				System.out.println("Este sinal não faz parte dos oferecidos, " + 
			"forneça outro por favor.");
		}
		// Fim da operação e devolvendo o valor retornado.
		System.out.println("\nO resultado da operação é: " + resultado);
		input.close();
	}
	
}