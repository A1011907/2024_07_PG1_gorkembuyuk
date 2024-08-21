package odevler.bolum02;
import java.util.Scanner;
import java.util.Calendar;
import java.util.TimeZone;
public class Q08 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen GMT'ye göre bulunulan zaman dilimini girin (örneğin, +3 veya -5): ");
        int gmtOffset = scanner.nextInt(); 

        
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

       
        int currentHourGMT = calendar.get(Calendar.HOUR_OF_DAY);
        int currentMinute = calendar.get(Calendar.MINUTE);
        int currentSecond = calendar.get(Calendar.SECOND);

        
        int localHour = (currentHourGMT + gmtOffset + 24) % 24; // +24 ve %24 ile negatif saatleri de düzeltiyoruz

        
        System.out.println("GMT saati: " + currentHourGMT + ":" + currentMinute + ":" + currentSecond);
        System.out.println("Belirtilen zaman dilimindeki saat: " + localHour + ":" + currentMinute + ":" + currentSecond);

        
        
    }
}
    
    
    
    
    
    
    
    
    
    
}
