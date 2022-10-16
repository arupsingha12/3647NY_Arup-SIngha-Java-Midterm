package string_problems;

public class Palindrome {

    /** INSTRUCTIONS
     * A palindrome is a word that can be reversed, and still remain the same.
     *
     * Example: MOM, DAD, MADAM, RACECAR
     *
     * Create a method to check if any given String is a palindrome or not.
     */

    public static void main(String[] args) {

    }

    // Implement here

        /** INSTRUCTIONS
         * A palindrome is a word that can be reversed, and still remain the same.
         *
         * Example: MOM, DAD, MADAM, RACECAR
         *
         * Create a method to check if any given String is a palindrome or not.
         */

            System.out.println(isPalindrome("racecar"));

        }
        // Implement here

        public static boolean isPalindrome (String str) {

            boolean isPalindrome = false;

            str.toLowerCase();

            char[] charArray = str.toCharArray();
            int stringLength = charArray.length;

            for (int i = 0; i < stringLength / 2; i++) {
                if (charArray[i] == charArray[stringLength - 1 - i]) {
                    isPalindrome = true;
                }
                return isPalindrome;
            }

            return isPalindrome;

        }


}
