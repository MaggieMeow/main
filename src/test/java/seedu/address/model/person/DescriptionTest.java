package seedu.address.model.person;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import seedu.task.model.task.Description;

public class DescriptionTest {

    @Test
    public void isValidDescription() {
        // invalid description
        assertFalse(Description.isValidDescription("")); // empty string
        assertFalse(Description.isValidDescription(" ")); // spaces only

        // valid description
        assertTrue(Description.isValidDescription("Blk 456, Den Road, #01-355"));
        assertTrue(Description.isValidDescription("-")); // one character
        assertTrue(Description.isValidDescription("Leng Inc; 1234 Market St; San Francisco CA 2349879; USA")); // long description
    }
}
