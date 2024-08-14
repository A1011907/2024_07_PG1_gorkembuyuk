package odevler.bolum01;
public class Q07 {
    public static void main(String[] args) {
        double kilometers = 14.0;
        double timeminutes = 45.0;
        double timeSeconds= 30.0;
        double miles = kilometers /1.6;
        double  timehours= timeminutes/60.0+timeSeconds/3600.0;
        double averageSpeed= miles/timehours;
        System.out.println("ORTALAMA HIZINIZ:"+averageSpeed+"mil/saat");
    }
}