import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IntegerSetTests {
    IntegerSet testSet;

    @Before
    public void setup(){
        testSet = new IntegerSet();
    }

    @Test
    public void testInsertNotThere(){
        //check number is not already in set
        assertEquals(testSet.size(), 0);
        assertFalse(testSet.contains(3));
        //insert a number
        testSet.insert(3);
        //check the number is in the set
        assertEquals(testSet.size(), 1);
        assertTrue(testSet.contains(3));
    }

    IntegerSet newSetup;
    public void newSetup(){
        newSetup = new IntegerSet();
    }
    public void testInsertAlreadyThere(){
        //check number is already in set
        assertEquals(newSetup.size(), 2);
        assertFalse(newSetup.contains(5));
        //remove a number
        newSetup.remove(1);
        //check number is not in the set
        assertEquals(newSetup.size(),1);
        assertTrue(newSetup.contains(0));
    }
}
