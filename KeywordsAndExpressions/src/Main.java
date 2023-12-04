// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hey there ....");
        double kilometers = (100 * 1.609344);

        int highScore = 50;

        if (highScore > 25) {
            highScore = 1000 + highScore; //add bonus points
        }

        int health = 100;

        if (health < 25 && highScore > 1000) {
            highScore = highScore - 1000;
        }

        int myVariable = 0;

        if(myVariable == 0){
            System.out.println("It's now zero");
        }

        boolean gameover = true;
        int score = 800;
        int levelCompleted =5;
        int bonus = 100;

        if(score < 5000 && score > 1000){
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }

        //if then else challenge

    }
}