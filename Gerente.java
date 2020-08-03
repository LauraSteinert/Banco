
/*	Classe para gerenciar clientes do Banco, adicionando-os em um arranjo de clientes e cobrando seus empréstimos.
	Implementa a interface de gerente e extende a classe Pessoa (que contém o nome e CPF de todas as pessoas do Banco).
	Todos os clientes passam por essa classe.
							*/
public class Gerente extends Pessoa implements InterfaceGerente{

	/*  Variáveis de tipo de pessoa G (Gerente), 
		criar um arranjo de clientes e 
			a variável que conta quantos clientes existem no arranjo.
	*/
	
	private static final String tipo = "G";
	private Cliente[] clientes;
	private int numClientes;

	/* Construtor da Classe Gerente
	 * Este construtor invoca o construtor da classe Pessoa e inicializa os dois atributos 
	 * do objeto que esta sendo instanciado.
	 */
	Gerente(String nome, int cpf){
		super(nome, cpf);
		clientes = new Cliente[20];
		numClientes = 0;
	}

	
	/* Metodo que retorna o valor do atributo tipo do objeto atual */
	String retornaTipo() {
		return tipo;
	}
	
	
	/* Metodo para imprimir informacoes sobre os clientes gerenciados pelo gerente atual
	 */
	void imprimirClientes(){
		Cliente atual;
		System.out.println("\tNumero de clientes: " + numClientes);
		for (int c=0; c < numClientes; c++){
			atual = clientes[c];
			System.out.println("\t" + (c+1) + "\t" + atual.retornaTipo() + "\t" + atual.nome + "\t" + atual.cpf + "\t" + atual.getValorContaCorrente() + "\t" + atual.getValorDaDivida() + "\t" + atual.negativado());
		}
	}

	/* Metodo para adicionar um cliente no arranjo de clientes do gerente atual.
	 * Caso o numero de clientes seja igual a 20, nao deve adicionar e deve retornar false.
	 * Caso contrario, ha duas situacoes: 
	 *   1a: o cliente ja consta no arranjo de clientes (verifique isso usando o numero do cpf),
	 *       neste caso o cliente nao deve ser reinserido e o metodo deve retornar false; 
	 *   1a: o cliente passado como parametro nao consta no arranjo de clientes: o cliente 
	 *       deve ser adicionado na posicao numClientes, o atributo numClientes deve ser 
	 *       incrementado em 1 e o metodo deve retornar true. 
	 */
	public boolean adicionarCliente(Cliente cliente) {
		
		//Para percorrer o arranjo de Clientes

		for(int i = 0; i< numClientes; i++){

			//Início das condições

			//Caso o número de clientes seja 20.

			if(numClientes == 20){ 
				return false;

			//Caso o cpf do cliente já exista.

			}else if(clientes[i].cpf == cliente.cpf){ 
				return false;
			}
			
		}

		//Caso nenhuma das condições acima sejam cabíveis.

		clientes[numClientes] = cliente;
		numClientes ++;
		return true;
	}


	
	/* Metodo para cobrar os emprestimos de todos os clientes do gerente atual.
	 * Para cada um dos clientes presentes no arranjo clientes, este metodo deve:
	 *   - nao fazer nada para o cliente, caso seu valorDaDivida seja igual a zero
	 *   - caso contrario, ha duas situacoes:
	 *     1a) se o valorContaCorrente do cliente for maior ou igual ao valorDaDivida, deve
	 *         fazer o cliente pagar a divida, isto e, o valorContaCorrente sera atualizado, 
	 *         descontando-se o valor da divida e o valorDaDivida sera zerado.
	 *     2a) se o valorContaCorrente do cliente for menor do que o valorDaDivida, 
	 *         deve fazer o cliente pagar parte da divida, isto e, o valorDaDivida 
	 *         sera atualizado, tendo seu valor diminuido pelo valorContaCorrente e 
	 *         o valorContaCorrente sera zerado.
	 */
	public void cobrarTodosEmprestimos() {

		// Variáveis para receber os valores atualizados

		int valorDividaAtualizado = 0;
		int valorContaAtualizado = 0;

		//Para percorrer o arranjo de clientes

		for(int i = 0; i < numClientes; i++){

			//Início das condições

			//Caso o valor da dívida (utilizado por getter) seja zero.

			if (clientes[i].getValorDaDivida() == 0){
					break;

			/*Caso o valor da conta corrente seja maior ou igual ao valor da dívida,
				atualiza o valor da conta diminuindo o valor da dívida utilizando setters. 
					Zera a dívida. 
							*/

			} else if(this.clientes[i].getValorContaCorrente() >= this.clientes[i].getValorDaDivida()){
				valorContaAtualizado = clientes[i].getValorContaCorrente() - clientes[i].getValorDaDivida();
				clientes[i].setValorContaCorrente(valorContaAtualizado);
				clientes[i].setValorDaDivida(0);
		
			/* Caso o valor da conta corrente seja menor que o valor da dívida,
				atualiza o valor da dívida, diminuindo o valor da conta corrente utilizando setters.
					Zera a conta.
							*/

			} else if(clientes[i].getValorContaCorrente() < clientes[i].getValorDaDivida()){
				valorDividaAtualizado = clientes[i].getValorDaDivida() - clientes[i].getValorContaCorrente();
				clientes[i].setValorDaDivida(valorDividaAtualizado);
				clientes[i].setValorContaCorrente(0);
			}
		} 

	}

}
