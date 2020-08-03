/*  Classe dos clientes especiais, com dívidas máximas diferentes dos clientes regulares.
	Tem seu próprio método de obter empréstimo.
		Extende a classe Cliente.
							*/

public class ClienteEspecial extends Cliente{

	//Criação de variáveis para os aspectos específicos da classe, a dívida máxima (50.000) e o tipo (CE - Cliente Especial).

	static final int dividaMaxima = 50000;
	static final String tipo = "CE";
	
	/* Construtor da Classe ClienteEspecial
	 * Este construtor invoca o construtor da classe Cliente.
	 */
	ClienteEspecial(String nome, int cpf, int valor){
		super(nome, cpf, valor);
	}
	
	/* Metodo que retorna o valor do atributo tipo do objeto atual */
	String retornaTipo() {
		return tipo;
	}

	//Método alterado do método da classe cliente.
	/* Metodo para o cliente atual obter um emprestimo de acordo com o valor passado por parametro
	 *   Caso o valor do parametro seja menor ou igual a zero, o metodo deve retornar false
	 *   Caso contrario ha duas situacoes:
	 *     1a) se o valor do parametro mais o valor do atributo valorDaDivida for maior do
	 *         que o valor da constante dividaMaxima, o metodo deve retornar false 
	 *     2a) caso contrario, o atributo valorDaDivida deve ser incrementado em valor, o atributo
	 *         valorContaCorrente deve ser incrementado em valor e o metodo deve retornar true
	 */
	public boolean obterEmprestimo(int valor) {

		//Variáveis que vão armazenar o valor atualizado da dívida e da conta corrente.

		int valorDividaAtualizado = 0;	
		int valorContaAtualizado = 0;

		//Início das condições

		//Caso o valor seja menor ou igual a zero.

		if(valor <= 0){
			return false;

		// Caso o valor em adição ao valorDaDivida (da classe Cliente) seja maior que a dividaMaxima (desta classe).

		} else if((valor + getValorDaDivida()) > this.dividaMaxima){
				return false;
		
		/* Caso nenhuma das condições acima sejam cabíveis.
			Coloca os valores atualizados nas variáveis criadas.
				 Usa o setter para atualizar o valor para o uso.
								*/

		} else
			valorDividaAtualizado = this.getValorDaDivida() + valor;
			this.setValorDaDivida(valorDividaAtualizado);
			valorContaAtualizado = this.getValorContaCorrente() + valor;
			this.setValorContaCorrente(valorContaAtualizado);
			return true;
	}
}
