import java.util.Scanner;
public class Ativ10 {
    public static void main(String[] args) {
        int soma = 0;
        System.out.println("Números pares de 1 a 100:");
        for (int i = 2; i <= 100; i += 2) {
            soma += i;
            System.out.print(i);
            if (i < 100 - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Soma dos números pares de 1 a 100: " + soma);
        scanner.close();
     }
}