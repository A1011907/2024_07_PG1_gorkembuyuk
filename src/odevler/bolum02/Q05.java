package odevler.bolum02;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen ara toplamı giriniz (TL): ");
        double aratoplam = scanner.nextDouble();

        System.out.print("Lütfen komisyon oranını giriniz (yüzde olarak): ");
        double komisyonorani = scanner.nextDouble();

        double komisyonmiktari = aratoplam * (komisyonorani / 100);
        double toplamtutar = aratoplam + komisyonmiktari;

        System.out.printf("Komisyon miktarı: %.2f TL%n", komisyonmiktari);
        System.out.printf("Toplam tutar: %.2f TL%n", toplamtutar);

        
    }
}
