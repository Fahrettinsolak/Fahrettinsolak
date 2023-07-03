package Organization;

import org.junit.Test;
import static org.junit.Assert.*;

import java.sql.Date;

public class Technician_Test {
    
    @Test
    public void testConstructor() {
    	Hospital hospital =new Hospital(null, null, null);
        Technician technician = new Technician("Mr.", "John", "Doe", "Smith", "John Smith", new Date(0), "Male", "123 Main St", "555-1234", new Date(0), "Bachelor's in Electrical Engineering", "Certified Electrical Technician", "English, Spanish", new Department(hospital));
        
        assertEquals("Mr.", technician.getTitle());
        assertEquals("John", technician.getGivenName());
        assertEquals("Doe", technician.getMiddleName());
        assertEquals("Smith", technician.getFamilyName());
        assertEquals("John Smith", technician.getName());
        assertEquals(new Date(0), technician.getBirthDate());
        assertEquals("Male", technician.getGender());
        assertEquals("123 Main St", technician.getHomeAddress());
        assertEquals("555-1234", technician.getPhone());
        assertEquals(new Date(0), technician.getJoined());
        assertEquals("Bachelor's in Electrical Engineering", technician.getEducation());
        assertEquals("Certified Electrical Technician", technician.getCertification());
        assertEquals("English, Spanish", technician.getLanguages());
        assertNotEquals(new Department(hospital), technician.getDepartment());
    }
    
    @Test
    public void testDelete() {
    	Hospital hospital =new Hospital(null, null, null);
        Technician technician = new Technician("Ms.", "Jane", "Doe", "Smith", "Jane Smith", new Date(0), "Female", "456 Elm St", "555-5678", new Date(0), "Associate's in Computer Science", "Certified Computer Technician", "English, French", new Department(hospital));
        
        technician.delete();
        

    }
}
