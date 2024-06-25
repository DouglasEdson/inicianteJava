package contas;

public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		System.out.println("O saldo da primeira conta é: " +primeiraConta.saldo + " reais.");
	}

}
