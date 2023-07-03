package WardsAndTeams;

import org.junit.Test;
import static org.junit.Assert.*;

public class Gender_Test {

    @Test
    public void testMale() {
        assertEquals(Gender.male, Gender.valueOf("male"));
    }

    @Test
    public void testFemale() {
        assertEquals(Gender.female, Gender.valueOf("female"));
    }

    @Test
    public void testValues() {
        assertEquals(2, Gender.values().length);
        assertArrayEquals(new Gender[]{Gender.male, Gender.female}, Gender.values());
    }
}

