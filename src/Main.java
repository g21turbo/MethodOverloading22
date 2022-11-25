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

        calcFeetAndInchesToCentimeters(1, 1);
        calcFeetAndInchesToCentimeters(48);
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

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet >= 0 && inches >=0 && inches <= 12){
            double cmToIn = inches * 2.54;
            double cmToFt = cmToIn * 12;
            System.out.println("There are " + cmToFt + " centimeters in " + feet +  " feet.\n");
            System.out.println("There are " + cmToIn + " centimeters in " + inches + " inches");
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >=0){
            double feetToInches = inches / 12;
            System.out.println("There are " + feetToInches + " feet in " + inches + " inches");
        }
        return -1;
    }



}
