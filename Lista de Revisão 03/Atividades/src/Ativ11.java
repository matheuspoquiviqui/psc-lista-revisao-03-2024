import java.util.Scanner;
import java.util.Random;

public class Ativ11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroAleatorio = random.nextInt(100) + 1;
        int tentativas = 0;
        boolean acertou = false;
        
        System.out.println("Bem-vindo ao jogo da Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");
        
        while (!acertou) {
            System.out.print("Digite o seu palpite: ");
            int palpite = scanner.nextInt();
            tentativas++;
            
            if (palpite < numeroAleatorio) {
                System.out.println("O número é maior que o seu palpite.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor que o seu palpite.");
            } else {
                acertou = true;
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas!");
            }
        }
        
        scanner.close();
    }
}
