import java.util.Scanner;
public class Pratik4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Yarıçapı girin:");
        int r=input.nextInt();
        System.out.println("Merkez açı ölçüsünü girin:");
        int a=input.nextInt();
        double x=3.14*r*r*a/360;
        System.out.println("Alan:"+x);
    }
}
