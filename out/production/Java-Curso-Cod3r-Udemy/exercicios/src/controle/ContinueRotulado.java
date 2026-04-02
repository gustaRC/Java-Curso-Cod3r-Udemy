package controle;

public class ContinueRotulado {

	public static void main(String[] args) {
		
		lacoExterno: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				if (i == 1) {
//					continue; //pulará o laço interno (j)
					continue lacoExterno; //pulára o laço externo (i);
				}
				
				System.out.printf("[%d %d] ", i, j);
			}
			
			System.out.println(".");
		}
		
		System.out.println("Fim!");
	}
}
