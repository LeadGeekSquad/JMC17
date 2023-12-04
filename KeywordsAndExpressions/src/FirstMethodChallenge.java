public class FirstMethodChallenge {
    public static void main(String[] args) {
        displayHighScorePosition("Nick", 1);
        System.out.println("High Score position is : " + calculateHighScorePosition(1500));
        System.out.println("High Score position is : " + calculateHighScorePosition(999));
        System.out.println("High Score position is : " + calculateHighScorePosition(499));
        System.out.println("High Score position is : " + calculateHighScorePosition(99));
        System.out.println("High Score position is : " + calculateHighScorePosition(-10));
        double number = 3.9;
        long rounded = Math.round(number);
        System.out.println(rounded);

        int testNumber = 11;
        if(testNumber < 10){
            System.out.println("testNumber is less than 10");
        }
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high" +
                "score list.");
    }

    public static int calculateHighScorePosition(int score) {

        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;
    }

}
