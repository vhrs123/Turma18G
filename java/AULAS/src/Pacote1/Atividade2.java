package Pacote1;
import java.util.Scanner;

public class Atividade2 {
	public static void main (String []args) {
		
		Scanner ler = new Scanner(System.in);
		
		int  dias, anos, meses,diasResultado;

		System.out.println(" Digite a sua idade em dias :");
		dias = ler.nextInt();
	
		anos = ( dias / 365 ) ;
		meses = ( dias% 365) / 30;
		diasResultado= ( ( dias % 365 ) % 30 );

		System.out.println(" Idade expressa em Anos : " +  anos+" anos "+meses+" meses  "+diasResultado+" dias");
		// OK :)	
		
	}
	
}
