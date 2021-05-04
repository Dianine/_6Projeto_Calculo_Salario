import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int NF = sc.nextInt();
		double NHT = sc.nextDouble();
		double VH = sc.nextDouble();
		
		
		double Salario =  NHT*VH;
		
		
		System.out.printf("Numero de Funcionarios: %d  ", NF);
		System.out.println();
		System.out.printf("Salario Mensal R$: %.2f%n", Salario);
		
		sc.close();
		
		

	}

}
