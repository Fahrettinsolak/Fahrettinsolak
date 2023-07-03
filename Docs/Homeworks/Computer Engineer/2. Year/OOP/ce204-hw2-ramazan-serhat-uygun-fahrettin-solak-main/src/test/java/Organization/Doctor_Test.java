package Organization;

import org.junit.Test;
import static org.junit.Assert.*;

import java.sql.Date;

public class Doctor_Test {

  @Test
  public void testSetAndGetSpecialty() {
	Hospital hospital=new Hospital(null, null, null);
    Doctor doctor = new Doctor("Dr.", "John", "", "Doe", "John Doe", new Date(0), "Male", "123 Main St", "555-1234", new Date(0), "MD", "Board Certified", "English", new Department(hospital), "Cardiology", "Hospital A");
    
    doctor.setSpecialty("Oncology");
    assertEquals("Oncology", doctor.getSpecialty());
  }
  
  @Test
  public void testSetAndGetLocations() {
	  Hospital hospital=new Hospital(null, null, null);
    Doctor doctor = new Doctor("Dr.", "John", "", "Doe", "John Doe", new Date(0), "Male", "123 Main St", "555-1234", new Date(0), "MD", "Board Certified", "English", new Department(hospital), "Cardiology", "Hospital A");
    
    doctor.setLocations("Hospital B");
    assertEquals("Hospital B", doctor.getLocations());
  }
  
  @Test
  public void testToString() {
	  Hospital hospital=new Hospital(null, null, null);
    Doctor doctor = new Doctor("Dr.", "John", "", "Doe", "John Doe", new Date(0), "Male", "123 Main St", "555-1234", new Date(0), "MD", "Board Certified", "English", new Department(hospital), "Cardiology", "Hospital A");
    
    String expected = "Dr. John Doe [" +
                      "name" + ":" + "John Doe" + "," +
                      "birthDate" + ":" + doctor.getBirthDate() + "," +
                      "gender" + ":" + "Male" + "," +
                      "homeAddress" + ":" + "123 Main St" + "," +
                      "phone" + ":" + "555-1234" + "," +
                      "joined" + ":" + doctor.getJoined() + "," +
                      "education" + ":" + "MD" + "," +
                      "certification" + ":" + "Board Certified" + "," +
                      "languages" + ":" + "English" + "," +
                      "department" + ":" + new Department(hospital) + "," +
                      "specialty" + ":" + "Cardiology" + "," +
                      "locations" + ":" + "Hospital A" +
                      "]";
  }
}
