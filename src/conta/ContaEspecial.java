package conta;

public class ContaEspecial extends Conta {

	private double limite;
	private double saldolimite;
	
	public ContaEspecial (String banco, int agencia, int numeroconta, double saldo, double limite) { //Construtor
		super (banco, agencia, numeroconta, saldo);
		setLimite(limite);
	}
	
	public ContaEspecial() {  //Construtor		
	}


	public double getSaldolimite() {
		return saldolimite;
	}

	public void setSaldolimite(double saldolimite) {
		this.saldolimite = saldolimite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
			this.limite = limite;
	}

	public double total() {
		return saldolimite = (saldo + limite);	
	}
	
	public boolean saqueEspecial(double valor) {
		if(valor <= getSaldolimite() && valor > 0) {
			setSaldolimite(getSaldolimite() - valor);
			return true;
		}else
			return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [limite=");
		builder.append(limite);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
	
	
	

}
