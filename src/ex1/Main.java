package ex1;

public class Main {

	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria ("Carlota");
		
		conta1.depositar(20);
		conta1.levantar(10);
		
		System.out.println("Atualização do saldo: " + conta1.getSaldo() );
		System.out.println(conta1.getInformacaoConta());
		
	}
	
}
