package Giris;
import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;
        int Maymun = 0, Horoz = 1, Köpek = 2, Domuz = 3, Fare = 4, Öküz = 5, Kaplan = 6, Tavşan= 7, Ejderha = 8, Yılan = 9, At = 10, Koyun = 11;

        System.out.print("Doğum Yılınızı Giriniz : ");
        year = input.nextInt();


        if(year %12 == 0) {
            System.out.println("Çin zodyağı burcunuz: Maymun");
        }else if(year % 12 == 1) {
            System.out.println("Çin zodyağı burcunuz: Horoz");
        }
        else if(year % 12 == 2) {
            System.out.println("Çin zodyağı burcunuz: Köpek");
        }
        else if(year % 12 == 3) {
            System.out.println("Çin zodyağı burcunuz: Domuz");
        }
        else if(year % 12 == 4) {
            System.out.println("Çin zodyağı burcunuz: Fare");
        }
        else if(year % 12 == 5) {
            System.out.println("Çin zodyağı burcunuz: Öküz");
        }
        else if(year % 12 == 6) {
            System.out.println("Çin zodyağı burcunuz: Kaplan");
        }
        else if(year % 12 == 7) {
            System.out.println("Çin zodyağı burcunuz: Tavşan");
        }
        else if(year % 12 == 8) {
            System.out.println("Çin zodyağı burcunuz: Ejderha");
        }
        else if(year % 12 == 9) {
            System.out.println("Çin zodyağı burcunuz: Yılan");
        }
        else if(year % 12 == 10) {
            System.out.println("Çin zodyağı burcunuz: At");
        }
        else if(year % 12 == 11) {
            System.out.println("Çin zodyağı burcunuz: Koyun");
        }










    }
}
