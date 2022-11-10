public class Game {
    public static void main(String[] args) {
        int guess = 11;
       // print if guess is correct, too high/low

        if (guess == 5) {
            System.out.println("You got it right!");
        }
        else if (guess < 5) {
            System.out.println("You're too low!");
        }
        else if (guess > 5) {
            System.out.println("You're too high!");
        }


    }
}
