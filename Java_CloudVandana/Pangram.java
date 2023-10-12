import java.util.*;

public class Pangram {

    public static boolean containAllLetters(String string) {
        string = string.toLowerCase();
        boolean allLettersPresent = true;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!string.contains(String.valueOf(ch))) {
                allLettersPresent = false;
                break;
            }
        }

        return allLettersPresent;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        scanner.close();

        boolean isPangram = containAllLetters(string);

        if (isPangram) {
            System.out.println("It is a Pangram String");
        } else {
            System.out.println("It is not a Pangram String");
        }
    }
}
