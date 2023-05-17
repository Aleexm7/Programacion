package ejercicios.oop.parte1;

public class Empleado implements Cloneable {

	
	//ATRIBUTOS 
	protected  int idEmpleado;
	private String departamento;
	private Persona persona1;
	private Persona persona;


	// METODOS
	
	 public Empleado(int idEmpleado, String departamento, Persona persona) {
	        this.idEmpleado = idEmpleado;
	        this.departamento = departamento;
	        this.persona = persona;
	    }
	
	 public Empleado(Empleado otroEmpleado) {
	        this.idEmpleado = otroEmpleado.idEmpleado;
	        this.departamento = otroEmpleado.departamento;
	        this.persona = new Persona(otroEmpleado.persona);
	    }
	
	
	 
	
	// SETTER Y GETTER 
	
	public int getIdEmpleado() {
		return idEmpleado;
	}


	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public Persona getPersona1() {
		return persona1;
	}


	public void setPersona1(Persona persona1) {
		this.persona1 = persona1;
	}
	
	
	
}
