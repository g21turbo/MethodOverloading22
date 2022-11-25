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
        return 1;
    }

    public static int calculateScore(){
        System.out.println("No Name, No score");
        return 0;
    }



}
