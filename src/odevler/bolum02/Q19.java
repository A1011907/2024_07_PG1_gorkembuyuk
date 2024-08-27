package odevler.bolum02;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Birinci köşenin x koordinatını girin: ");
        double x1 = scanner.nextDouble();
        System.out.print("Birinci köşenin y koordinatını girin: ");
        double y1 = scanner.nextDouble();

        System.out.print("İkinci köşenin x koordinatını girin: ");
        double x2 = scanner.nextDouble();
        System.out.print("İkinci köşenin y koordinatını girin: ");
        double y2 = scanner.nextDouble();

        System.out.print("Üçüncü köşenin x koordinatını girin: ");
        double x3 = scanner.nextDouble();
        System.out.print("Üçüncü köşenin y koordinatını girin: ");
        double y3 = scanner.nextDouble();

        
        double area = Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0;

        
        System.out.printf("Üçgenin alanı: %.2f\n", area);
    }
}
