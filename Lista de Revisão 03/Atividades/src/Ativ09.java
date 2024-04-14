import java.util.Scanner;
public class Ativ09 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva um número inteiro para saber sua tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(numero + "x" + i + " = " + (numero * i) );
            
        }
        scanner.close();
    }
    
}
