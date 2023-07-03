package Organization;

import org.junit.Test;
import static org.junit.Assert.*;

import java.sql.Date;

public class Surgeon_Test {

  @Test
  public void testDelete() {
	  Hospital hospital= new Hospital(null, null, null);
    Department department = new Department(hospital);
    Surgeon surgeon = new Surgeon("Dr.", "John", "", "Doe", "John Doe", new Date(0), "Male", "123 Main St.", "555-1234", new Date(0), "MD", "Board Certified", "English, Spanish", department, "Cardiothoracic Surgery", "Hospital A");
    surgeon.delete();
    assertNull(surgeon.getDepartment());
  }
  
  @Test
  public void testGetSpecialty() {
	  Hospital hospital= new Hospital(null, null, null);
    Department department = new Department(hospital);
    Surgeon surgeon = new Surgeon("Dr.", "John", "", "Doe", "John Doe", new Date(0), "Male", "123 Main St.", "555-1234", new Date(0), "MD", "Board Certified", "English, Spanish", department, "Cardiothoracic Surgery", "Hospital A");
    assertEquals("Cardiothoracic Surgery", surgeon.getSpecialty());
  }
  
  @Test
  public void testSetSpecialty() {
	  Hospital hospital= new Hospital(null, null, null);
    Department department = new Department(hospital);
    Surgeon surgeon = new Surgeon("Dr.", "John", "", "Doe", "John Doe", new Date(0), "Male", "123 Main St.", "555-1234", new Date(0), "MD", "Board Certified", "English, Spanish", department, "Cardiothoracic Surgery", "Hospital A");
    surgeon.setSpecialty("Neurosurgery");
    assertEquals("Neurosurgery", surgeon.getSpecialty());
  }
  
  @Test
  public void testGetLocations() {
	  Hospital hospital= new Hospital(null, null, null);
    Department department = new Department(hospital);
    Surgeon surgeon = new Surgeon("Dr.", "John", "", "Doe", "John Doe", new Date(0), "Male", "123 Main St.", "555-1234", new Date(0), "MD", "Board Certified", "English, Spanish", department, "Cardiothoracic Surgery", "Hospital A");
    assertEquals("Hospital A", surgeon.getLocations());
  }
  
  @Test
  public void testSetLocations() {
	  Hospital hospital= new Hospital(null, null, null);
    Department department = new Department(hospital);
    Surgeon surgeon = new Surgeon("Dr.", "John", "", "Doe", "John Doe", new Date(0), "Male", "123 Main St.", "555-1234", new Date(0), "MD", "Board Certified", "English, Spanish", department, "Cardiothoracic Surgery", "Hospital A");
    surgeon.setLocations("Hospital B");
    assertEquals("Hospital B", surgeon.getLocations());
  }

}
