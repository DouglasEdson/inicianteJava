package contas;

public class TesteReferencia {
	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;

		System.out.println("O saldo da primeira conta é: " + primeiraConta.saldo + " Reais");

		Conta segundaConta = new Conta();

		System.out.println("O saldo da segunda conta é: " + segundaConta.saldo);

		segundaConta.saldo += 100;

		System.out.println("O saldo agora da segunda conta é:" + segundaConta.saldo);
		System.out.println("O saldo agora da primeira conta é:" + primeiraConta.saldo);

		if (primeiraConta == segundaConta) {
			System.out.println("São a mesma conta!");
		} else {
			System.out.println("Não são a mesma conta!");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
