import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		
		System.out.print("Informe o valor do raio: ");
		double r = sc.nextDouble();
		
		double areaDoCirculo = pi * Math.pow(r, 2);
		
		System.out.printf("A = %.4f", areaDoCirculo);
		
		
		sc.close();
	}

}
