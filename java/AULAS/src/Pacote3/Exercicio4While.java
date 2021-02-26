package Pacote3;

		//Uma empresa desenvolveu uma pesquisa para saber as características
		//psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		//era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
		//(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		//agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		//pessoas, calcule e mostre: (WHILE)

		// o número de pessoas calmas;
		// o número de mulheres nervosas;
		// o número de homens agressivos;
		// o número de outros calmos;
		// o número de pessoas nervosas com mais de 40 anos;
		// o número de pessoas calmas com menos de 18 anos.



		import java.util.Scanner;

		public class Exercicio4While {
		public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;
		int sexo ;
		int temperamento;
		int pessoas = 0;			// INTEIROS
		int contador = 0;
		int contador2 = 0;
		int contador3 = 0;
		int contador4 = 0;
		int contador5= 0;
		int contador6= 0;


		while(pessoas<=150) {
		System.out.println("Qual a sua idade?: ");
		idade = leia.nextInt();
		System.out.println("Qual o seu sexo? 1-Feminino / 2-Masculino / 3-Outros: ");
		sexo = leia.nextInt();
		System.out.println("Você se considera uma pessoa:? 1-Calma / 2-Nervosa / 3-Agressiva: ");
		temperamento = leia.nextInt();
		if(temperamento ==1) {
			contador++;
		}
		else if (temperamento == 2 && sexo == 1) {
			contador2++;
		}
		else if(temperamento == 3 && sexo == 2) {
			contador3++;
		}
		else if(temperamento == 1 && sexo == 3) {
			contador4++;
		}
		else if(idade>40 && temperamento == 2) {
			contador5++;
		}
		else if(idade<18 && temperamento == 1) {
			contador6++;
		}
		pessoas = pessoas +1;
		}
		System.out.printf("O número de pessoas calmas são: %d\n",contador);
		System.out.printf("O número de mulheres nervosas são: %d\n",contador2);
		System.out.printf("O número de homens agressivos são: %d\n",contador3);
		System.out.printf("O número de outros calmos são: %d\n",contador4);
		System.out.printf("O número de pessoas nervosas acima de 40 anos são: %d\n",contador5);
		System.out.printf("O número de pessoas calmas com menos de 18 são: %d\n",contador6);

		}
		public static String sexo(int sexo) {
		String genero = "";

		if(sexo==1) {
			genero = ("Sra.");
		}

		else if (sexo==2) {
			genero = ("Sr");

		}

		else if (sexo==3) {
			genero = ("Srx");

		}

		else {
			genero = ("N/A, Digite um sexo válido 1-Feminino / 2-Masculino / 3-Outros: ");
		}

		return genero;

		}
		public static String temperamento(int temperamento) {
		String mental = "";

		if(temperamento==1) {
			mental = ("Calma");
		}

		else if(temperamento==2) {
			mental = ("Nervosa");

		}

		else if(temperamento==3) {
			mental = ("Agressiva");

		}

		else {
			mental = ("N/A, Digite um temperamento válido 1-Calma / 2-Nervosa / 3-Agressiva: ");
		}

		return mental;

		}
		
		}