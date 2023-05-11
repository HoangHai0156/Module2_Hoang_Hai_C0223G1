package thuc_hanh_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountValidate {
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
    private Pattern pattern;
    public AccountValidate(){
        pattern = Pattern.compile(ACCOUNT_REGEX);
    }
    public boolean validate(String textCheckRegex){
        Matcher matcher = pattern.matcher(textCheckRegex);
        return matcher.matches();
    }
}
