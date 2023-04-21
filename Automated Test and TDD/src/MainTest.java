import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MainTest {
    @Test
    public void testMethod(){
        Iterable<String> al = new ArrayList<>(asList("CodeGym", "Coding", "Bootcamp", "Java"));
        Iterable<String> ll = new LinkedList<>(asList("CodeGym", "Coding", "Bootcamp", "Java"));

        assertIterableEquals(al, ll);
    }
}