package poo;

public class MainAnimal {
	public static void main(String[] arggs) {
		Cachorro C = new Cachorro(" Micky", 5,4, "Italiano", " preto", " brabo");
		Gato G = new Gato( " lucky", 5, 4, " indigeno", " vemelho", " simpatico");
		
		System.out.println(C.getNome());
		System.out.println(C.getComprimento());
		System.out.println(C.getPata());
		System.out.println(C.getRaca());
		System.out.println(C.getCor());
		System.out.println(C.getEcossistema());
		C.late();
		
		System.out.println(G.getNome());
		System.out.println(G.getComprimento());
		System.out.println(G.getPata());
		System.out.println(G.getRaca());
		System.out.println(G.getCor());
		System.out.println(G.getEcossistema());
		G.mia();
		
	}

}
