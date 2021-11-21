import java.util.Scanner;
public class Pratik5 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("1.Sayıyı Giriniz:");
        int sayi1= input.nextInt();
        System.out.println("2.Sayıyı Giriniz:");
        int sayi2=input.nextInt();
        System.out.println("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme\nSeçiniz:");
        int secim=input.nextInt();
        switch (secim){
            case 1:
                float sonuc=sayi1+sayi2;
                System.out.println("Sonuç:"+sonuc);
                break;
            case 2:
                sonuc=sayi1-sayi2;
                System.out.println("Sonuç:"+sonuc);
                break;
            case 3:
                sonuc=sayi1*sayi2;
                System.out.println("Sonuç:"+sonuc);
                break;
            case 4:
                sonuc=sayi1/sayi2;
                System.out.println("Sonuç:"+sonuc);
                break;
        }
    }
}
