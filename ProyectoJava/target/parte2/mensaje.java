package ejercicios.interfaces.parte2;

public class mensaje implements Logable {

	public String mensaje;
	
	public String prioridad;
	
	// CONSTRUCTOR
	public mensaje(String mensaje, String prioridad) {
		this.mensaje = mensaje;
		this.prioridad = prioridad;
		
	}
	
	//SETTER Y GETTER
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	
	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}
	
	public String getPrioridad() {
		return prioridad;
	}
	
	//METODOS
	
	public String leerMensaje() {
        return mensaje;
    }
    
    public void cambiarMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    public void cambiarPrioridadAlta() {
        prioridad = "alta";
    }
    
    public void cambiarPrioridadBaja() {
        prioridad = "baja";
    }
    
    public void cambiarPrioridadMedia() {
        prioridad = "media";
    }
	
	
	@Override
	public String toString() {
		return "Mensaje = "+ " " + mensaje + " " + "Prioridad =" + " " + prioridad;
	}
	
	
	
}
