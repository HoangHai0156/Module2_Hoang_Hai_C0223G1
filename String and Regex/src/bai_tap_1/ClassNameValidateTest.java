package bai_tap_1;

public class ClassNameValidateTest {
    private static ClassNameValidate classNameValidate;
    private static final String[] validClassname = {"C0223G", "A0323K"};
    private static final String[] inValidClassname = {"M0318G", "P0323A"};

    public static void main(String[] args) {
        classNameValidate = new ClassNameValidate();
        for (String className: validClassname){
            boolean isValid = classNameValidate.validate(className);
            System.out.println();
            System.out.println("Class naeme is " + className + " is valid: " + isValid);
        }
        for (String className: inValidClassname){
            boolean isValid = classNameValidate.validate(className);
            System.out.println();
            System.out.println("Class naeme is " + className + " is valid: " + isValid);
        }
    }
}
