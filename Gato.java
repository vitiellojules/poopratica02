package poo;

public class Gato extends Animal{
		
	
	public Gato(String nome ,Integer pata,float comprimento,String raca,String cor,String ecossistema) {
		super.setNome(nome);
		super.setComprimento(comprimento);
		super.setCor(cor);
		super.setRaca(raca);
		super.setPata(pata);
		super.setEcossistema(ecossistema);
	}
	public void mia() {
		System.out.println(" O Gato mia  : miau miau miau ");
	}
		
	     
	}



