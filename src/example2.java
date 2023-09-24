import java.util.Scanner;
import java.util.WeakHashMap;

public class example2 {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("bir gun yaziniz..");
        String gunler =sc.nextLine();

        String whatDay;

        switch (gunler){
            case ("Monday"):
                whatDay = ("Work Day");
                break;
            case ("Tuesday"):
                whatDay = ("work Day");
                break;
            case ("Wednesday"):
                whatDay =(" Work Day");
                break;
            case ("Thursday"):
                whatDay =(" Work Day");
                break;
            case ("Friday"):
                whatDay =(" Work Day");
                break;
            case ("Saturday"):
                whatDay =(" Free Day");
                break;
            case ("Sunday"):
                whatDay =(" Free Day");
                break;
            default: whatDay =("bir hata yaptiniz");
        }
        System.out.println(whatDay);




    }
}
