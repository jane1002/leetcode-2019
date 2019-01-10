package google;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReplacePattern890Test {

    private ReplacePattern890 test;

    @Before
    public void setup() {
        test = new ReplacePattern890();
    }

    @Test
    public void getNumberOfUniqueEmailAddress() {
        String pattern = "abb";
        String words[] = {"abc","deq","mee","aqq","dkd","ccc"};
        List<String> res = test.findAndReplacePattern(words, pattern);
        assertEquals(2, res.size());
    }
}
