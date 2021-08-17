package Figuras;

public class Rectangulo {

	double ancho,alto;
	public Rectangulo(double ancho, double alto) {
		this.ancho=ancho;
		this.alto=alto;
	}
	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
	}
	
	public double getPerometro() {
		return this.alto * 2 + this.ancho * 2 ; 
	} 
	//Prueba
	
}
