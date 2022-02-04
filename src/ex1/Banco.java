package ex1;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List <ContaBancaria> contasBancarias;
	private List<Casa> casas;

	public Banco(String nome) {
		this.nome=nome;
		this.contasBancarias = new ArrayList <ContaBancaria>(100);
		this.casas = new ArrayList <Casa>();
	}

	public List<ContaBancaria> getContasBancarias() {
		return contasBancarias;
	}

	public void setContasBancarias(List<ContaBancaria> contasBancarias) {
		this.contasBancarias = contasBancarias;
	}

	public void criaConta (ContaBancaria c) {
		contasBancarias.add(c);
	}
	
	public  ContaBancaria getConta(String titular) {
	
		for (ContaBancaria cont: contasBancarias) {
			if (cont.getNomeTitular()==titular) {
			}
			return cont;
		}
		return null;
	}
	
	public void adicionarCasa (Casa casinha) {
		casas.add(casinha);
	}
	
	public void removerCasa (String morada) {
		for (Casa ca: casas) {
			if(ca.getMorada()==morada)
				casas.remove(morada);
		}
	}
	
	public double getLucroPrevisto() {
		double g = 0;
		for (Casa ca: casas) {
			g += ca.getPercentMargemLucro();
		}
		return g;
	}
	
}

