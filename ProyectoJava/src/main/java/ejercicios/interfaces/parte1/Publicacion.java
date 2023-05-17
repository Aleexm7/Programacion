package ejercicios.interfaces.parte1;

public class Publicacion {

	public String codigo;
	public String titulo;
	public int anyoPublicacion;
	
	    
	    public Publicacion(String codigo, String titulo, int anyo) {
	        this.codigo = codigo;
	        this.titulo = titulo;
	        this.anyoPublicacion = anyo;
	    }
	    
	    public String getCodigo() {
	        return codigo;
	    }
	    
	    public String getTitulo() {
	        return titulo;
	    }
	    
	    public int getAnioPublicacion() {
	        return anyoPublicacion;
	    }
	}

