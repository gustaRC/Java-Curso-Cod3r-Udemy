package classe;

public class AreaCircInstanciada {

	public static void main(String[] args) {

		AreaCirc a1 = new AreaCirc(10);
//		a1.pi = 1;
		
		System.out.println("a1 area: " + a1.area());
		System.out.println(AreaCirc.PI);
		System.out.println(AreaCirc.area(10));
	}
}
