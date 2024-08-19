package odevler.bolum02;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sıcaklık derecesini giriniz");
        double derece =scanner.nextDouble();
        double fahrenheit = (9.0/5)*derece+32;
        System.out.println("Girdiğiniz santigrat derecenin fahenheit karşılığı = "+fahrenheit);
        
        

    }
}
