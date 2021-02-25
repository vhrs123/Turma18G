package Pacote2;
import java.util.Scanner;

public class DesafioDoIF {
	static public void main ( String [] args)
	{


				//OBJETIVO
				/*
	         * 6) Elabore um sistema que dada a idade de um nadador 
	         * classifique-o em uma das seguintes categorias:
	            Infantil A = 5 a 7 anos;
	            Infantil B = 8 a 11 anos;
	            Juvenil A = 12 a 13 anos;
	            Juvenil B = 14 a 17 anos;
	            Adultos = Maiores de 18 anos;
				*/
	    	
				//INICIO
	       
	    	
	   Scanner ler = new Scanner(System.in);	// Para Ler o Numero Digitado  //
	    	
	   			//VARIAVEIS
	    int idadeNadador;  //camelCase

	    		//ENTRADAS
	       
	   System.out.println("Digite a idade do nadador: ");
	   idadeNadador= ler.nextInt();



	   			//PROCESSAMENTOS//saidas
	    if (idadeNadador < 5) //me julguem
	    {
	            //saida
	    System.out.println("Infelizmente não podemos atender!\n");
	    }
	    else if 
	    (idadeNadador <=7)
	    {
	    System.out.println("Infantil A = 5 a 7 anos\n");
	    } 
	    else if(idadeNadador <=11)
	    {
	    System.out.println("Infantil B = 8 a 11 anos\n");
	    }
	    else if(idadeNadador <=13)
	    {
	       	System.out.println("Juvenil A = 12 a 13 anos\n");
	    }
	    else if(idadeNadador <=17)
	    {
	  	System.out.println("Juvenil B = 14 a 17 anos\n");
	    }
	    else
	    {
	  	System.out.println("Adultos = Maiores de 18 anos\n");
	    }
	    		//SAIDAS
	    System.out.println("OBRIGADO, VOLTE SEMPRE!");
	    		//FIM
	    }	
}
  		//else if é se não se 
		//else se não

