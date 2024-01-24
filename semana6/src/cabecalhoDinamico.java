import java.util.Scanner;

public class cabecalhoDinamico {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe a quantidade de Asteriscos: ");

        int quantAsterisco = leitura.nextInt();

        for (int i = 0;i <= quantAsterisco; i++){
            System.out.print("*");
        }
        System.out.println("\nBem vindo ao Comex!");
        for (int i = 0;i <= quantAsterisco; i++){
            System.out.print("*");
        }
    }
}
