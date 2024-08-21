package odevler.bolum02;
import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen dakika cinsinden bi değer giriiniz");
        int min = scanner.nextInt();
        int year= min/525600;
        int minrema= min%525600;
        
        int day= minrema/1440;
        minrema=minrema%1440;
        System.out.println(min + " dakika yaklaşık " + year + " yıl ve " + day + " gün eder.");
        
       
  }
}