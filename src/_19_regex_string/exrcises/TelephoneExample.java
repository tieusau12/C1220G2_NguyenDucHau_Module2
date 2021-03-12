package _19_regex_string.exrcises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelephoneExample {
    private static final String TELEPHONE = "^[(][0-9]{2}[)][-][(]0[0-9]{9}[)]$";

    public TelephoneExample() {
    }

    public boolean validTelephoneNumber(String regex) {
        Pattern pattern = Pattern.compile(TELEPHONE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
