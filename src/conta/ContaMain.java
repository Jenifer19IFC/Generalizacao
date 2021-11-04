package conta;

public class ContaMain {

		public static void main(String[] args) {
				
				//Conta
				Conta c = new Conta ("Banco do Brasil", 123, 321,0);
				if (c.deposito(1000))
						System.out.println("Dep�sito OK");
				System.out.println(c.deposito(-100));
				System.out.println(c.saque(100));
				System.out.println(c.saque(901));
				System.out.println(c);
				
				//Conta Simples
				ContaSimples cs = new ContaSimples("Caixa", 456, 654, 100);
				System.out.println(cs.depositopoupanca(40000));
				System.out.println(cs.saquepoupanca(30000));
				System.out.println(cs.saquepoupanca(30000));
				System.out.println(cs);
				
				//Conta Especial
				ContaEspecial ce = new ContaEspecial("Ita�", 890, 891, 5000, 1000);
				System.out.println(ce);
				System.out.println("Dispon�vel para saque (com limite) " + ce.total());
				System.out.println("Saque: " + ce.saqueLimite(6001));
			}

		}	