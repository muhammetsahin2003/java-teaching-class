import java.util.Scanner;

public class IfElseandSwitch {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Print Grade");
       int grade = sc.nextInt();

       String harfNotu;

       if (grade>=90){
           harfNotu =("AA");
       }else if (grade<90 && grade>=80) {
           harfNotu = ("BA");
        }else if (grade<80 && grade>=70){
           harfNotu = ("BB");
       } else if (grade<70 && grade>=60) {
           harfNotu = ("CC");
       } else if (grade<60) {
           harfNotu = ("DD");
       }else {
           harfNotu = ("Could not pass..");
       }
        System.out.println(harfNotu);

       String HarfnotuKarsiligi;

       switch (harfNotu){
           case ("AA"):
               HarfnotuKarsiligi=("Great..");
               break;
           case ("BA"):
               HarfnotuKarsiligi=("Good..");
               break;
           case ("BB"):
               HarfnotuKarsiligi=("Not Bad");
               break;
           case ("CC"):
               HarfnotuKarsiligi=("Could Pass");
               break;
           case ("DD"):
               HarfnotuKarsiligi=("Could Not pass");
               break;
           default: HarfnotuKarsiligi=("Should Study");

       }
        System.out.println(HarfnotuKarsiligi);



    }

}
