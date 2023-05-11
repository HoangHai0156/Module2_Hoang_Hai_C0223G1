package bai_tap_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidate {
    private static final String PHONENUMBER_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
    private static Pattern pattern;
    public PhoneNumberValidate(){
        pattern = Pattern.compile(PHONENUMBER_REGEX);
    }
    public boolean validate(String phoneNumberCheckRegex){
        Matcher matcher = pattern.matcher(phoneNumberCheckRegex);
        return matcher.matches();
    }
}
