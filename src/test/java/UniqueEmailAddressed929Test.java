import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqueEmailAddressed929Test {

    private UniqueEmailAddresses929 test;

    @Before
    public void setup() {
        test = new UniqueEmailAddresses929();
    }

    @Test
    public void getNumberOfUniqueEmailAddress() {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        int res = test.numUniqueEmails(emails);
        assertEquals(2, res);
    }
}
