public class twelfth {
    public static void main(String[] args)
    {
        boolean hungry = true;

        if(hungry){
            int x=90;
            System.out.println("I am starving...");
        }else {
            System.out.println("I am not hungry..");
        }

        int hungerRating = 5;
        if (!(hungerRating < 6)){
            System.out.println("Not hungry");
        }else {
            System.out.println("I am Starving");
        }

        int favoriteTemp = 75;
        int currentTemp = 75;
        String opinion;

        if(currentTemp < favoriteTemp -30){
            opinion = "It is pretty darn cold...";
        } else if(currentTemp < favoriteTemp -20) {
            opinion = "It's kinda cold out...";
        } else if (currentTemp > favoriteTemp + 10) {
            opinion = "It's hot out...";
        }else {
            opinion = "It's a beaitiful day.. ";
        }
        System.out.println(opinion);

        int month = 4;

        month=6;

        String monthString;

        switch (month){
            case 1 :
                monthString ="January";
            break;
            case 2 :
                monthString = "February";
            break;
            case 3 :
                monthString ="March";
            break;
            case 4 :
                monthString ="April";
            break;
            default: monthString = "Unknown month";
            break;
        }

        System.out.println(monthString);
    }

    public static int sum(int x,int y)
    {


       return x+y;
    }
}
