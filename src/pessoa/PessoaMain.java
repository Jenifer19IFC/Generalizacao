package pessoa;

public class PessoaMain {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa ("Jênifer", "Imbuia");
		System.out.println(p);
		
		PessoaFisica pf = new PessoaFisica ("Jênifer", "Imbuia", "109.419.629-03", "solteira");
		System.out.println(pf);
		
		PessoaJuridica pj = new PessoaJuridica("Sonia", "Ituporanga", "1234567","MEI");
		System.out.println(pj);
	}
	
}

