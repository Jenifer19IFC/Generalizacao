package pessoa;

public class Pessoa {

	private String nome;
	private String endereco;
	
	public Pessoa (String nome, String endereco) {	//Construtor
		setNome(nome);
		setEndereco(endereco);
	}
	
	public Pessoa() { //Construtor
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		if(nome.length() > 0)
			this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
			if(nome.length() > 0)
				this.nome = nome;
	}
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", endereco=");
		builder.append(endereco);
		builder.append("]");
		return builder.toString();
	}

	
	
	

	
}
