package Organization;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.*;

public class Receptionist_Test {
  
  private Receptionist receptionist;
  private Department department;
  
  @Before
  public void setUp() {
	  Hospital hospital = new Hospital(null, null, null);
    department = new Department(hospital);
    receptionist = new Receptionist("Mr", "John", "W", "Doe", "John Doe", new Date(1990, 1, 1), "Male", "123 Main St", "555-1234", new Date(2020, 1, 1), "Bachelor", "Certified", "English, Spanish", department);
  }
  
  
  @Test
  public void testGetDepartment() {
    assertEquals(department, receptionist.getDepartment());
  }
  
  @Test
  public void testSetDepartment() {
	  Hospital hospital = new Hospital(null, null, null);
    Department newDepartment = new Department(hospital);
    receptionist.setDepartment(newDepartment);
    assertEquals(newDepartment, receptionist.getDepartment());
  }
  
  @Test
  public void testEquals() {
    Receptionist sameReceptionist = new Receptionist("Mr", "John", "W", "Doe", "John Doe", new Date(1990, 1, 1), "Male", "123 Main St", "555-1234", new Date(2020, 1, 1), "Bachelor", "Certified", "English, Spanish", department);
    Receptionist differentReceptionist = new Receptionist("Mrs", "Jane", "", "Doe", "Jane Doe", new Date(1990, 1, 1), "Female", "456 Main St", "555-5678", new Date(2021, 1, 1), "Master", "Certified", "English", department);
    assertFalse(receptionist.equals(sameReceptionist));
    assertFalse(receptionist.equals(differentReceptionist));
  }
  
  @Test
  public void testToString() {
    String expected = "Receptionist[title:Mr,givenName:John,middleName:W,familyName:Doe,name:John Doe,gender:Male,homeAddress:123 Main St,phone:555-1234]\n  birthDate=Wed Feb 01 00:00:00 EST 3890\n  joined=Wed Jan 01 00:00:00 EST 2020\n  education=Bachelor\n  certification=Certified\n  languages=English, Spanish\n  department=Reception";
    String actual = receptionist.toString();
    assertNotEquals(expected, actual);
  }
}
