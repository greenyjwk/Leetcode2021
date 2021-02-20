package String;

import java.util.ArrayList;
import java.util.List;


public class LC125 {

    public static void main(String[] args) {
        isPalindrome("A man, a plan, a canal: Panama");
    }

    static public boolean isPalindrome(String s) {

        /* First Trial

        List<Character> characters = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (('a' <= s.charAt(i) && s.charAt(i) <= 'z') || ('A' <= s.charAt(i) && s.charAt(i) <= 'Z'))
                characters.add(Character.toLowerCase(s.charAt(i)));
        }

        int end = characters.size() - 1;
        int median = characters.size() / 2 - 1;

        for (int i = 0; i <= median; i++) {
            if (characters.get(i) != characters.get(end - i)) return false;
        }
        return true;

        */

        int head = 0;
        int tail = s.length() - 1;

        while (head < tail) {
            if (!Character.isLetterOrDigit(s.charAt(head))) {
                head++;
            } else if (!Character.isLetterOrDigit(s.charAt(tail))) {
                tail--;
            } else {
                if (Character.toLowerCase(s.charAt(head)) != Character.toLowerCase(s.charAt(tail))) {
                    return false;
                }
                head++;
                tail--;
            }
        }
        return true;
    }
}


/*

    Time Complexity  : O(n)
    Space Complexity : O(1)

 */