import java.util.Scanner;
public class Ödev1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        double boy=input.nextFloat();
        System.out.println("Lütfen kilonuzu giriniz :");
        int kilo=input.nextInt();
        double bmi=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : "+bmi);
    }
}
