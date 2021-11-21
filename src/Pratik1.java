import java.util.Scanner;
public class Pratik1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik notunu girin:");
        int mat=input.nextInt();
        System.out.println("Fizik notunu girin:");
        int fiz=input.nextInt();
        System.out.println("Kimya notunu girin:");
        int kim=input.nextInt();
        System.out.println("Türkçe notunu girin:");
        int tur=input.nextInt();
        System.out.println("Tarih notunu girin:");
        int tar=input.nextInt();
        System.out.println("Müzik notunu girin:");
        int muz=input.nextInt();
        float ort=(mat+fiz+kim+tur+tar+muz)/6;
        System.out.println((ort<60) ? "Sınıfta kaldı":"Sınıfı geçti");
    }
}