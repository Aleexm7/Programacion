package ejercicios.oop.parte2;


public class Electrodomestico {

	public String marca;
	public String modelo;
	public int consumo;

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

	// CONSTRUCTORES

	public Electrodomestico(String marca, String modelo, int consumo) {
		this.marca = marca;
		this.modelo = modelo;
		this.consumo = consumo;
	}

	public Electrodomestico(Electrodomestico dispositivo) {
		this.marca = dispositivo.getMarca();
		this.modelo = dispositivo.getModelo();
		this.consumo = dispositivo.getConsumo();
	}

	// METODOS

	@Override
	public boolean equals(Object obj) {
		Electrodomestico dispositivo = (Electrodomestico) obj;
		if (this == dispositivo)
			return true;
		else {
			if (this.marca == dispositivo.marca && this.modelo == dispositivo.modelo
					&& this.consumo == dispositivo.consumo)
				return true;
			return false;
		}
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Electrodomestico(this.marca, this.modelo, this.consumo);
	}

	@Override
	public String toString() {
		return "Marca = " + marca + " " + "Modelo = " + modelo + " " + "Consumo = " + consumo;
	}
}
