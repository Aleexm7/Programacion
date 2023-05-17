package ejercicios.interfaces.parte3;



public class circulo extends Figura implements Intfigura {

	private int radio;
	
	static final double PI = 3.14;
	
	public circulo(int r) {
		this.radio = r;
	}

	public int area() {
		
		return (int) (PI * Math.pow(radio, 2)) ;
	}

	@Override
    public Object clone() throws CloneNotSupportedException {
        return new circulo(this.radio);
    }
	
	@Override
	public boolean equals(Object obj) {
	
		if(obj==null) {
			return false;
		}else if(this == obj) {
			return true;
		}else if( !(obj instanceof circulo)) {
			return false;
		}else {
			circulo c=(circulo) obj;
			return this.radio == c.radio;
		}
	}
	@Override
	public String toString() {
		return "circulo [Radio =" + radio+ "]";
	}
	
	
	
}
