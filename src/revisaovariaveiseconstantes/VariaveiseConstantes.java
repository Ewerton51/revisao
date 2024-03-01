package revisaovariaveiseconstantes;

import java.util.Scanner;

public class VariaveiseConstantes {

    public static void main(String[] args) {

        String continua = "s";
        int numero1, numero2, resultado;
        Scanner ler = new Scanner(System.in);

        while (!continua.equals("n")) {
            System.out.println("Digite o primeiro valor: ");
            numero1 = ler.nextInt();

            System.out.println("Digite o segundo valor: ");
            numero2 = ler.nextInt();

            resultado = numero1 + numero2;

            System.out.println("\nO resultado da soma é: " + resultado);

            System.out.println("\n++++++++++++++++MENU++++++++++++++++++");
            System.out.println("Deseja finalizar o exercício ou passar para o próximo?");
            System.out.println("\nDigite S para o próximo OU digite N para finalizar o programa: ");
            continua = ler.next();
            System.out.println("++++++++++++++++++++++++++++++++++");
            
            if (!continua.equals("n")) {
                System.out.println("\n++++++++++++++++Próximo exercício++++++++++++++++++");

                int result, num, cont = 1;

                while (cont < 4) {
                    System.out.println("Digite o " + cont + "º número:");
                    num = ler.nextInt();

                    result = num * 3;
                    System.out.println(num + " x 3 = " + result);
                    System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
                    cont++;
                }
                
            }
            System.out.println("\t\t_________Fim do programa_________");
        }

        
    }

}