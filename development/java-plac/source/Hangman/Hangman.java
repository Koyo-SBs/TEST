import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

    private static final String WORDS_FILE = "words.txt";
    private static final int MAX_WORDS_NUM = 1000;
    private static String[] words;
    private static int n;
    private static Scanner s;

    private static void loadDictionary() throws FileNotFoundException {
        n = 0;
        words = new String[MAX_WORDS_NUM];
        Scanner fs = new Scanner(new File(WORDS_FILE));
        while (fs.hasNext() && n < MAX_WORDS_NUM) {
            words[n++] = fs.next();
        }
        fs.close();
    }

    private static char inputLetter() {
        System.out.print("a-z?> ");
        return s.next().charAt(0);
    }

    private static void play(Hint hint) {
        int life = 5;
        do {
            System.out.println("[" + life + "] " + hint.toString());
            if (!hint.update(inputLetter())) {
                life--;
            }
        } while (!hint.isClear() && life > 0);
        System.out.println("The answer is [" + hint.getAnswer() + "].");
    }

    public static void main(String[] args) throws FileNotFoundException {
        loadDictionary();
        Random r = new Random();
        s = new Scanner(System.in);
        play(new Hint(words[r.nextInt(n)]));
        s.close();
    }

}
