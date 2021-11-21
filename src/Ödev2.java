import java.util.Scanner;
public class Ödev2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ? :");
        int armut=input.nextInt();
        System.out.println("Elma Kaç Kilo ? :");
        int elma=input.nextInt();
        System.out.println("Domates Kaç Kilo ? :");
        int domates=input.nextInt();
        System.out.println("Muz Kaç Kilo ? :");
        int muz=input.nextInt();
        System.out.println("Patlıcan Kaç Kilo ? :");
        int patlıcan=input.nextInt();
        double tutar=armut*2.14+elma*3.67+domates*1.11+muz*0.95+patlıcan*5;
        System.out.println("Toplam Tutar : "+tutar);
    }
}
