	package Pacote;

	import java.util.Scanner;

	public class ExercicioUM {

	static public void main ( String []args) 
	{
			//1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.//
		
	Scanner ler = new Scanner (System.in); //Ler o Numero Digitado //
		
	int primeiroNumero = 0;
	int segundoNumero = 0;		//camelCase
	int terceiroNumero = 0;
		
	System.out.print("Ol� Seja Bem Vindo Digite o Primeiro Numero : ");
	primeiroNumero = ler.nextInt();
		
	System.out.print("Ol� Seja Bem Vindo Digite o Segundo Numero : ");
	segundoNumero = ler.nextInt();
		
	System.out.print("Ol� Seja Bem Vindo Digite o Terceiro Numero : ");
	terceiroNumero = ler.nextInt();
		
	
	if ((primeiroNumero > segundoNumero) && (primeiroNumero > terceiroNumero))
	{
	System.out.print("O Maior Numero �,"+primeiroNumero);
	}
					
	else if  (( segundoNumero > primeiroNumero) && (segundoNumero >terceiroNumero))
	{
	System.out.print("O Maior Numero �,"+segundoNumero);
	}
				
	else if (( terceiroNumero > segundoNumero) && ( terceiroNumero >primeiroNumero))
	{
	System.out.print("O Maior Numero �,"+terceiroNumero);
	}
			
				
			
	}
	
	}
	
	
