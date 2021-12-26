package Giris;
import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username , password , evet , newPassword;

        System.out.print("Kullanıcı Adınız : ");
        username = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yapıldı");

        }else {
            System.out.println("Bilgileriniz Yanlış !");
            System.out.print("Şifrenizi Sıfırlamak İster Misiniz ? : ");
            evet = input.nextLine();
            if (evet.equals("evet")){
                System.out.print("Lütfen Yeni Şifrenizi Giriniz : ");
                newPassword = input.nextLine();
                if (newPassword.equals("java123")){
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else {
                    System.out.println("Şifre Oluşturuldu");
                }
            }
        }
    }
}