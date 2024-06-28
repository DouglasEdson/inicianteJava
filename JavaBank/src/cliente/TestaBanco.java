package cliente;

import contas.Conta;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente arthur = new Cliente();
		arthur.nome = "Arthur Silva";
		arthur.CPF = "111.111.111-11";
		arthur.profissao = "programador";
		
		Conta contaDoArthur = new Conta();
		contaDoArthur.deposita(100);
		
		contaDoArthur.titular = arthur;
		System.out.println(contaDoArthur.titular.nome);

	}

}
