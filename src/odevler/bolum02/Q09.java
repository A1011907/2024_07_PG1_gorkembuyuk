package odevler.bolum02;
import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen metre cinsinden ilk hız değerinizi girin");
        float v0 = scanner.nextFloat();
        System.out.print("Lütfen metre cinsinden son hız değerinizi girin");
        float v1 = scanner.nextFloat();
        System.out.print("Lütfen saniye cinsinden zaman değerinizi girin");
        float t = scanner.nextFloat();
        float  a =(v1-v0)/t;
        System.out.print("ortalama ivme  = " + a);
        
        
       

    }
}