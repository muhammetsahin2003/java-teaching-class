import javax.swing.*;
import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Birinci Sayiyi Giriniz..");
        int number1 = sc.nextInt();
        System.out.println("Ikinci Sayiyi Giriniz");
        int number2 = sc.nextInt();
        System.out.println("Ucuncu sayiyi giriniz");
        int number3 = sc.nextInt();

        String max;

        if (number1>number2){

            if (number1>number3)
                max = ("max number1");
            else
                max= ("max number3");

        }
        else {
            if(number2>number3)
            max = ("max number2");
            else
                max=("max number3");
        }
        System.out.println(max);
        }





    }

