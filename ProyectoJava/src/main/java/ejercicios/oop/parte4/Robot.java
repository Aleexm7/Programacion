package ejercicios.oop.parte4;

public class Robot {

	private int name;

	private int model;

	private int clase;

	private static int numeroDeRobots = 0;


	public Robot(int nombre, int modelo, int c) {
		this.name = nombre;
		this.model = modelo;
		this.clase = c;
		numeroDeRobots++;
	}
	
	//Constructor copia 
	public Robot(Robot objeto) {
			this(objeto.name, objeto.model, objeto.clase);
	}

	public void setName(int n) {
		this.name = n;
	}

	public int getName() {
		return name;
	}

	public void setModel(int m) {
		this.model = m;

	}

	public int getModel() {
		return model;
	}

	public void setClase(int c) {
		this.clase = c;
	}

	public int getClase() {
		return clase;
	}

	@Override
	public String toString() {
		return "Robot [name=" + name + ", model=" + model + ", clase=" + clase + "]";
	}

	@Override
    public Object clone() throws CloneNotSupportedException {
        return new Robot(this.name, this.model, this.clase);
    }

	@Override
	public boolean equals(Object obj) {
	
		if(obj==null) {
			return false;
		}else if(this == obj) {
			return true;
		}else if( !(obj instanceof Robot)) {
			return false;
		}else {
			Robot temp=(Robot) obj;
			return this.name == temp.name && this.model == temp.model && this.clase == temp.clase;
		}
	
		
	}

}
