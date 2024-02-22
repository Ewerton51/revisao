package revisaovariaveiseconstantes;

import java.util.Scanner;

public class VariaveiseConstantes {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float nota01, nota02, nota03, media;
		
		System.out.println("\nDigite a primeira nota: ");
		nota01 = ler.nextFloat();
		
		System.out.println("\nDigite a segunda nota: ");
		nota02 = ler.nextFloat();
		
		System.out.println("\nDigite a terceira nota: ");
		nota03 = ler.nextFloat();
		
		media = (nota01 + nota02 + nota03)/3;
		
		if (media >= 7) {
			System.out.println("\nParabéns! Sua nota final foi "+media+" você passou");
		}else if(media == 6){
			System.out.println("Sua nota foi "+media+ "você está de recuperação!");
		}else {
			System.out.println("Sua nota foi "+media+" você está reprovado!");
		}
		
	}

}
