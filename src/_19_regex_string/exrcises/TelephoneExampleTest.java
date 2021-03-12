package _19_regex_string.exrcises;

public class TelephoneExampleTest {
    public static final String[] validPhone = new String[]{"(79)-(0222345675)", "(84)-(0978489648)"};
    public static final String[] invalidPhone = new String[]{"79-(1222345675)", "(84a)-(0978489648)"};

    public static void main(String[] args) {
        TelephoneExample telPhoneNumber = new TelephoneExample();
        for (String telephone : validPhone) {
            boolean isvalid = telPhoneNumber.validTelephoneNumber(telephone);
            System.out.println("Telephone number is " + telephone + " is valid " + isvalid);
        }
        for (String telephone : invalidPhone) {
            boolean isvalid = telPhoneNumber.validTelephoneNumber(telephone);
            System.out.println("Telephone number is " + telephone + " is valid " + isvalid);

        }
    }
}
