package readability;

public class Main {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String input = scanner.nextLine();

        int sentenceCount = 0;
        int wordCount = 0;

        for (char c : input.toCharArray()) {

            if (c == ' ') {
                wordCount++;
            } else if (c == '.' || c == '!' || c == '?') {
                wordCount++;
                sentenceCount++;
            }
        }

        if (input.substring(input.length() -1).matches("[^.!?]")) {
            sentenceCount++;
        }

        String verdict = wordCount / sentenceCount > 10 ? "HARD" : "EASY";

        System.out.println(verdict);
    }
}