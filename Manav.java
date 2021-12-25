package Giris;
import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {

        double armut = 2.14 , elma = (3.67) , domates = (1.11) , muz = (0.95) , patlican = (5);
        double armutKg , elmaKg , domatesKg , muzKg , patlicanKg;
        double armutT , elmaT , domatesT , muzT , patlicanT;

                Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç kilo ? : ");
        armutKg = input.nextDouble();
        System.out.print("Elma Kaç kilo ? : ");
        elmaKg = input.nextDouble();
        System.out.print("Domates Kaç kilo ? : ");
        domatesKg = input.nextDouble();
        System.out.print("Muz Kaç kilo ? : ");
        muzKg = input.nextDouble();
        System.out.print("Patlıcan Kaç kilo ? : ");
        patlicanKg = input.nextDouble();

            armutT = armut * armutKg;
            elmaT = elma * elmaKg;
            domatesT = domates * domatesKg;
            muzT = muz * muzKg;
            patlicanT = patlican * patlicanKg;

            

        double tutar = (armutT + elmaT + domatesT + muzT + patlicanT);

        System.out.print("Toplam Tutar : " + tutar);



    }
}
