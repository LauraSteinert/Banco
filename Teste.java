public class Teste {

	/*
	 * testes que eu fiz. pelos nomes da pra notar alguns graus de retardo mental que eu tenho,
	 * mas fazer o que
	 */
	public static void main(String [] args0)
	{
		Banco burguesSafado = new Banco();
		
		//Gerentes
		Gerente gerente = new Gerente("boss", 1);
		Gerente escravo1 = new Gerente("s", 2);
		Gerente escravo2 = new Gerente("e", 3);
		Gerente escravo3 = new Gerente("u", 4);
		Gerente escravo4 = new Gerente(" ", 5);
		Gerente escravo5 = new Gerente("b", 6);
		Gerente escravo6 = new Gerente("o", 7);
		Gerente escravo7 = new Gerente("b", 8);
		Gerente escravo8 = new Gerente("o", 9);
		Gerente escravo9 = new Gerente("c", 10);
		Gerente escravo10 = new Gerente("a", 11);
		Gerente escravo11 = new Gerente("!", 12);
		//Vamos testar a lista de gerentes
		System.out.print("Testando lista de gerentes\n resultado esperado:segundo false e ultimo false\n");
		System.out.println(burguesSafado.adicionarGerente(escravo1));
		System.out.println(burguesSafado.adicionarGerente(escravo1));
		System.out.println(burguesSafado.adicionarGerente(escravo2));
		System.out.println(burguesSafado.adicionarGerente(escravo3));
		System.out.println(burguesSafado.adicionarGerente(escravo4));
		System.out.println(burguesSafado.adicionarGerente(escravo5));
		System.out.println(burguesSafado.adicionarGerente(escravo6));
		System.out.println(burguesSafado.adicionarGerente(escravo7));
		System.out.println(burguesSafado.adicionarGerente(escravo8));
		System.out.println(burguesSafado.adicionarGerente(escravo9));
		System.out.println(burguesSafado.adicionarGerente(escravo10));
		System.out.println(burguesSafado.adicionarGerente(escravo11));
		//Clientes/perosnagens secundarios que ninguem liga
		Cliente generico1 = new Cliente("secundario", 111, 0);
		Cliente generico2 = new Cliente("secundario", 222, 0);
		Cliente generico3 = new Cliente("secundario", 333, 0);
		Cliente generico4 = new Cliente("secundario", 444, 0);
		Cliente generico5 = new Cliente("secundario", 555, 0);
		/*
		 * o idiota tinha esquecido de botar o 6 e por razões maiores, preguiça coff coff
		 *os numeros não vão ficar certinhos, apesar que nao faz diferença 
		 */
		Cliente generico6 = new Cliente("secundario", 675, 0);
		Cliente generico7 = new Cliente("secundario", 666, 0);
		Cliente generico8 = new Cliente("secundario", 777, 0);
		Cliente generico9 = new Cliente("secundario", 888, 0);
		Cliente generico10 = new Cliente("secundario", 999, 0);
		Cliente generico11 = new Cliente("secundario", 1222, 0);
		Cliente generico12 = new Cliente("secundario", 1333, 0);
		Cliente generico13 = new Cliente("secundario", 1444, 0);
		Cliente generico14 = new Cliente("secundario", 1555, 0);
		Cliente generico15 = new Cliente("secundario", 1666, 0);
		Cliente generico16 = new Cliente("secundario", 1777, 0);
		Cliente generico17 = new Cliente("secundario" ,1888, 0);
		Cliente generico18 = new Cliente("secundario", 1999, 0);
		Cliente generico19 = new Cliente("secundario", 2000, 0);
		//clientes especiais/protagonistas
		ClienteEspecial protagonista1 = new ClienteEspecial("Gon", 123, 1000);
		ClienteEspecial protagonista2 = new ClienteEspecial("Kilua", 321, 2000);
		//Adicionar clientes
		//O segundo, terceiro e o ultimo devem ser false
		System.out.println("Testando o adicionarCliente");
		System.out.println("Resultado esperado: segundo, terceiro e ultimo como false");
		System.out.println(gerente.adicionarCliente(generico1));
		System.out.println(gerente.adicionarCliente(generico1));
		System.out.println(gerente.adicionarCliente(generico1));
		System.out.println(gerente.adicionarCliente(generico2));
		System.out.println(gerente.adicionarCliente(generico3));
		System.out.println(gerente.adicionarCliente(generico4));
		System.out.println(gerente.adicionarCliente(generico5));
		System.out.println(gerente.adicionarCliente(generico6));
		System.out.println(gerente.adicionarCliente(generico7));
		System.out.println(gerente.adicionarCliente(generico8));
		System.out.println(gerente.adicionarCliente(generico9));
		System.out.println(gerente.adicionarCliente(generico10));
		System.out.println(gerente.adicionarCliente(generico11));
		System.out.println(gerente.adicionarCliente(generico12));
		System.out.println(gerente.adicionarCliente(generico13));
		System.out.println(gerente.adicionarCliente(generico14));
		System.out.println(gerente.adicionarCliente(generico15));
		System.out.println(gerente.adicionarCliente(generico16));
		System.out.println(gerente.adicionarCliente(generico17));
		System.out.println(gerente.adicionarCliente(generico18));
		System.out.println(gerente.adicionarCliente(generico19));
		System.out.println(gerente.adicionarCliente(protagonista1));
		System.out.println(gerente.adicionarCliente(protagonista2));
		
		//Testando operações
		System.out.println("Testando as operações");
		System.out.print("Resultado esperado\n false,true,true,true\n");
		System.out.println(protagonista1.pagarEmprestimo(500));
		System.out.println(protagonista1.obterEmprestimo(100));
		System.out.println(protagonista1.realizarSaque(500));
		System.out.println(protagonista1.pagarEmprestimo(100));
	    //Testando o limite maximo de 5000
		System.out.println("esperado:true, false");
		System.out.println(protagonista2.obterEmprestimo(40000));
		System.out.println(protagonista2.obterEmprestimo(50000));
		
	}
}
