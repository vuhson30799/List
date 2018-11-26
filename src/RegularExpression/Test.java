package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static String STRING_CLASS_REGEX = "^[CAP][\\d]{4}[\\w]*[G-I[K-M]]$";

    public static String STRING_PHONENUMBER_REGEX = "^[\\d]{2}-0[\\d]{9}$";

    public static void main(String[] args) {
        Pattern s = Pattern.compile(".s");
        Matcher m = s.matcher("as");
        boolean p = m.matches();

        boolean b2 = Pattern.compile(".s").matcher("as").matches();
        boolean b3 = Pattern.matches(".s","as");


        String tenLopHoc = "C1234G";
        if (Pattern.matches(STRING_CLASS_REGEX,tenLopHoc)){
            System.out.println("This name is legal");
        }else {
            System.out.println("This name is illegal");
        }

        String phoneNumber = "84-0123a56789";
        if (Pattern.matches(STRING_PHONENUMBER_REGEX,phoneNumber)){
            System.out.println("This phone number is legal");
        }else {
            System.out.println("THis phone number is illegal");
        }
    }
}
