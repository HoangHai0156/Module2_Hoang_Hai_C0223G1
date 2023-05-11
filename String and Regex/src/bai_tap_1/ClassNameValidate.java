package bai_tap_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValidate {
    private static final String CLASSNAME_REGEX = "^[CAP]\\d{4}[GHIK]$";
    private static Pattern pattern;
    public ClassNameValidate(){
        pattern = Pattern.compile(CLASSNAME_REGEX);
    }
    public boolean validate(String classNameCheckRegex){
        Matcher matcher = pattern.matcher(classNameCheckRegex);
        return matcher.matches();
    }
}
