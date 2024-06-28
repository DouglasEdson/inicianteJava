package contas;

public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.deposita(200);
		
		System.out.println("O saldo da primeira conta é: " +primeiraConta.getSaldo() + " reais.");
		
		//int variavel;
		primeiraConta.setSaldo(primeiraConta.getSaldo() + 100);
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta();
		segundaConta.setSaldo(50);
		System.out.println("Primeira conta  = " + primeiraConta.getSaldo());
		System.out.println("Segunda conta = " + segundaConta.getSaldo());
		
		System.out.println(segundaConta.getNumero());
	}

}
