package Pacote2;



	import java.util.Scanner;

	public class ParouImpar
	{

	public static void main (String [] args)
	{
	
		Scanner ler = new Scanner(System.in);	// Para Ler o Numero Digitado  //
	
	int valorDigitado=0;  	//camelCase //
	
	System.out.println("Digite um Numero Positivo Por Favor :");
	valorDigitado = ler.nextInt();
	
	if (valorDigitado%2==0) 	// IF é funcao Se no Portugol //
	{
	
		System.out.println("O Número "+valorDigitado+" e par !!!");
	}
	else 
	{
		System.out.println(valorDigitado);
	}
	
	}

	}


// %d numero inteiro - tipo int //
// %s tipo String - cadeia de caracteres //
// %f tipo real - tipo double -- %.2f fazendo com duas casas //


	
	

