package bytebank;

public class TestaMetodos {

	public static void main(String[] args) {
		
		Conta primeira = new Conta();
		Conta segunda = new Conta();
		
		primeira.depositar(100);
		segunda.depositar(50);
		
		System.out.println("primeira: " + primeira.saldo);
		System.out.println("segunda: " + segunda.saldo);
		
		segunda.transferir(100, primeira);
		System.out.println("primeira ap�s a tranferencia: " + primeira.saldo);
		System.out.println("segunda ap�s a tranferencia: " + segunda.saldo);
		
		
		
		
		
	}

}
