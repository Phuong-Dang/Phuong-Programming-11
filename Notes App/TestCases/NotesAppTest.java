import org.junit.Before;
import org.junit.Test;
import sample.CreateNotes;
import sample.RandomChoices;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class NotesAppTest {
    RandomChoices choice;
    CreateNotes create;

    @Before
    public void setUp() {
        choice = new RandomChoices();
        create = new CreateNotes();
    }

    @Test
    public void testCreateNotes() throws IOException {
        String testSave = CreateNotes.saveNotes("test");
        String testFail = CreateNotes.saveNotes("testFail");
        String testRestore = CreateNotes.restoreNotes("notes.txt");

        //check if string is saved properly
        assertEquals(testSave, "test");
        //check if save method fail
        assertFalse(testFail, false);
        //check if string is restored properly
        assertTrue(testRestore.contains(testSave));
    }

    @Test
    public void testRandomChoices() throws IOException {
        String test = RandomChoices.saveList("test");
        String testFail = CreateNotes.saveNotes("testFail");
        ArrayList testRestore = RandomChoices.restoreList("list.txt");

        //check if string is saved properly
        assertEquals(test, "test");
        //check if method fail
        assertFalse(testFail, false);
        //check if list.txt store testFail
        assertFalse(testRestore.contains(testFail));
    }
}
