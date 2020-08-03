/*********************************************************************/
/**   ACH2001 - Introdução à Programação                            **/
/**   EACH-USP - Primeiro Semestre de 2020                          **/
/**   Matutino - Digiampietri                                       **/
/**                                                                 **/
/**   Quarto Exercício-Programa                                     **/
/**                                                                 **/
/**   Laura Steinert de Freitas                   10725244          **/
/**                                                                 **/
/**   27/06/2020                                                    **/
/*********************************************************************/

/* Classe para adicionar Gerentes.  
	Todos os gerentes criados passam por aqui.
*/

public class Banco {

	/* Variável para contar quantos gerentes têm no arranjo. 
		Criação de um arranjo de gerentes. 
	*/

	private Gerente[] gerentes;
	private int numGerentes;
	
	/* Construtor da Classe Banco
	 * Inicializa os dois atributos do objeto que esta sendo instanciado.
	 */
	Banco(){
		gerentes = new Gerente[10];
		numGerentes = 0;
	}
	

	/* Metodo para Imprimir informacoes gerais sobre o banco atual
	 */
	void imprimir(){
		System.out.println("#########################################################################");
		System.out.println("Imprimindo informacoes do banco.");
		System.out.println("Ha " + numGerentes + " gerente(s) neste banco.");
		Gerente ger;
		for (int g=0; g < numGerentes; g++){
			ger = gerentes[g];
			System.out.println("Gerente: " + ger.nome + "\tCPF: " + ger.cpf);
			ger.imprimirClientes();
		}
		System.out.println("#########################################################################");
	}
	
	
	
	/* Metodo para adicionar um gerente no arranjo de gerentes do banco.
	 * Caso o numero de gerentes seja igual a 10, nao deve adicionar e deve retornar false.
	 * Caso contrario, ha duas situacoes: 
	 *   1a: o gerente ja consta no arranjo de gerentes (verifique isso usando o numero do cpf),
	 *       neste caso o gerente nao deve ser reinserido e o metodo deve retornar false; 
	 *   2a: o gerente passado como parametro nao consta no arranjo de gerentes: o gerente 
	 *       deve ser adicionado na posicao numGerentes, o atributo numGerentes deve ser 
	 *       incrementado em 1 e o metodo deve retornar true. 
	 */
	boolean adicionarGerente(Gerente gerente){

		//Para percorrer o arranjo de Gerentes

		for(int i = 0; i < numGerentes; i++){
		
			//Início das condições 

			//Caso o número de gerentes seja 10. 

			if(numGerentes == 10) return false;

			//Caso o cpf do gerente já exista no arranjo.

			else if(gerentes[i].cpf == gerente.cpf){ 
				return false;
			}
		}
		
		//Se nenhuma das condições acima foi cabível.

		gerentes[numGerentes] = gerente;
		numGerentes ++;
		return true;
	}
	
}
