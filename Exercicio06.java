import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		
		System.out.print("Informe o valor de A: ");
		double a = sc.nextDouble();
		System.out.print("Informe o valor de B: ");
		double b = sc.nextDouble();
		System.out.print("Informe o valor de C: ");
		double c = sc.nextDouble();
		
		double areaTriangulo = (a * c) / 2.0;
		double areaCirculo = pi * Math.pow(c, 2.0);
		double areaTrapezio = (a + b) * c / 2.0;
		double areaQuadrado = Math.pow(b, 2);
		double areaRetangulo = a * b;
		
		System.out.println();
		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

		sc.close();
	}

}
