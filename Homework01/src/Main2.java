import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    String reg1 = "-?\\d+\\.\\d+";
    String reg2 = "-?\\d+\\.\\d+[eE]{1}[-+]{1}\\d+";
    String reg3 = "(0[0-9]\\/0[1-9]\\/\\d{4})|(0[0-9]\\/1[0-2]\\/\\d{4})|" +
            "(1[0-9]\\/0[1-9]\\/\\d{4})|(1[0-9]\\/1[0-2]\\/\\d{4})|" +
            "(2[0-9]\\/0[1-9]\\/\\d{4})|(2[0-9]\\/1[0-2]\\/\\d{4})|" +
            "(3[0-1]\\/0[1-9]\\/\\d{4})|(3[0-1]\\/1[0-2]\\/\\d{4})";
    String reg4 = "([2-9]00[1-9]\\-\\d{2}\\-\\d{2})|([2-9]0[1-9][0-9]\\-\\d{2}\\-\\d{2})|([2-9][1-9][0-9][0-9]\\-\\d{2}\\-\\d{2})";

    public static void main(String[] args) {
        new Main2().testRegex();
    }

    @SuppressWarnings("Duplicates")
    private void testRegex() {
        String commaNumber = "-12.23";
        String scienceNumber = "-12.8E+40";
        String date1 = "31/01/1985";
        String date2 = "9999-11-09";

        //Testing regex here
        Pattern compiledPattern = Pattern.compile(reg4);
        Matcher matcher = compiledPattern.matcher(date2);
        if (matcher.matches()) {
            System.out.println("Match found!");
        } else {
            System.out.println("Match didn't found.");
        }
    }
}
