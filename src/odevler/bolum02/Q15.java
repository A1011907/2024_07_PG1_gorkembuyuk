package odevler.bolum02;
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci noktanın x1 ve y1 koordinatlarını giriniz: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("İkinci noktanın x2 ve y2 koordinatlarını giriniz: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double mesafe =Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("İki nokta arasındaki mesafe: " + mesafe);

    }
}