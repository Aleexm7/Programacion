package ejercicio.mvc;

import java.util.ArrayList;

public class Model {

	private ArrayList<Coche> parking;

    public Model() {
        parking = new ArrayList<>();
    }

    public void crearCoche(String marca, String modelo, String color) {
        Coche coche = new Coche(marca, modelo);
        parking.add(coche);
    }

    public void cambiarVelocidad(String marca, int nuevaVelocidad) {
        for (Coche coche : parking) {
            if (coche.getMatricula().equals(marca)) {
                coche.setVelocidad(nuevaVelocidad);
                break;
            }
        }
    }

    public int getVelocidad(String marca) {
        for (Coche coche : parking) {
            if (coche.getMatricula().equals(marca)) {
                return coche.getVelocidad();
            }
        }
        return -1; // Marca de coche no encontrada
    }
}
