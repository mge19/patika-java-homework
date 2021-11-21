import java.util.Scanner;
public class Pratik3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("1.Kenar uzunluğunu girin:");
        int a=input.nextInt();
        System.out.println("2.Kenar uzunluğunu girin:");
        int b=input.nextInt();
        System.out.println("3.Kenar uzunluğunu girin:");
        int c=input.nextInt();
        double u=(a+b+c)/2,alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı:"+alan);
    }
}
