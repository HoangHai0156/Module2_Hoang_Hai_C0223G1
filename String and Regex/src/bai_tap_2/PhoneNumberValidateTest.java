package bai_tap_2;

public class PhoneNumberValidateTest {
    private static PhoneNumberValidate phoneNumberValidate;
    private static String[] validPhoneNumber = {"(84)-(0978489648)"};
    private static String[] inValidPhoneNumber = {"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};

    public static void main(String[] args) {
        phoneNumberValidate = new PhoneNumberValidate();
        for (String phoneNumber: validPhoneNumber){
            boolean isValid = phoneNumberValidate.validate(phoneNumber);
            System.out.println("Phone number is " + phoneNumber + " is valid: " + isValid);
        }
        for (String phoneNumber: inValidPhoneNumber){
            boolean isValid = phoneNumberValidate.validate(phoneNumber);
            System.out.println("Phone number is " + phoneNumber + " is valid: " + isValid);
        }
    }
}
