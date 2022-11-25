public class Main {

    // Method Overloading - same method name, different parameters
    // Java calls the proper method based off the input parameters
    // increases readability


    public static void main(String[] args) {

        int newScore1 =  calculateScore("Jim", 500, 12);
        System.out.println("New score is " + newScore1);

        int newScore =  calculateScore("Bob", 500);
        System.out.println("New score is " + newScore);

        calculateScore("Jane");

        calculateScore();

        System.out.println("\n");

        calcFeetAndInchesToCentimeters(7, 10);
        calcFeetAndInchesToCentimeters(48);

        double centimeters = calcFeetAndInchesToCentimeters(5,10);
        if (centimeters <0.0){
            System.out.println("Invalid Parameter");
        }

        calcFeetAndInchesToCentimeters(100);

    }

    public static int calculateScore(String playerName, int score, int levelCompleted){
        System.out.println("Player " + playerName + " scored " + score + " points" +
                " and completed level " + levelCompleted);
        return score * 1000;
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(String playerName){
        System.out.println("Player " + playerName + " is playing");
        return 0;
    }

    public static int calculateScore(){
        System.out.println("No Name, No score");
        return 0;
    }


    // new set of methods

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet <0) || (inches <0 || inches >12)){
            System.out.println("Invalid feet or inches parameter");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;

    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches <0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches);
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }



}
