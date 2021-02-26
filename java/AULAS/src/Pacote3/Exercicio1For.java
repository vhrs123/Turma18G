	package Pacote3;

		//Informar todos os números de 1000 a 1999 que quando divididos por 11
		//obtemos resto = 5. (FOR)
	
	
			import java.util.Scanner;

			public class Exercicio1For
			{
				public static void main(String[] args)
			{
			Scanner ler = new Scanner(System.in); // LER A DIGITAÇÃO 
			for(int x=1000;x<=1999;x++) 
			{
			if(x%11==5)
			{	
				
			System.out.printf("%d\n",x);
			}

			}

			}
		
			}

