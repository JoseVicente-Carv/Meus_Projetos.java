import java.util.Scanner;

public class novoexercio {
    public static void main(String[] args) {
        Scanner yas = new Scanner(System.in);

        System.out.println("Digite o salario da pessoa: ");
        double salario = yas.nextDouble();

        yas.close();

        if (salario < 3000) {
            System.out.println("POBRE!");
        } else {
            System.out.println("Burgues.");
        }
    }
}