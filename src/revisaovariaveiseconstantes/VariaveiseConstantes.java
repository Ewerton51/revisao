package revisaovariaveiseconstantes;

import java.util.Scanner;

public class VariaveiseConstantes {

	public static void main(String[] args) {
		
		int opcao;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
		System.out.println("\n--Digite 1 para ver a indicação de um livro--");
		System.out.println("\n--Digite 2 para ler uma frase motivacional--");
		System.out.println("\n--Digite 3 para receber uma indicação de música--");
		opcao = ler.nextInt();
		
		switch(opcao) {
			case 1:
				System.out.println("Livro: As Crônicas de Nárnia - Volume único1");
				break;
			case 2:
				System.out.println("Se você cair, levante! Não dá para andar deitado.");
				break;
			case 3:
				System.out.println("Galantis - Gold Dust");
				break;
				default:
					System.out.println("Opção inválida!");
		}		
		
	}

}
