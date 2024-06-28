package contas;

public class TesteReferencia {
	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.setSaldo(300);

		System.out.println("O saldo da primeira conta é: " + primeiraConta.getSaldo() + " Reais");

		Conta segundaConta = new Conta();

		System.out.println("O saldo da segunda conta é: " + segundaConta.getSaldo());

		segundaConta.setSaldo(segundaConta.getSaldo() + 100);

		System.out.println("O saldo agora da segunda conta é:" + segundaConta.getSaldo());
		System.out.println("O saldo agora da primeira conta é:" + primeiraConta.getSaldo());

		if (primeiraConta == segundaConta) {
			System.out.println("São a mesma conta!");
		} else {
			System.out.println("Não são a mesma conta!");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
