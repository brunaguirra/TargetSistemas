import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Cria um Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita e lê o número do usuário
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        
        // Calcula a sequência de Fibonacci até o número informado
        int fibAnterior = 0;
        int fibAtual = 1;
        boolean encontrado = false;
        
        while (fibAtual <= numero) {
            if (fibAtual == numero) {
                encontrado = true;
                break;
            }
            int proximoFib = fibAnterior + fibAtual;
            fibAnterior = fibAtual;
            fibAtual = proximoFib;
        }
        
        // Exibe uma mensagem indicando se o número está na sequência ou não
        if (encontrado) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }
        
        scanner.close();
    }
}
