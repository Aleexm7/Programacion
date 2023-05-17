package ejercicios.interfaces.parte1;

public class Revistas extends Publicacion implements Prestable{

	 public String identificador;
	    public boolean prestado;

	    public Revistas(String codigo, String titulo, int anioPublicacion, String identificador) {
	        super(codigo, titulo, anioPublicacion);
	        this.identificador = identificador;
	        prestado = false;
	    }

	    //SETTER Y GETTER
	    
	    public void setIdentificador(String identificador) {
	    	this.identificador = identificador;
	    }

	    public String getIdentificador() {
	        return identificador;
	    }

	    
	    
	    public boolean prestar() {
	        if (!prestado) {
	            prestado = true;
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public boolean devolver() {
	        if (prestado) {
	            prestado = false;
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public boolean prestado() {
	        return prestado;
	    }
		
			@Override
			public String toString() {
				 return "REVISTA: " + getCodigo() + "  " + getTitulo() + " " + getAnioPublicacion() + " " + prestado() + " " + getIdentificador();
			}
}

