package examen.entorno;

public class ContactoControlador {

	private  ContactoModelo modelo;
    private  ContactoVista vista;

    public ContactoControlador(ContactoModelo modelo, ContactoVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void crearContacto(String nombre, String telefono, String direccion) {
    	 
    	        modelo.setNombre(nombre);
    	        modelo.setTelefono(telefono);
    	        modelo.setDireccion(direccion);

    	        vista.mostrarContacto(modelo.getNombre(), modelo.getTelefono(), modelo.getDireccion());
}
    
   public static void main(String[] args) {
	   // Creamos instancias de ContactoModelo, ContactoVista y ContactoControlador
       ContactoModelo m = new ContactoModelo();
       ContactoVista v= new ContactoVista();
       ContactoControlador c = new ContactoControlador(m, v);

       // Creamos un nuevo contacto utilizando el controlador
       c.crearContacto("Juan Alberto", "955641233", "Calle Amor de dios 34");
       
       // Creamos la segunda instancia de ContactoModelo, ContactoVista y ContactoControlador
       ContactoModelo m2 = new ContactoModelo();
       ContactoVista v2 = new ContactoVista();
       ContactoControlador c2 = new ContactoControlador(m2, v2);

       // Crear otro contacto utilizando el segundo controlador
       c2.crearContacto("Lidia Rodriguez", "696508517", "Calle Gloria Padre 6");
   }
   }


    

