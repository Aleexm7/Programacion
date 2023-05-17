package ejercicios.interfaces.parte1;

public class Libros extends Publicacion implements Prestable {

	public boolean prestado;
	
	
	
	
	public Libros(String codigo, String titulo, int anyo) {
		super(codigo, titulo, anyo);
		prestado = false;
	}
	
	
	//SETTER Y GETTER
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setAnyoPublicacion(int anyo) {
		this.anyoPublicacion = anyo;
	}
	
	public int getAnyoPublicacion() {
		return anyoPublicacion;
	}
	
	
	//METODOS
	
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
		 return "LIBRO: " + getCodigo() + " - " + getTitulo() + " " + getAnioPublicacion() + " " + prestado();
	}
	
	
}
