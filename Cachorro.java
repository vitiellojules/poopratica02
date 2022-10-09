package poo;

public class Cachorro extends Animal {
	public Cachorro(String nome ,Integer pata,float comprimento,String raca,String cor,String ecossistema) {
		super.setNome(nome);
		super.setComprimento(comprimento);
		super.setCor(cor);
		super.setRaca(raca);
		super.setPata(pata);
		super.setEcossistema(ecossistema);
	}
	public void late() {
		System.out.println(" Cachorro late : whooooo whoooo ");
	}

}
