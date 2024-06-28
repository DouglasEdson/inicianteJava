package contas;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoArthur = new Conta();

		contaDoArthur.setSaldo(100);
		contaDoArthur.deposita(34.10);

		contaDoArthur.deposita(50.85);
		// System.out.println(contaDoArthur.saldo);

		contaDoArthur.saca(28.56);
		System.out.println("O saldo do Arthur antes da transferência é: " + contaDoArthur.getSaldo());

		contaDoArthur.saca(0);
		// System.out.println(contaDoArthur.saldo);

		Conta contaDaMaria = new Conta();

		System.out.println("O saldo da maria antes da transferência é : " + contaDaMaria.getSaldo());

		contaDaMaria.deposita(1000);
		System.out.println("Maria recebeu um depósito de: " + contaDaMaria.getSaldo());
		contaDaMaria.transfere(400, contaDoArthur);
		// System.out.println("Maria realizou uma transferência de 330,00 Reais ");

		System.out.println("O saldo atual da Maria após a transferência é: " + contaDaMaria.getSaldo());
		System.out.println("O saldo atual do Arthur após a transferência é: " + contaDoArthur.getSaldo());

	}

}
