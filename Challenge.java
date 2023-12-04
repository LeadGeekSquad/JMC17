package JMC17;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Challenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore1 = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println(finalScore1);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("The final score is " +
                            calculateScore(gameOver, score, levelCompleted, bonus));

        System.out.println("Hoorrayyy !!");

    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if(gameOver){
            finalScore += (levelCompleted * bonus);
        }
        return finalScore;
    }

}