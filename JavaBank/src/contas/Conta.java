package contas;
import cliente.Cliente;

//saldo, agência, número e titular.

public class Conta {

	double saldo;
	int agencia = 42;
	int numero;
	public Cliente titular;

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			System.out.println("Não há saldo suficiente, operação negada.");
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			// System.out.println("O saldo atual é: " + saldo);
			System.out.println("Operação realizada com sucesso!");
			return true;
		} else {
			System.out.println("Operação negada, saldo insuficiente!");
			return false;
		}

	}
}
