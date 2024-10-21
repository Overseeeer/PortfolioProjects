programa
{
	
	funcao inicio()
	{

		logico sim
		inteiro menu, pos, cont, atualizar
		inteiro codProd[5], qtdProd[5]
		cadeia cadProd[5]

			//--------------------------//

		escreva("Bem-vindo(a) à nossa loja Premier Auto! Digite o número da sua escolha abaixo: \n\n")

			//--------------------------//
		
		escreva("'1' para cadastrar um carro novo\n")
		escreva("'2' para exibir o estoque atualizado\n")
		escreva("'3' para atualizar o estoque de um carro\n")
		escreva("'4' para mostrar o relatório do estoque atual\n")
		escreva("'5' para sair do programa\n")
		leia(menu)
		limpa()

			//--------------------------//

		escreva("\n")
		escolha (menu)
			{caso 1:
				escreva("Digite quais carros você quer cadastrar: \n")
				leia(cadProd[0], cadProd[1], cadProd[2], cadProd[3], cadProd[4])
				escreva("Agora digite o código dos respectivos carros: \n")
				leia(codProd[0], codProd[1], codProd[2], codProd[3], codProd[4])
				escreva("Digite o estoque do carro: \n")
				leia(qtdProd[0], qtdProd[1], qtdProd[2], qtdProd[3], qtdProd[4])
				//--
				escreva("Esses são os carros cadastrados: \n")
				para(cont=0; cont<=4; cont++){
					escreva("\n", cadProd[cont], ", código = ", codProd[cont], ", quantidade = ", qtdProd[cont], "\n")
					
				}
				escreva("\n")
				
				escreva("'1' para cadastrar um carro novo\n")
				escreva("'2' para exibir o estoque atualizado\n")
				escreva("'3' para atualizar o estoque de um carro\n")
				escreva("'4' para mostrar o relatório do estoque atual\n")
				escreva("'5' para sair do programa\n")
				leia(menu)
				limpa()

				//--
			caso 2:
				escreva("\nEste é o estoque atual: \n")

				para(cont=0; cont<=4; cont++){
					escreva(qtdProd[cont], " - ", cadProd[cont], "\n")
				}
				escreva("\n")
				
				escreva("'1' para cadastrar um carro novo\n")
				escreva("'2' para exibir o estoque atualizado\n")
				escreva("'3' para atualizar o estoque de um carro\n")
				escreva("'4' para mostrar o relatório do estoque atual\n")
				escreva("'5' para sair do programa\n")
				leia(menu)
				limpa()

				//--
			caso 3:
				escreva("Qual estoque você deseja atualizar? \n")
				leia(atualizar)
				
				pos = 0

				enquanto((pos<2) e (codProd[pos] != atualizar)){
					pos++
				}
				se(codProd[pos] == atualizar){
					escreva("O carro ", cadProd[pos], " foi encontrado! ", "Qtd: ", qtdProd[pos], "\n\n")
					escreva("Digite a quantidade correta: ")
					leia(qtdProd[pos])

					escreva("Agora a nova quantidade é de: ", qtdProd[pos], "\n\n")
				}senao{
					escreva("Carro não encontrado/não existe no estoque")
					
				}
				escreva("\n")
				
				escreva("'1' para cadastrar um carro novo\n")
				escreva("'2' para exibir o estoque atualizado\n")
				escreva("'3' para atualizar o estoque de um carro\n")
				escreva("'4' para mostrar o relatório do estoque atual\n")
				escreva("'5' para sair do programa\n")
				leia(menu)
				limpa()

				//--
			caso 4:
				escreva("O atual relatório do estoque é: \n\n")

					escreva("\nEstoque\t\tCódigo\t\tCadastro\n")
					
					para(cont=0; cont<=4; cont++){
						escreva(qtdProd[cont], "\t\t", codProd[cont], "\t\t", cadProd[cont], "\n")
						
				}
				escreva("\n")
				
				escreva("'1' para cadastrar um carro novo\n")
				escreva("'2' para exibir o estoque atualizado\n")
				escreva("'3' para atualizar o estoque de um carro\n")
				escreva("'4' para mostrar o relatório do estoque atual\n")
				escreva("'5' para sair do programa\n")
				leia(menu)
				limpa()

				//--
			caso 5:
				escreva("\nObrigado por utilizar o programa da Auto Premier. Tenha um bom dia!\n")
				pare
			}
			se(menu<=0 ou menu>=6){
				escreva("Porfavor, escolha um número dentro das suas escolhas!")
			}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3126; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {codProd, 9, 10, 7}-{qtdProd, 9, 22, 7}-{cadProd, 10, 9, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */