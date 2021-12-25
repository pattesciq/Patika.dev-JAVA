package Giris;
import java.util.Scanner;

public class Daire2 {
    public static void main(String[] args) {

        double r;
        double pi = 3.14;
        double a;

            Scanner input = new Scanner(System.in);

        System.out.print("Daire'nin Yarıçapını Yazınız : ");
        r = input.nextDouble();
        System.out.print("'A' Açısı Yazınız : ");
        a = input.nextDouble();

        double sonuc = (pi * (r * r) * a ) / 360;
        System.out.print("Dilim'in Alanı : " + sonuc );


    }
}
