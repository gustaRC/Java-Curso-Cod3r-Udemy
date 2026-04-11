package padroes.observer;

public class AniversarioSurpresa {

//	função executadora
	public static void main(String[] args) {
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		porteiro.registrarObservador(namorada);
		porteiro.registrarObservador(e -> System.out.println("Surpresa via lambda!")); // lambda + functionalInterface = sem novas instanciações/classes
		porteiro.monitorar(); // aonde tudo acontece
	}
}
