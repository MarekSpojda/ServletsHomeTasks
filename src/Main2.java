import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
//	W pliku `Main2.java` do zmiennych **reg1**, **reg2**, **reg3**, **reg4** wpisz kolejno wyrażenia
//	regularne, opisujące:
// * liczby zmiennoprzecinkowe (5.65 , 123.123)
// * liczby w notacji naukowej ( 5.4325e+04 ; 2.0000342E-06)
// * datę w formacie `dd/mm/yyyy`
// * datę w formacie `yyyy-mm-dd` - gdzie rok jest powyżej 2000

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
        Pattern compiledPattern = Pattern.compile(reg3);
        Matcher matcher = compiledPattern.matcher(date1);
        if (matcher.matches()) {
            System.out.println("Match found!");
        } else {
            System.out.println("Match didn't found.");
        }
    }
}
