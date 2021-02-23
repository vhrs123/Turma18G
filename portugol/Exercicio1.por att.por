programa 
{
	//variáveis
	inteiro anoNasc, mesNasc, diaNasc, anoAtual, mesAtual, diaAtual 
	inteiro idadeEmAnos, idadeEmMeses, idadeEmDias,difDias,totalEmDias
		
	
	funcao inicio()
	{
		
		
		//camelCase, nomes de variáveis de forma mais explicativa quando acrescentar palavara usar maiúscula.
		cadeia nome
			
			escreva("Digite seu nome: ")
			leia(nome)
		
			escreva("Digite o dia em que você nasceu: ")
		
			leia(diaNasc)
			escreva("Digite o mês em que você nasceu (Em algarismos): ")
		
			leia(mesNasc)
			escreva("Digite o ano em que você nasceu: ")
			leia(anoNasc)
		
			escreva("Que dia é hoje? ")
			leia(diaAtual)
		
			escreva("Em qual mês estamos? ")
			leia(mesAtual)
		
			escreva("Em que ano estamos? ")
			leia(anoAtual)

				idadeEmAnos = (anoAtual - anoNasc) * 365
				//CONVERSÃO DE ANOS -> dias
				idadeEmMeses = (mesAtual - mesNasc) * 30
				//conversão de meses -> dias
				idadeEmDias = (diaAtual - diaNasc)
				se (mesNasc > mesAtual)
		{
					difDias = (30 - diaAtual)
					idadeEmAnos = idadeEmAnos - 365
					idadeEmMeses = (mesAtual*30) - difDias
		}
						totalEmDias = idadeEmAnos + idadeEmDias + idadeEmMeses
						escreva("Sua idade em dias é: ",totalEmDias)
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1153; 
 * @PONTOS-DE-PARADA = 16;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */