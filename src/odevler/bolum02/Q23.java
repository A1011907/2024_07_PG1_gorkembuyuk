package odevler.bolum02;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("mesafeyi giriniz");
        double mesafe = scanner.nextDouble();
        System.out.print("aracınızın yakıt tüketimini giriniz giriniz");
        double yakıttüket  = scanner.nextDouble();
        System.out.print("aldığınız yakıtı girin");
        double yakıt = scanner.nextDouble();
        double sonuc = (yakıttüket*mesafe)*yakıt;
        System.out.print("Ortalama toplam sürüş maliyeti");
        
        
    }
}
