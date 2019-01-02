
import java.util.HashSet;
import java.util.Set;

/**
 * Question 929. - Unique Email Addresses
 * link - https://leetcode.com/problems/unique-email-addresses/
 */

public class UniqueEmailAddresses929 {

    /**
     * @param emails
     * @return int number of unique email address*
     */
    public int numUniqueEmails(String[] emails) {
        Set<String> res = new HashSet<>();

        for(int i = 0; i < emails.length; i++) {
            char[] curEmail = emails[i].toCharArray();
            StringBuffer sb = new StringBuffer();
            int atIndex = emails[i].indexOf('@');

            for(int j = 0; j < curEmail.length; j++) {

                if(j < atIndex) {
                     if(curEmail[j] == '.') {
                        continue;
                    } else if (curEmail[j] == '+') {
                        j = atIndex;
                    } else {
                        sb.append(String.valueOf(curEmail[j]));
                    }
                } else {
                    sb.append(String.valueOf(curEmail[j]));
                }
            }
            res.add(sb.toString());
        }
        return res.size();
    }
}