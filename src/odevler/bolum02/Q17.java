package odevler.bolum02;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Hava sıcaklığını Fahrenheit olarak giriniz: ");
        double sicaklik = scanner.nextDouble();

        System.out.print("Rüzgar hızını mil/saat olarak giriniz: ");
        double ruzgarHizi = scanner.nextDouble();

        
        if (sicaklik <= 50 && ruzgarHizi >= 3) {
            
            double hissedilenSicaklik = 35.74
                    + 0.6215 * sicaklik
                    - 35.75 * Math.pow(ruzgarHizi, 0.16)
                    + 0.4275 * sicaklik * Math.pow(ruzgarHizi, 0.16);
            
            System.out.printf("Hissedilen sıcaklık: %.2f°F\n", hissedilenSicaklik);
        } else {
            System.out.println("Formül sadece 50°F ve altındaki sıcaklıklar ve 3 mil/saat üzerindeki rüzgar hızları için geçerlidir.");
        }
    }
}
