programa

{
	//variáveis
	inteiro horaDeInicio, horaDeEncerrar, duracaoEmHoras, minutosDeInicio
	inteiro minutosDeEncerrar,duracaoEmMinutos,duracaoEmSegundos
	cadeia nome
	
	funcao inicio()
	{
		escreva("Digite seu nome: ")
		leia(nome)
		escreva("Olá, ",nome,". \nSeja bem vindo a formatura das turmas 17 e 18 da GeneratiON Brasil! \n")
		escreva("Digite somente as horas que começará o evento: ")
		leia(horaDeInicio)
		escreva("Digite os minutos em que o evento começará: ")
		leia(minutosDeInicio)
		escreva("Digite somente as horas que o evento irá acabar: ")
		leia(horaDeEncerrar)
		escreva("Digite os minutos em que o evento se encerrara: ")
		
			leia(minutosDeEncerrar)
			duracaoEmHoras = (horaDeEncerrar - horaDeInicio) * 3600
			duracaoEmMinutos = (minutosDeEncerrar - minutosDeInicio) * 60
			duracaoEmSegundos = duracaoEmHoras + duracaoEmMinutos
		
				escreva("A duração do evento sera: ",duracaoEmSegundos," segundos.")
		
		
		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 172; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */