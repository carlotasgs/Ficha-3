package ex1;

public class Casa {
	private String morada;
	private double precoCusto;
	private double precoVenda; 
	
	public Casa() {
	}
	
	public Casa (String morada) {
		this.morada=morada;
	}
	
	public String getMorada() {
		return morada;
	}
	
	public void setMorada(String morada) {
		this.morada = morada;
	}
	
	public double getPrecoCusto() {
		return precoCusto;
	}
	
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	
	public double getPrecoVenda() {
		return precoVenda;
	}
	
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public double getLucro () {
		double lucro = precoVenda - precoCusto;
		return lucro;
	}
	
	public double getPercentMargemLucro() {
		double percentMargemLucro = (precoVenda - precoCusto) / (precoVenda*100);
		return percentMargemLucro;
	}
	
	
}
