package Giris;
import java.util.Scanner;

    public class Baslangic {
    public static void main(String[] args) {
        int mat, fizik ,turkce ,kimya ,muzik ,tarih;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

            int toplam = (mat + fizik + turkce + kimya + muzik + tarih);
        double sonuc = toplam / 6;

            System.out.println("Ortalamanız : " + sonuc);

                boolean kosul = sonuc >= 60;
            String str = (kosul) ? "Geçtiniz" : "Kaldınız";
        System.out.println(str);


        
    }
}