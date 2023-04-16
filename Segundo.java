import java.util.Scanner;

public class Segundo {
    public static void main(String[] args) {
        // Filtro de Fibonacci - Feito por João Guioto
        // 0, 1, 1, 2, 3, 5, 8, 13...
        // "informado um número, ele calcule a sequência de Fibonacci e 
        // retorne uma mensagem avisando se o número informado pertence ou não a sequência"

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número para confirmarmos se ele apareceria na sequência de Fibonacci");
        int numeroSolicitado = leia.nextInt();
        System.out.println("O número para confirmarmos se ele apareceria na sequência de Fibonacci é " + numeroSolicitado);

        int a = 0, b = 1;
        int contagem = 0;
        System.out.println("Fibonacci com início de 0 e 1");
        while (numeroSolicitado > contagem) {
            contagem = a + b;
            a = b;
            b = contagem;
            System.out.println(b);
        }
        if (contagem == numeroSolicitado) {
            System.out.println("\nO número digitado está na lista Fibonacci com início de 0 e 1");
        }
        else {
            System.out.println("\nO número digitado não está na lista Fibonacci com início de 0 e 1");
        }

        leia.close();

    }
    
}
