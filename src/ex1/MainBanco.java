package ex1;

public class MainBanco {

public static void main(String[] args) {

		ContaBancaria conta1 = new ContaBancaria ("Carlota");
		
		conta1.depositar(20);
		conta1.levantar(10);
		
		System.out.println("Atualiza��o do saldo: " + conta1.getSaldo() );
		System.out.println(conta1.getInformacaoConta());
		
		Banco banco1 = new Banco ("Banco C");
		
		banco1.criaConta(conta1);
		
		banco1.getConta("Carlota").depositar(5000);
		banco1.getConta("Carlota").levantar(100);
		
		System.out.println("Conta: " + banco1.getConta("Carlota").getNomeTitular() + " Saldo: " + banco1.getConta("Carlota").getSaldo());
		
	}

}
