package odevler.bolum02;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen dakika cinsinden bi değer giriiniz");
      double yıllıkfaiz=0.05;
      double aylıkfaiz =yıllıkfaiz/12;
        System.out.print("Lütfen aylık biriktirdiğiniz para miktarını giriniz (TL): ");
        double aylikbiriktirme= scanner.nextDouble();
        double hesapbakiyesi= 0;
        for (int ay=1; ay <=6; ay++){
            
            hesapbakiyesi = (hesapbakiyesi+aylikbiriktirme)*(1+aylıkfaiz);
            
        }

        System.out.printf("Altıncı ayın sonunda hesap bakiyesi: %.2f TL\n", hesapbakiyesi);



    }
}