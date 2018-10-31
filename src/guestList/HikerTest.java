package guestList;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HikerTest {

    @Test
    public void life_the_universe_and_everything() {
        
        
        String expected = "12";
        String actual = Hiker.add("4,2,5,1,");
        assertEquals(expected, actual);
    }
}