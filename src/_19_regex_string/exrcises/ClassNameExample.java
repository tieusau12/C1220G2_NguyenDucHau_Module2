package _19_regex_string.exrcises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExample {
    private static final String CLASS_NAME = "[CAP][0-9]{4}[GHIKLM]";

    public ClassNameExample() {
    }
    public boolean validClassName(String regex){
        Pattern pattern = Pattern.compile(CLASS_NAME);
        Matcher matcher =pattern.matcher(regex);
        return  matcher.matches();
    }
}
