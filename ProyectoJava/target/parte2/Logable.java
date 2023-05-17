package ejercicios.interfaces.parte2;

public interface Logable {

	String leerMensaje(); // devuelve el texto de un mensaje

	void cambiarMensaje(String mensaje); //cambia el texto del mensaje

	void cambiarPrioridadAlta();//cambia la prioridad del mensaje a alta

	void cambiarPrioridadBaja();//cambia la prioridad del mensaje a baja

	void cambiarPrioridadMedia();//cambia la prioridad del mensaje a media
}
