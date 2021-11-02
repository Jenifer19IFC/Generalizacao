package item;

public class ItemMain {

	public static void main(String[] args) {
		
		Item i = new Item (321, "Livro");
		System.out.println(i);
		
		Livro l = new Livro (111, "Romance", "Nicholas Sparks ");
		System.out.println(l);
		
		Midia m = new Midia (123, "Música", "Universal Music", (float) 3.22);
		System.out.println(m);
		 
		Cd c = new Cd (12, "Pop", "Sunset Sound", (float) 3.22, 1, "Lady Gaga", "Chromatica");
		System.out.println(c);
		
		Vhs v = new Vhs (12, "Batizado", "Koinomusic", (float) 11.22, 7, "Rogerio", "Ano 1990", "Pequena Alice");
		System.out.println(v);
		
	}
		
}


