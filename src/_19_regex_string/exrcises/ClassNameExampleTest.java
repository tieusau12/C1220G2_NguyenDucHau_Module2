package _19_regex_string.exrcises;

public class ClassNameExampleTest {
    public static final String[] validNameClass = new String[]{"C0318G", "A0245H"};
    public static final String[] invalidClassName = new String[]{"H0318A", "M0245C"};

    public static void main(String[] args) {
        ClassNameExample classNameExample = new ClassNameExample();
        for (String classname : validNameClass ) {
            boolean isvalid = classNameExample.validClassName(classname);
            System.out.println("Class name is " + classname +" is valid " + isvalid);
        }
        for (String classname : invalidClassName ) {
            boolean isvalid = classNameExample.validClassName(classname);
            System.out.println("Class name is " + classname +" is valid " + isvalid);
        }
    }
}
