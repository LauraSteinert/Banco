/* Classe abstrata molde para todas as pessoas do banco, gerentes e clientes. 
	Oferece o nome e cpf de cada pessoa, e retorna o tipo oferecido nas subclasses.
											*/
public abstract class Pessoa {

	//Criação das variáveis de nome e cpf

	String nome;
	int cpf;
	
	//Abastece as variáveis com o que for passado.

	Pessoa(String nome, int cpf){
		this.nome = nome;
		this.cpf = cpf;
	}
	
	//Retorna o tipo passado.
	
	abstract String retornaTipo();
	
}
