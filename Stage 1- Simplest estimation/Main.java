package readability;

public class Main {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String sentence = scanner.nextLine();

        String verdict = sentence.length() > 100 ? "HARD" : "EASY";

        System.out.println(verdict);
    }
}
