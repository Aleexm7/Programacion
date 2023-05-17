package ejercicios.oop.parte3;


public class Persona {

	
	public String nombre;
	public String apellidos;
	public int edad;
	
	
	
	public Persona(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	public Persona(Persona persona) {
		this.nombre= persona.getNombre();
		this.apellidos = persona.getApellidos();
		this.edad = persona.getEdad();
	}
	

	@Override
	public boolean equals(Object obj) {
		Persona p=(Persona) obj;
		if(this.nombre == p.nombre && this.apellidos ==p.apellidos && this.edad == p.edad)
			return true;		
		else
			return false;
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		Persona persona1 = new Persona(this.nombre, this.apellidos, this.edad);
		return persona1;
	}

	@Override
	public String toString() {
		return  nombre + " " + apellidos + " " + edad;
	}
	
	//SETTER Y GETTER
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getEdad() {
		return edad;
	}
}
