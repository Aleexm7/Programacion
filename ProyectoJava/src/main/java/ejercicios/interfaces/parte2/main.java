package ejercicios.interfaces.parte2;

public class main {

	public static void main(String[] args) {

		circulo figura1 = new circulo(20);
		figura1.setColor("Rojo");
		figura1.getColor();
		System.out.println("El Area del circulo es = " + figura1.area());

		rectangulo figura2 = new rectangulo(50, 10);
		figura2.setColor("Verde");
		figura2.getColor();
		System.out.println("El Area del rectangulo es = " + figura2.area());

	}

}
