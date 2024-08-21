package odevler.bolum02;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu girin!");
        double boy = scanner.nextDouble();
        System.out.print("Lütfen boyunuzu girin!");
        double kilo = scanner.nextDouble();
        double BMI = kilo / (boy*boy);
        System.out.println("Boy kilo endeksine göre == " + BMI);
        


    }
}