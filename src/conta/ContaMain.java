package conta;

public class ContaMain {

		public static void main(String[] args) {
				
				//Conta
				Conta c = new Conta ("Banco do Brasil", 123, 321,0);
				if (c.deposito(1000))
						System.out.println("Depósito OK");
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
				ContaEspecial ce = new ContaEspecial("Itaú", 890, 891, 1000, 1000);
				
				System.out.println(ce);
			}

		}	