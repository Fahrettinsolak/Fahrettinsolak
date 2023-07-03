package Organization;

import org.junit.Test;
import static org.junit.Assert.*;

import java.sql.Date;

public class FrontDeskStaff_Test {

  @Test
  public void testDelete() {
	  Hospital hospital=new Hospital(null, null, null);
    FrontDeskStaff staff = new FrontDeskStaff("Ms.", "Jane", "", "Doe", "Jane Doe", new Date(0), "Female", "456 Elm St", "555-5678", new Date(0), "High School Diploma", "None", "English", new Department(hospital));
    
    staff.delete();
  }
}
