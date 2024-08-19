package odevler.bolum02;


import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yarı çapı giriniz!");
        double yarıcap =scanner.nextDouble();
        System.out.println("Lütfen yükseklik degerini giriniz!");
        double yukseklık =scanner.nextDouble();
        double pi = 3.14;
        double alan = yarıcap*yarıcap*pi;
        double hacim = alan*yukseklık;
        System.out.println("ALAN = "+alan);
        System.out.println("hacim = "+hacim);
        


    }
}
