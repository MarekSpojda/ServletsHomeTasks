import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {
    public static void main(String[] args) {
        System.out.println(verifyLogin("B1_-qAbcde"));
    }

    public static boolean verifyLogin(String email) {
        if (email.length() < 5) {
            return false;
        }

        String regex = "[A-Za-z_\\-]{1}[A-Za-z_\\-0-9]{4,}";
        Pattern compiledPattern = Pattern.compile(regex);
        Matcher matcher = compiledPattern.matcher(email);
        if (matcher.matches()) {
            return true;
        }

        return false;
    }
}