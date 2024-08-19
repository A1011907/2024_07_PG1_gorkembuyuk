package odevler.bolum02;


import javax.crypto.KeyGenerator;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ağırlığı pound cinsinden giriniz!");
        double pound =scanner.nextDouble();
        double kilogram =pound*0.45359237;
        System.out.println("ağırlığınıız kilo olarak karşılığı = "+kilogram);
        



///

    }
}
