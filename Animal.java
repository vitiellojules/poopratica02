package poo;
	public abstract class Animal {
		private String nome;
		private String raca;
		private Integer pata;
		private String cor;
		private String ecossistema;
		private float comprimento;

		public Integer getPata() {
			return pata;
		}

		public void setPata(Integer pata) {
			this.pata = pata;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public String getEcossistema() {
			return ecossistema;
		}

		public void setEcossistema(String ecossistema) {
			this.ecossistema = ecossistema;
		}

		public String getRaca() {
			return raca;
		}

		public void setRaca(String raca) {
			this.raca = raca;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public float getComprimento() {
			return comprimento;
		}

		public void setComprimento(float comprimento) {
			this.comprimento = comprimento;
		}
		
		public void caminha() {
			
		}

	}

	


