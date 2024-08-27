package odevler.bolum02;
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("kenar uzunluğunu giriniz");
        double kenar = scanner.nextDouble();
        double alan = (3 * Math.sqrt(3) / 2) * (kenar * kenar);
        System.out.printf("Altıgenin alanı: %.2f\n", alan);
        
       

    }
}