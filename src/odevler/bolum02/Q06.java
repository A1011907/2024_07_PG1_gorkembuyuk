package odevler.bolum02;
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("0 ile 1000 arasında bir tam sayı girin: ");
        int sayi = scanner.nextInt();
        int toplam = 0;
        while (sayi>0){
            toplam+=sayi%10;
            sayi/=10;
            
        }
        System.out.println("Basamakların toplamı: " + toplam);
    }
}
