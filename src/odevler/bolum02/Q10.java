package odevler.bolum02;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen ilk sıcaklık değerinizi giriniz");
        float initialTemp= scanner.nextFloat();
        System.out.print("Lütfen son sıcaklık değerinizi giriniz");
        float finalTemp=scanner.nextFloat();
        System.out.print("Lütfen su değerin kg olarak giriniz");
        float M=scanner.nextFloat();
        float Q= M*(finalTemp-initialTemp)*4184;
        System.out.print("the energy needed is " + Q);
        
        


    }
}