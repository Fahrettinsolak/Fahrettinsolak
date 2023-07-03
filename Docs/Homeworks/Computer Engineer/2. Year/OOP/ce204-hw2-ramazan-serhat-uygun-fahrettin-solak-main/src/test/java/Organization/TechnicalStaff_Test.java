package Organization;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Before;
import org.junit.Test;

public class TechnicalStaff_Test {

    private TechnicalStaff staff;

    @Before
    public void setUp() {
    	Hospital hospital =new Hospital(null, null, null);
        staff = new TechnicalStaff("Mr.", "John", "", "Doe", "John Doe", new Date(0), "Male", "123 Main St", "123-456-7890", new Date(0), "Bachelor's in Computer Science", "Certified Technician", "English, Spanish", new Department(hospital));
    }

    @Test
    public void testDelete() {
        staff.delete();
        assertNotNull(staff.getName());
        assertNull(staff.getDepartment());
        // Check other instance variables that should be null or default values after deletion
    }

    @Test
    public void testGetTitle() {
        assertEquals("Mr.", staff.getTitle());
    }

    @Test
    public void testGetGivenName() {
        assertEquals("John", staff.getGivenName());
    }

    // Write tests for other getters and setters as needed

}
