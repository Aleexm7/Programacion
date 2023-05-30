package ejercicio.mvc;

public class View {

	//Metodo para mostrar los datos del coche creado
	public void mostrarCoche(Coche coche) {
        System.out.println("Marca: " + coche.getMatricula());
        System.out.println("Velocidad: " + coche.getVelocidad() + " km/h");
    }
}
