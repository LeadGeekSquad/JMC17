public class SecondClass {
    public static void main(String[] args) {
        System.out.println("Hello... there !!");

        boolean isAlien = false;

        if(isAlien == true)
            System.out.println("It's weird Hooman ;) and not an alien.");
        else
            System.out.println("Whoa! It's an alien.....");

        int topScore = 80;
        if(topScore != 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if((topScore > secondTopScore) && (topScore <100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore<=90)){
            System.out.println("Either of both of the conditions are true");
        }

        int newValue = 50;
        if(newValue == 50) {
            System.out.println("This is an error");
        }

        boolean isCar = true;
        if(isCar){
            System.out.println("This is a car");
        }

        //Ternary Operator
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if(isDomestic){
            System.out.println(isDomestic);
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

        String s1 = isDomestic ? "This is funny" : "This is so lame";

        System.out.println(s);
        System.out.println(s1);

        //Operator Challenge
        double number1 = 20.00;
        double number2 = 80.00;
        double addAndMultiply100 = (number1 + number2) * (100);
        double remainder = addAndMultiply100 % 40.00;
        System.out.println("Remainder is " + remainder);
        boolean isZero = remainder == 0.00 ? true : false;
        System.out.println("isZero : " + isZero);
        if(!isZero){
            System.out.println("Got this remainder " + remainder);
        }
        else {
            System.out.println("Remainder is 0.00");
        }

    }
}
