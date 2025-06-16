package classe;

public class AreaCirc {

	double raio;
	static final double PI = 3.14;

	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}

	double area() {
		return PI * Math.pow(raio, 2);
		// pow é um método static do Math, porque não precisamos inicializar o Math para
		// ter acesso ao método!
	}
	
	static double area(double raioDesejado) {
		return PI * Math.pow(raioDesejado, 2);
	}
}
