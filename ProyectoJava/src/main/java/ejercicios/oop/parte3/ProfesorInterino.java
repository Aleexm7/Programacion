package ejercicios.oop.parte3;

import java.util.Date;

public class ProfesorInterino extends Profesor {

	public Date fechaInterinidad;

	public ProfesorInterino(String nombre, String apellidos, int edad, String idProfesor, String asignatura,
			Date fechaInterinidad) {
		super(nombre, apellidos, edad, idProfesor, asignatura);
		this.fechaInterinidad = fechaInterinidad;
	}

	public ProfesorInterino(ProfesorInterino profesor) {
		super(profesor.nombre, profesor.apellidos, profesor.edad, profesor.idProfesor, profesor.asignatura);
		this.fechaInterinidad = profesor.fechaInterinidad;
	}

	@Override
	public boolean equals(Object obj) {
		ProfesorInterino pInterino = (ProfesorInterino) obj;
		if (this.nombre == pInterino.nombre && this.apellidos == pInterino.apellidos && this.edad == pInterino.edad
				&& this.idProfesor == pInterino.idProfesor && this.asignatura == pInterino.asignatura
				&& this.fechaInterinidad == pInterino.fechaInterinidad)
			return true;
		else
			return false;

	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		Profesor pInterino = new ProfesorInterino(this.nombre, this.apellidos, this.edad, this.idProfesor,this.asignatura, this.fechaInterinidad);
		return pInterino;
	}
	
	@Override
	public String toString() {
		return  nombre + " " + apellidos + " " + edad + " " + idProfesor+ " " + asignatura + " " + fechaInterinidad;
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
	
	public void setFechaInterinidad(Date fechaInterinidad) {
		this.fechaInterinidad = fechaInterinidad;
	}
	
	public Date getFechaInterinidad() {
		return fechaInterinidad;
	}
}
