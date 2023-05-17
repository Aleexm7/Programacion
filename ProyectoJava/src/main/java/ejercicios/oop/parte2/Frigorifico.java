package ejercicios.oop.parte2;


public class Frigorifico extends Electrodomestico {

	//ATRIBUTOS
	
	public int temperatura;
	
	
	//CONSTRUCTORES
	public Frigorifico(String marca, String modelo, int consumo, int temperatura) {
		super(marca, modelo, consumo);
		
		this.temperatura = temperatura;
	}
	
	
	public Frigorifico (Frigorifico p) {
		super(p.marca, p.modelo, p.consumo);
		this.temperatura = p.temperatura;
		
	}
	
	// SETTER Y GETTER

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getMarca() {
			return marca;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getModelo() {
			return modelo;
		}

		public void setConsumo(int consumo) {
			this.consumo = consumo;
		}

		public int getConsumo() {
			return consumo;
		}
		
		public void setTemperatura(int temperatura) {
			this.temperatura = temperatura;
		}
		
		public int getTemperatura() {
			return temperatura;
		}
		
		//METODOS
		
		@Override
		public boolean equals(Object obj) {
			Frigorifico dispositivo = (Frigorifico) obj;
			if (this == dispositivo)
				return true;
			else {
				if (this.marca == dispositivo.marca && this.modelo == dispositivo.modelo
						&& this.consumo == dispositivo.consumo && this.temperatura == dispositivo.temperatura)
					return true;
				return false;
			}
		}
		
		@Override
		public Object clone() throws CloneNotSupportedException {
			return new Frigorifico(this.marca, this.modelo, this.consumo, this.temperatura);
		}
		
		@Override
		public String toString() {
			return "Marca = " + marca + " " + "Modelo = " + modelo + " " + "Consumo = " + consumo + " " + "Temperatura = " + temperatura;
		}
}
