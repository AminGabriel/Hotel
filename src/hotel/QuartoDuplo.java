package hotel;

import javax.swing.JOptionPane;

public class QuartoDuplo {
	private String nome;
	private String CPF;
	private double diariaFixa = 180;
	private int dias;
	private int Npessoas;
	double cafeManha = 20;
	double limpezaExtra = 30;
	private double custoTotal;
	private boolean CafeManha;
	private boolean LimpezaExtra;
	private boolean CafeLimpeza;
	private String adicional;
	private String tipo = "Quarto duplo";
	String input;
	
	public QuartoDuplo(String nome, String cPF, int dias, int npessoas) {
		this.setNome(nome);
		this.setCPF(cPF);
		this.setDias(dias);
		this.setNpessoas(npessoas);
	}



	public double calcularServico() {
		if(CafeManha) {
			this.setAdicional("Café da manhã");
			return this.getDias() * (cafeManha * this.getNpessoas());
		}else if(LimpezaExtra) {
			this.setAdicional("Limpeza extra");
			return this.getDias() * limpezaExtra;
		}else if(CafeLimpeza){
			this.setAdicional("Café da manhã e limpeza extra");
			return (this.getDias() * (cafeManha * this.getNpessoas())) + (this.getDias() * limpezaExtra);
		}else {
			this.setAdicional("Não");
			return 0;
		}
		
		
		
	}
	
	
	
	public double calcularDiaria() {
		return this.getDiariaFixa() * this.getDias();
	}
	
	public void exibirDetalhes() {
		
		this.setCustoTotal(calcularServico() + calcularDiaria());
		
		JOptionPane.showMessageDialog(null, "Nome do contratante: " + this.getNome() + "\nCPF do contratante: " + this.getCPF() + "\nTipo de acomodação: " + this.getTipo() + "\nTempo de acomodação(dias): " + this.getDias() + "\nQuantidade de pessoas: " + this.getNpessoas() +"\nAdicional: " + this.getAdicional() + "\nDiária fixa: R$" + this.getDiariaFixa() + "\nValor total: R$" + this.getCustoTotal());
		
	}
	
	public boolean testeInt(String valor) {
		try {
			Integer.parseInt(valor);
			if(Integer.parseInt(valor) <= 0) {
				return false;
			}else {
				return true;
			}
		}catch(NumberFormatException e) {
			return false;
		}
	}

	public double getDiariaFixa() {
		return diariaFixa;
	}



	public void setDiariaFixa(double diariaFixa) {
		this.diariaFixa = diariaFixa;
	}



	public int getDias() {
		return dias;
	}



	public void setDias(int dias) {
		this.dias = dias;
	}
	

	public int getNpessoas() {
		return Npessoas;
	}



	public void setNpessoas(int npessoas) {
		this.Npessoas = npessoas;
	}



	public double getCustoTotal() {
		return custoTotal;
	}



	public void setCustoTotal(double custoTotal) {
		this.custoTotal = custoTotal;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCPF() {
		return CPF;
	}



	public void setCPF(String cPF) {
		CPF = cPF;
	}



	public boolean isCafeManha() {
		return CafeManha;
	}



	public void setCafeManha(boolean cafeManha) {
		CafeManha = cafeManha;
	}



	public boolean isLimpezaExtra() {
		return LimpezaExtra;
	}



	public void setLimpezaExtra(boolean limpezaExtra) {
		LimpezaExtra = limpezaExtra;
	}



	public boolean isCafeLimpeza() {
		return CafeLimpeza;
	}



	public void setCafeLimpeza(boolean cafeLimpeza) {
		CafeLimpeza = cafeLimpeza;
	}



	public String getAdicional() {
		return adicional;
	}



	public void setAdicional(String adicional) {
		this.adicional = adicional;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
