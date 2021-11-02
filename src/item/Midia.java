package item;

public class Midia extends Item{
	
	protected String gravadora;
	protected float duracao;
	
	public Midia (int codigo, String descricao, String gravadora, float duracao) {
		super(codigo, descricao);
		setGravadora(gravadora);
		setDuracao(duracao);
	}
	
	public Midia() {
	}

	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		if(gravadora.length() > 0)
		this.gravadora = gravadora;
	}

	public float getDuracao() {
		return duracao;
	}
	public void setDuracao(double duracao) {
		if(duracao > 0)
		this.duracao = (float) duracao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Midia [gravadora=");
		builder.append(gravadora);
		builder.append(", duracao=");
		builder.append(duracao);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}