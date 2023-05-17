package ejercicios.oop.parte3;

public class Profesor extends Persona {

	public String idProfesor;
	public String asignatura;
	
	
	
	public Profesor (String nombre, String apellidos, int edad, String idProfesor, String asignatura) {
		super(nombre, apellidos, edad);
		this.idProfesor = idProfesor;
		this.asignatura = asignatura;
	}
	
	public Profesor (Profesor p) {
		super(p.nombre, p.apellidos, p.edad);
		this.idProfesor = p.idProfesor;
		this.asignatura = p.asignatura;
	}
	
	@Override
	public boolean equals(Object obj) {
		Profesor profesor=(Profesor) obj;
		if(this.nombre == profesor.nombre && this.apellidos ==profesor.apellidos && this.edad == profesor.edad && this.idProfesor == profesor.idProfesor && this.asignatura == profesor.asignatura)
			return true;		
		else
			return false;
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		Profesor profesor1 = new Profesor(this.nombre, this.apellidos, this.edad, this.idProfesor,this.asignatura);
		return profesor1;
	}
	
	@Override
	public String toString() {
		return  nombre + " " + apellidos + " " + edad + " " + idProfesor+ " " + asignatura;
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
	
	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}
	
	public String getIdProfesor() {
		return idProfesor;
	}
	
	public void setAsignatura(String Asignatura) {
		this.asignatura = Asignatura;
	}
	
	
	
}
