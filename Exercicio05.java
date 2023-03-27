import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID: ");
		int idPecaUm = sc.nextInt();
		System.out.print("Numero de pecas: ");
		int qtdPecaUm = sc.nextInt();
		System.out.print("Valor da peca: ");
		double valorPecaUm = sc.nextDouble();
		
		System.out.println();
		
		System.out.print("ID: ");
		int idPecaDois = sc.nextInt();
		System.out.print("Numero de pecas: ");
		int qtdPecaDois = sc.nextInt();
		System.out.print("Valor da peca: ");
		double valorPecaDois = sc.nextDouble();
		
		double soma = qtdPecaUm * valorPecaUm + qtdPecaDois * valorPecaDois; 
		System.out.printf("VALOR A PAGAR: R$ %.2f", soma);

		sc.close();
	}

}
