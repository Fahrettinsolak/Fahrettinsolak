package Organization;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class SurgicalTechnologist_Test {

    private SurgicalTechnologist surgicalTechnologist;

    @Before
    public void setUp() throws Exception {
    	Hospital hospital = new Hospital(null, null, null);
        surgicalTechnologist = new SurgicalTechnologist("Mr.", "John", "", "Doe", "John Doe",
                null, "Male", "123 Main St.", "555-1234", null, "Bachelor's",
                "Certified Surgical Technologist", "English, Spanish", new Department(hospital));
    }

    @Test
    public void testGetTitle() {
        assertEquals("Mr.", surgicalTechnologist.getTitle());
    }

    @Test
    public void testGetGivenName() {
        assertEquals("John", surgicalTechnologist.getGivenName());
    }

    @Test
    public void testGetMiddleName() {
        assertEquals("", surgicalTechnologist.getMiddleName());
    }

    @Test
    public void testGetFamilyName() {
        assertEquals("Doe", surgicalTechnologist.getFamilyName());
    }

    @Test
    public void testGetName() {
        assertEquals("John Doe", surgicalTechnologist.getName());
    }

    @Test
    public void testGetBirthDate() {
        assertEquals(null, surgicalTechnologist.getBirthDate());
    }

    @Test
    public void testGetGender() {
        assertEquals("Male", surgicalTechnologist.getGender());
    }

    @Test
    public void testGetHomeAddress() {
        assertEquals("123 Main St.", surgicalTechnologist.getHomeAddress());
    }

    @Test
    public void testGetPhone() {
        assertEquals("555-1234", surgicalTechnologist.getPhone());
    }

    @Test
    public void testGetJoined() {
        assertNull(surgicalTechnologist.getJoined());
    }

    @Test
    public void testGetEducation() {
        assertEquals("Bachelor's", surgicalTechnologist.getEducation());
    }

    @Test
    public void testGetCertification() {
        assertEquals("Certified Surgical Technologist", surgicalTechnologist.getCertification());
    }

    @Test
    public void testGetLanguages() {
        assertEquals("English, Spanish", surgicalTechnologist.getLanguages());
    }

    @Test
    public void testGetDepartment() {
        assertNotNull(surgicalTechnologist.getDepartment());
    }



    @Test
    public void testSetEducation() {
        String newEducation = "Master's";
        surgicalTechnologist.setEducation(newEducation);
        assertEquals(newEducation, surgicalTechnologist.getEducation());
    }

    @Test
    public void testSetCertification() {
        String newCertification = "Certified Surgical First Assistant";
        surgicalTechnologist.setCertification(newCertification);
        assertEquals(newCertification, surgicalTechnologist.getCertification());
    }

    @Test
    public void testSetLanguages() {
        String newLanguages = "English, Spanish, French";
        surgicalTechnologist.setLanguages(newLanguages);
        assertEquals(newLanguages, surgicalTechnologist.getLanguages());
    }

    @Test
    public void testSetDepartment() {
    	Hospital hospital = new Hospital(null, null, null);
        Department newDepartment = new Department(hospital);
        surgicalTechnologist.setDepartment(newDepartment);
        assertEquals(newDepartment, surgicalTechnologist.getDepartment());
    }
}
