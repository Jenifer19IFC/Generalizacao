package conta;

public class ContaEspecial extends Conta {

	private double limite;

	public ContaEspecial (String banco, int agencia, int numeroconta, double saldo, double limite) { //Construtor
		super (banco, agencia, numeroconta, saldo);
		setLimite(limite);
	}
	
	public ContaEspecial() {  //Construtor		
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
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
