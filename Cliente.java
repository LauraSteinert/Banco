/* Classe dos Clientes.
	Extende a classe Pessoa e implementa a InterfaceCliente.
		Aqui os clientes podem obter empréstimos, pagar empréstimos, realizar saques e saber se foram negativados.
								*/
public class Cliente extends Pessoa implements InterfaceCliente{
	static final int dividaMaxima = 30000;
	static final String tipo = "C";
	private int valorContaCorrente;
	private int valorDaDivida;
	
	/* Construtor da Classe Cliente
	 * Este construtor invoca o construtor da classe Pessoa e inicializa os dois atributos 
	 * do objeto que esta sendo instanciado.
	 */
	Cliente(String nome, int cpf, int valorInicial){
		super(nome, cpf);
		valorContaCorrente = valorInicial;
		valorDaDivida = 0;
	}
	
	/* Metodo que retorna o valor do atributo tipo do objeto atual */
	String retornaTipo() {
		return tipo;
	}	
	
	// Getters e setters para passar as informações para as Classes que extendem a classe.

	protected int getValorContaCorrente() {
		return valorContaCorrente;
	}
	
	protected int getValorDaDivida() {
		return valorDaDivida;
	}
	
	protected void setValorContaCorrente(int valor) {
		valorContaCorrente = valor;
	}
	
	protected void setValorDaDivida(int valor) {
		valorDaDivida = valor;
	}
	

	/* Metodo para o cliente atual obter um emprestimo de acordo com o valor passado por parametro
	 *   Caso o valor do parametro seja menor ou igual a zero, o metodo deve retornar false
	 *   Caso contrario ha duas situacoes:
	 *     1a) se o valor do parametro mais o valor do atributo valorDaDivida for maior do
	 *         que o valor da constante dividaMaxima, o metodo deve retornar false 
	 *     2a) caso contrario, o atributo valorDaDivida deve ser incrementado em valor, o atributo
	 *         valorContaCorrente deve ser incrementado em valor e o metodo deve retornar true
	 */
	public boolean obterEmprestimo(int valor) {
		
		//Início das condições

		//Caso o valor seja menor ou igual a zero.

		if(valor <= 0){
			return false;

		// Caso o valor em adição ao valorDaDivida seja maior que a dividaMaxima.

		} else if((valor + valorDaDivida) > dividaMaxima){
				return false;
		
		//Caso nenhuma das condições acima sejam cabíveis. 

		} else
			valorDaDivida += valor;
			valorContaCorrente += valor;
			return true;
	}
	

	/* Metodo para o cliente atual pagar parte de sua divida de acordo com o valor passado por parametro
	 *   Caso o valor do parametro seja menor ou igual a zero, o metodo deve retornar false
	 *   Caso contrario ha duas situacoes:
	 *     1a) se o valor do parametro for maior do que o valorDaDivida ou for maior do que 
	 *         valorContaCorrente, o metodo deve retornar false 
	 *     2a) caso contrario, o atributo valorDaDivida deve ser decrementado em valor, o atributo
	 *         valorContaCorrente deve ser decrementado em valor e o metodo deve retornar true
	 */
	public boolean pagarEmprestimo(int valor) {

		//Início das condições

		//Caso o valor seja menor ou igual a zero.

		if(valor <= 0){
			return false;

		//Caso o valor seja maior que o valorDaDivida ou seja maior que o valor da Conta Corrente.

		} else if(valor > valorDaDivida || valor > valorContaCorrente){
				return false;

		//Caso nenhuma das condições acima sejam cabíveis.

		} else
			valorDaDivida -= valor;
			valorContaCorrente -= valor;
			return true;		
	}
	
	
	/* Metodo que retorna true caso valorContaCorrente seja menor do que valorDaDivida.
	 * Caso contrario, retorna false.
	 */
	public boolean negativado() {
		
		//Início das condições
	
		//Se o valor da conta corrente seja menor que o valor da dívida.

		if(valorContaCorrente < valorDaDivida){
			return true;
		}
		return false;
	}
	

	/* Metodo para o cliente atual realizar um saque do valor passado por parametro
	 *   Caso o valor do parametro seja menor ou igual a zero, o metodo deve retornar false
	 *   Caso contrario ha duas situacoes:
	 *     1a) se o valor do parametro for maior do que o valor do atributo valorContaCorrente, o 
	 *         metodo deve retornar false
	 *     2a) caso contrario, o atributo valorContaCorrente deve ser decrementado em valor e o
	 *         metodo deve retornar true
	 */
	public boolean realizarSaque(int valor) {
		
		//Início das Condições

		//Caso o valor seja menor ou igual a zero.

		if(valor <= 0){
			return false;

		//Caso o valor seja maior que o valor da conta corrente

		} else if(valor > valorContaCorrente){
			return false;

		//Caso nenhuma das condições acima sejam cabíveis.

		}else 
			valorContaCorrente -= valor;
			return true;
	}
}
