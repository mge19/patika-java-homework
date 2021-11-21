import java.util.Scanner;
public class Pratik2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Ürün tutarını girin:");
        float tutar=input.nextFloat();
        tutar*=(tutar>1000)?1.08:1.18;
        System.out.println("KDV'li tutar:"+tutar+"TL");
    }
}
