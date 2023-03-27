import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o valor de A: ");
		int a = sc.nextInt();
		System.out.print("Informe o valor de B: ");
		int b = sc.nextInt();
		System.out.print("Informe o valor de C: ");
		int c = sc.nextInt();
		System.out.print("Informe o valor de D: ");
		int d = sc.nextInt();
		
		int diferenca = (a * b - c * d);
		
		System.out.println("DIFERENCA = "+ diferenca);
		
		
		sc.close();
	}

}
