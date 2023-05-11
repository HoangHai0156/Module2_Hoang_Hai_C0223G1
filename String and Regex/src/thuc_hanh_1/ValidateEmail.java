package thuc_hanh_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String EMAIL_REGEX = "^\\w+\\w*@\\w+\\.\\w+$";
    public ValidateEmail(){
        pattern = Pattern.compile(EMAIL_REGEX);
    }
    public boolean validate(String textCheckRegex){
        matcher = pattern.matcher(textCheckRegex);
        return matcher.matches();
    }
}
