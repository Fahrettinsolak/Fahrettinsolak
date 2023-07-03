package Organization;

import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;

public class Staff_Test {

    private Staff staff;
    private Department department;

    @Before
    public void setUp() throws Exception {
    	 Hospital hospital = new Hospital(null, null, null);
        department = new Department(hospital);
        staff = new Staff("Mr.", "John", "Doe", "Smith", "John Doe Smith",
                null, "Male", "123 Main St, Anytown, USA", "555-1234",
                null, "BS in Computer Science", "Certified in Java",
                "English, Spanish", department);
    }



    @Test
    public void testSetEducation() {
        String newEducation = "MS in Computer Science";
        assertTrue(staff.setEducation(newEducation));
        assertEquals(newEducation, staff.getEducation());
    }

    @Test
    public void testSetCertification() {
        String newCertification = "Certified in Python";
        assertTrue(staff.setCertification(newCertification));
        assertEquals(newCertification, staff.getCertification());
    }

    @Test
    public void testSetLanguages() {
        String newLanguages = "English, French, German";
        assertTrue(staff.setLanguages(newLanguages));
        assertEquals(newLanguages, staff.getLanguages());
    }

    @Test
    public void testSetDepartment() {
    	 Hospital hospital = new Hospital(null, null, null);
        Department newDepartment = new Department(hospital);
        assertTrue(staff.setDepartment(newDepartment));
        assertEquals(newDepartment, staff.getDepartment());
    }

    @Test
    public void testDelete() {
        staff.delete();
        assertNull(staff.getDepartment());
    }

}
