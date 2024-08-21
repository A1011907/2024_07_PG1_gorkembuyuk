package odevler.bolum02;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen hız değerinizi metre/saniye olarak giriniz");
        float speed = scanner.nextFloat();
        System.out.print("Lütfen ivme değerinizi metre/saniye'2 olarak giriniz");
        float a = scanner.nextFloat();
        float lenght = (speed*speed) / (2*a);
        System.out.print("Bu uçak icin gereken minimum pist mesafesi " + lenght);
        
       



    }
}