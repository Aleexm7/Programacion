package ejercicios.oop.parte1;


public class Persona implements Cloneable {

	//ATRIBUTOS
	
	protected String nombre;
	protected String apellidos;
	protected String dni;
	protected int anyo_nacimiento;
	
	private String apodo; //No se puede heredar
	
	//CONSTRUCTORES
	
	public Persona(String nombre, String apellidos, String dni, int anyo_nacimiento, String apodo) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.anyo_nacimiento = anyo_nacimiento;
		
	}
	
	 public Persona(Persona persona) {
	        this.nombre = persona.getNombre();
	        this.apellidos = persona.getApellidos();
	        this.dni = persona.getDni();
	        this.anyo_nacimiento = persona.getAnyo_nacimiento();
	        this.apodo = persona.getApodo();
	    }
	
	
	//METODOS
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", anyo_nacimiento="
				+ anyo_nacimiento + ", apodo=" + apodo + "]";
	}
	
	

	@Override
	 public Persona clone() {
        try {
            return (Persona) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (anyo_nacimiento != other.anyo_nacimiento)
			return false;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (apodo == null) {
			if (other.apodo != null)
				return false;
		} else if (!apodo.equals(other.apodo))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	
	
	
	// SETTER Y GETTER
	

	public String getNombre() {
		return nombre;
	}

	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getAnyo_nacimiento() {
		return anyo_nacimiento;
	}

	public void setAnyo_nacimiento(int anyo_nacimiento) {
		this.anyo_nacimiento = anyo_nacimiento;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	
	
	
	
}
