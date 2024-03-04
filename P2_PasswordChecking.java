/*2. Password Strength

Find the strength of the given password string based on the conditions

Four rules were given based on the type and no. of characters in the string.

Weak – only Rule 1 is satisfied or Rule 1 is not satisfied

Medium – Two rules are satisfied

Good – Three rules satisfied

Strong – All Four rules satisfied



I/P: Qw!1        O/P: Weak

I/P: Qwertyuiop      O/P: Medium

I/P: QwertY123       O/P: Good

I/P: Qwerty@123    O/P: Strong */

import java.util.*;

public class P2_PasswordChecking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input : ");
        String input = sc.nextLine();
        System.out.println("Output : " + findStrength(input));
        sc.close();
    }

    public static String findStrength(String input) {
        String result = "";
        boolean hasUpper = false, hasLower = false, hasNumber = false, hasSpecialChar = false;

        if (input.length() >= 6 && !(input.length() < 1)) {
            for (char c : input.toCharArray()) {
                if (Character.isUpperCase(c))
                    hasUpper = true;
                if (Character.isLowerCase(c))
                    hasLower = true;
                if (Character.isDigit(c))
                    hasNumber = true;
                if (c == '@' || c == '&' || c == '#' || c == '!' || c == '$')
                    hasSpecialChar = true;
            }
        } else {
            result = "Weak";
        }

        if (hasLower && hasUpper) {
            if (hasNumber) {
                if (hasSpecialChar) {
                    result = "Strong";
                } else {
                    result = "Good";
                }
            } else {
                result = "Medium";
            }
        } else {
            result = "Weak";
        }
        return result;
    }
}
