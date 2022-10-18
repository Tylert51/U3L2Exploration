import java.util.Scanner;
public class EightBallRunner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Magic 8 Ball!");
        System.out.print("Enter your yes-no question and I will answer it: ");
        String question = scan.nextLine();

        String yes1 = "Without a doubt";
        String yes2 = "Ah I see it, yes";
        String middle1 = "Replay hazy, try again later";
        String middle2 = "Better not to tell you now";
        String no1 = "My sources say no";
        String no2 = "Don't count on it";
        String answer = "";

        int number = (int) (1 + Math.random() * 6);

        if (number == 1) {
            answer = yes1;
        }
        if (number == 2) {
            answer = yes2;
        }
        if (number == 3) {
            answer = middle1;
        }
        if (number == 4) {
            answer = middle2;
        }
        if (number == 5) {
            answer = no1;
        }
        if (number == 6) {
            answer = no2;
        }
        System.out.println(answer);
    }
}
