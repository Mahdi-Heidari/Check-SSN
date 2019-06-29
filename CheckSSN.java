package checkssn;

import java.util.Scanner;

public class CheckSSN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN:\t");
        String SSN = input.next();
        boolean validation = false;

        if (SSN.length() != 11) {
            validation = false;
        } else {

            for (int i = 0; i < 11; i++) {
                if (i == 3 || i == 6) {
                    if (SSN.charAt(i) != 45) {
                        validation = false;
                        break;
                    }
                } else {

                    if (!Character.isDigit(SSN.charAt(i))) {
                        validation = false;
                        break;
                    }
                }
            }
        }
        String message = validation ? SSN.concat(" is a valid social security number") : SSN.concat(" is an invalid social security number");
        System.out.println(message);
    }
}
