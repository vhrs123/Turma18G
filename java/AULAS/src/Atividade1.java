import java.util.Scanner;

public class Atividade1 {
	
	public static void main ( String args []) {
		
		Scanner ler = new Scanner (System.in);
		int anos=365 ;
		int anoNasc=0;
		int meses=12;
		int diasTotais=0;
		
		anos = (anos*365);
		meses =( meses*30);  
		diasTotais = (anos*365);
		anoNasc = anos-2021;
				
		System.out.println("Digite a sua idade em Anos :");
		anos = ler.nextInt();
		System.out.println("Digite o seu Mes de Nascimento :");
		meses = ler.nextInt();
		System.out.println(" Seus dias na Terra é :" + (anos*365) );
		
		// OK :)
	}
	
}