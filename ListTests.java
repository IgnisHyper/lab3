import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.*;

public class ListTests {
    class StringChecking implements StringChecker{
        public boolean checkString(String s){
            return s.contains("a");
        }
    }

    @Test
    public void testFilter(){
        List<String> myList = Arrays.asList(new String[]{"my", "apple", "oopsies", "computer", "Abel", "adventure"});
        List<String> expectedList = Arrays.asList(new String[]{"apple", "adventure"});
        assertEquals(expectedList, ListExamples.filter(myList, new StringChecking()));
    }
}
