/**
 * Reverse a string
 *
 * For example: input: "cool" output: "looc"
 */


public class F_ReverseString {

    String reversedName = "";

    String reverse(String inputString) {
        for (int i = inputString.length() - 1; i >= 0; i--){
            reversedName += inputString.charAt(i);
        }

        return reversedName;
    }

}
