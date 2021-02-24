import java.util.Scanner;

public class EntradaSaida {
	
	public static void main ( String args []) 
	{
		Scanner ler = new Scanner(System.in); 
		int a,b,soma;
		System.out.println("Informe o Valor de A : ");
		a = ler.nextInt();
		System.out.println("Informe o Valor de B : ");
		b = ler.nextInt();
		soma = a+b;
		System.out.println(soma );
		
		// OK :)
	}
	
}
