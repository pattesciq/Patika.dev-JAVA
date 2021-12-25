package Giris;
import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {

        int a, b;
        double c;
        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin 'A' Kenarını Yazınız : ");
        a = input.nextInt();
        System.out.print("Üçgenin 'B' Kenarını Yazınız : ");
        b = input.nextInt();
        System.out.print("Üçgenin 'C' Kenarını Yazınız : ");
        c = input.nextDouble();

            double UcgeninCevresi = a + b + c;
            double U = UcgeninCevresi / 2;
            double AlanX2 = U * (U - a) * (U - b) * (U - c);
            double alan = Math.sqrt(AlanX2);
        System.out.println("Üçgenin Alanı : " + alan);

        }
}























