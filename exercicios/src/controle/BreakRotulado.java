package controle;

public class BreakRotulado {

	public static void main(String[] args) {

		lacoExterno: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				if (i == 1) {
//					break; //sairá do laço interno (j)
					break lacoExterno; //sairá do laço externo (i);
				}
				
				System.out.printf("[%d %d] ", i, j);
			}
			
			System.out.println(".");
		}
		
		System.out.println("Fim!");
	}
}
