import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitação ao usuário para inserir um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numeroPrimitivo = scanner.nextInt(); // Lendo o valor como um tipo primitivo int

        // Fechando o scanner
        scanner.close();

        // Convertendo o tipo primitivo para o tipo wrapper correspondente
        Integer numeroWrapper = Integer.valueOf(numeroPrimitivo);

        // Imprimindo o valor no console
        System.out.println("Valor do tipo primitivo: " + numeroPrimitivo);
        System.out.println("Valor do tipo wrapper: " + numeroWrapper);
    }
}