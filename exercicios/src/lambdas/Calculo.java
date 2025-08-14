package lambdas;

@FunctionalInterface
public interface Calculo {

//	public e abstract não são obrigatorios, pois implicitamente
//	todo método de uma interface é abstrato e público
	public abstract double executar(double a, double b);
}
