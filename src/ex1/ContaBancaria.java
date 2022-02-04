package ex1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ContaBancaria {

		private String nomeTitular;
		private double saldo=0.0;
		private LocalDate dataAbertura;
		
		public ContaBancaria (String nomeTitular) {
			this.saldo=0;
			this.nomeTitular=nomeTitular;
			dataAbertura = LocalDate.now();
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public String getNomeTitular() {
			return nomeTitular;
		}

		public LocalDate getDataAbertura() {
			return dataAbertura;
		}

		public String getInformacaoConta() {
			 DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
			return ("Titular:  " + this.nomeTitular + " Saldo: " + String.format("%.2f", this.saldo) + "€" + " DataAbertura: " + this.dataAbertura.format(myFormat)) ;
		}
		
		public void depositar(double valorDep) {
			saldo+= valorDep;
		}
		
		public void levantar(double valorLev) {
			
			if(saldo<valorLev) {
				System.out.println("Não tem dinheiro suficiente para efectuar a operação");
			} else {
			saldo-=valorLev;
			}
			
			
		}
		

}
