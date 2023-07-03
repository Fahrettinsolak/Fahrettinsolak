package Organization;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.*;

public class Nurse_Test {

  @Test
  public void testDelete() {
	Hospital hospital=new Hospital(null, null, null);  
    Department department = new Department(hospital);
    Nurse nurse = new Nurse("Title", "Given Name", "Middle Name", "Family Name", "Name", new Date(0), "Gender", "Home Address", "Phone", new Date(0), "Education", "Certification", "Languages", department);
    
    // delete() metodunu çağırma
    nurse.delete();
    

  }
}
