package bytebank;

public class TestaMetodos {

	public static void main(String[] args) {
		
		Conta primeira = new Conta();
		Conta segunda = new Conta();
		
		primeira.depositar(100);
		segunda.depositar(1100);
		
		System.out.println("primeira: " + primeira.getSaldo());
		System.out.println("segunda: " + segunda.getSaldo());
		
		segunda.transferir(100, primeira);
		System.out.println("primeira após a tranferencia: " + primeira.getSaldo());
		System.out.println("segunda após a tranferencia: " + segunda.getSaldo());
		
		
		Conta contaTeste = new Conta();
		Cliente teste = new Cliente();
	
		contaTeste.setTitular(teste);
		contaTeste.getTitular().setNome("abc");
		System.out.println(contaTeste.getTitular().getNome());
	}

}
