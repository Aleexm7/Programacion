package ejercicios.interfaces.parte3;



public class rectangulo extends Figura implements Intfigura{

	private int ancho;
	private int alto;
	
	
	public rectangulo(int an, int al) {
		this.ancho = an;
		this.alto = al;
		
	}

	
	//Métodos
	public int area() {
		return ancho * alto;
		
	}

	@Override
    public Object clone() throws CloneNotSupportedException {
        return new rectangulo(this.ancho, this.alto);
    }
	
	@Override
	public boolean equals(Object obj) {
	
		if(obj==null) {
			return false;
		}else if(this == obj) {
			return true;
		}else if( !(obj instanceof rectangulo)) {
			return false;
		}else {
			rectangulo r=(rectangulo) obj;
			return this.ancho == r.ancho && this.alto == r.alto;
		}
	}

	@Override
	public String toString() {
		return "rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
	}
}
