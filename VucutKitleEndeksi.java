package Giris;
import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {

    double boy;
    double kilo;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu (Metre Cinsinden) Giriniz : ");
            boy = input.nextDouble();

        System.out.print("Lütfen Kilonuzu Giriniz : ");
            kilo = input.nextDouble();

        double sonuc = kilo / (boy * boy);
        System.out.print("Vücut Kitle Endeksiniz : " + sonuc);


    }
}
