package bytebank;

public class TestaMetodos {

	public static void main(String[] args) {
		
		Conta primeira = new Conta(123, 123);
		Conta segunda = new Conta(456, 456);
		
		primeira.depositar(100);
		segunda.depositar(1100);
		
		System.out.println("primeira: " + primeira.getSaldo());
		System.out.println("segunda: " + segunda.getSaldo());
		
		segunda.transferir(100, primeira);
		System.out.println("primeira após a tranferencia: " + primeira.getSaldo());
		System.out.println("segunda após a tranferencia: " + segunda.getSaldo());
		
		
		Conta contaTeste = new Conta(789, 789);
		Cliente teste = new Cliente();
	
		contaTeste.setTitular(teste);
		contaTeste.getTitular().setNome("abc");
		System.out.println(contaTeste.getTitular().getNome());
		
		System.out.println(Conta.getTotal());
	}

}
