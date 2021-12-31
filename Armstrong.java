package Giris;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {

        int x = 999;
        for (int i = 1;i <= x;i++){
            int basNumber = 0;
            int tempNumber = i;
            int basValue;
            int basPow;
            int result = 0;
            while (tempNumber != 0){
                tempNumber /= 10;
                basNumber++;
            }
            tempNumber = i;
            while (tempNumber != 0){
                basValue = tempNumber %10;
                basPow = 1;
                for (int u = 1; u <= basNumber;u++){
                    basPow *=basValue;

                }
                result += basPow;
                tempNumber /= 10;
            }
            if (result == i){
                System.out.println(result);
            }
        }
    }
}
        /*
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int number = inp.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        // Basamak sayısını bulma
        while (tempNumber != 0){
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        // her bir basamağın değerini bulduk
        while (tempNumber != 0){
            basValue = tempNumber % 10;
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }
        System.out.println(result);
        */












