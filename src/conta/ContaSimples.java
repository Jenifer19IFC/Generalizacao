package conta;

public class ContaSimples extends Conta {

	private double saldopoupanca;
	
	public ContaSimples (String banco, int agencia, int numeroconta, double saldo) { //Construtor
		super(banco, agencia, numeroconta, saldo);
	}
	
	public ContaSimples() { //Construtor
	}

	public double getSaldopoupanca() {
		return saldopoupanca;
	}

	public void setSaldopoupanca(double saldopoupanca) {
		this.saldopoupanca = saldopoupanca;
	}

	public boolean depositopoupanca(double valor){
		if(valor > 0) {
			setSaldopoupanca(getSaldopoupanca()+valor);
			return true;
		}
		return false;
	}
	
	public boolean saquepoupanca (double valor) {
		if(valor <= getSaldopoupanca() && valor > 0) {
			setSaldopoupanca(getSaldopoupanca() - valor);
			return true;
		}
		return false;
	}
	/*Para saldo total:
	public double total() {
		return getSaldo() + getSaldopoupanca();
	}*/
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldopoupanca=");
		builder.append(saldopoupanca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
