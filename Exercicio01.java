import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primeiro valor: ");
		int num1 = sc.nextInt();
		System.out.print("Segundo valor: ");
		int num2 = sc.nextInt();
		
		int soma = num1 + num2;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}

}
