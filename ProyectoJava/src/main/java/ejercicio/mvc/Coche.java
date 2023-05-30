package ejercicio.mvc;

public class Coche {

	public String matricula;
	public String modelo;
	public int velocidad;
	
	public Coche(String m, String model) {
		this.matricula = m;
		this.modelo = model;
		velocidad = 0;
	}
	

    public void acelerar(int incremento) {
        velocidad += incremento;
    }

    public void frenar(int decremento) {
        velocidad -= decremento;
    }

    public int getVelocidad() {
        return velocidad;
    }
    
    public void setVelocidad(int velo) {
		this.velocidad = velo;
	}

   
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	 public String toString() {
	        return "Coche: " + matricula + " " + modelo + ", velocidad: " + velocidad + " km/h";
	    }
	
}
