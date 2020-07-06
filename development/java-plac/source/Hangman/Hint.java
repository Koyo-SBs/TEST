
public class Hint {

    private String answer;
    private char[] hint;

    public Hint(String word) {
        answer = word;
    }

    public boolean update(char c) {
        return false;
    }

    public boolean isClear() {
        return true;
    }

    public String toString() {
        return null;
    }

    public String getAnswer() {
        return answer;
    }

}
