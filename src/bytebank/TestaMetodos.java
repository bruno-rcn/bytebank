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
		System.out.println("primeira após a tranferencia: " + primeira.saldo);
		System.out.println("segunda após a tranferencia: " + segunda.saldo);
		
		
		
		
		
	}

}
