package bytebank;

public class CriarConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta(123, 123);
		primeiraConta.depositar(200);
		System.out.println("saldo da primeira conta: " + primeiraConta.getSaldo());
		
		primeiraConta.depositar(100);
		System.out.println("saldo da primeira conta: " + primeiraConta.getSaldo());
		
		Conta segundaConta = primeiraConta;
		segundaConta.depositar(50);
		System.out.println("saldo da segunda conta: " + segundaConta.getSaldo());
		System.out.println("saldo da primeira conta: " + primeiraConta.getSaldo());
		
		System.out.println(Conta.getTotal());
	}

}
