package Organization;

import org.junit.Test;
import static org.junit.Assert.*;

import java.sql.Date;

public class Technologist_Test {

  @Test
  public void testConstructor() {
	  Hospital hospital =new Hospital(null, null, null);
    Technologist technologist = new Technologist("Mr.", "John", "", "Doe", "John Doe", new Date(0), "M", "123 Main St.", "555-5555", new Date(0), "Bachelor's Degree", "Certified Technologist", "English, Spanish", new Department(hospital));

    assertNotNull(technologist);
    assertEquals("Mr.", technologist.getTitle());
    assertEquals("John", technologist.getGivenName());
    assertEquals("", technologist.getMiddleName());
    assertEquals("Doe", technologist.getFamilyName());
    assertEquals("John Doe", technologist.getName());
    assertNotNull(technologist.getBirthDate());
    assertEquals("M", technologist.getGender());
    assertEquals("123 Main St.", technologist.getHomeAddress());
    assertEquals("555-5555", technologist.getPhone());
    assertNotNull(technologist.getJoined());
    assertEquals("Bachelor's Degree", technologist.getEducation());
    assertEquals("Certified Technologist", technologist.getCertification());
    assertEquals("English, Spanish", technologist.getLanguages());
    assertNotNull(technologist.getDepartment());

  }

  @Test
  public void testDelete() {
	  Hospital hospital =new Hospital(null, null, null);
    Technologist technologist = new Technologist("Ms.", "Jane", "", "Doe", "Jane Doe", new Date(0), "F", "456 Oak St.", "555-1234", new Date(0), "Associate's Degree", "Certified Technologist", "English", new Department(hospital));

    technologist.delete();

  }
}
