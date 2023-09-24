import java.util.Scanner;

public class methods1example {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.nextLine();
        String concatedName = nameCombine(name);
        System.out.println(concatedName);

        System.out.println("max of two numbers" + finMaxTwoNumbers(34,67));

    }

    public static int finMaxTwoNumbers(int first,int second)
    {
        if(first>second)
            return  first;
        else
            return second;
    }

    public static String nameCombine(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your surname");
        String surname = sc.nextLine();
        return name + " " + surname;
    }
}
