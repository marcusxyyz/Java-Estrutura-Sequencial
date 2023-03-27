import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o ID do funcionario: ");
		int idFuncionario = sc.nextInt();
		System.out.print("Horas trabalhadas: ");
		double horasTrabalhadas = sc.nextDouble();
		System.out.print("Valor recebido por hora: ");
		double valorPorHora = sc.nextDouble();
		
		double salario = horasTrabalhadas * valorPorHora;
		
		System.out.println("NUMBER = " + idFuncionario);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		
		sc.close();
	}

}
