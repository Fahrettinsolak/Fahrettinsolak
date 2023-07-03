package Organization;

import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;

public class Person_Test {
  
  private Person person;

  private Hospital hospital;
  
  @Before
  public void setUp() throws Exception {
    person = new Person("Mr.", "John", "Doe", "Smith", "John Doe Smith", null, "Male", "123 Main St", "555-555-5555");
  }
  
  @Test
  public void testSetTitle() {
    assertTrue(person.setTitle("Mrs."));
    assertEquals("Mrs.", person.getTitle());
  }
  
  @Test
  public void testSetGivenName() {
    assertTrue(person.setGivenName("Jane"));
    assertEquals("Jane", person.getGivenName());
  }
  
  @Test
  public void testSetMiddleName() {
    assertTrue(person.setMiddleName("Marie"));
    assertEquals("Marie", person.getMiddleName());
  }
  
  @Test
  public void testSetFamilyName() {
    assertTrue(person.setFamilyName("Johnson"));
    assertEquals("Johnson", person.getFamilyName());
  }
  
  @Test
  public void testSetName() {
    assertTrue(person.setName("Jane Marie Johnson"));
    assertEquals("Jane Marie Johnson", person.getName());
  }
  
  
  @Test
  public void testSetGender() {
    assertTrue(person.setGender("Female"));
    assertEquals("Female", person.getGender());
  }
  
  @Test
  public void testSetHomeAddress() {
    assertTrue(person.setHomeAddress("456 Park Ave"));
    assertEquals("456 Park Ave", person.getHomeAddress());
  }
  
  @Test
  public void testSetPhone() {
    assertTrue(person.setPhone("555-123-4567"));
    assertEquals("555-123-4567", person.getPhone());
  }
  @Before
  public void setUp1() {
    person = new Person("Mr.", "John", "A.", "Doe", "Male", null, "123 Main St.", "555-555-5555", "01/01/1970");
    hospital = new Hospital("St. Mary's", null, null);
  }
  
  @Test
  public void testAddHospital() {
    assertTrue(person.addHospital(hospital));
    assertTrue(person.getHospitals().contains(hospital));
  }
  
  @Test
  public void testAddDuplicateHospital() {
    assertTrue(person.addHospital(hospital));
    assertEquals(1, person.getHospitals().size());
  }
  
  @Test
  public void testRemoveHospital() {
    person.addHospital(hospital);
    assertTrue(person.removeHospital(hospital));
    assertFalse(person.getHospitals().contains(hospital));
  }
  
  @Test
  public void testRemoveNonExistentHospital() {
    assertFalse(person.removeHospital(hospital));
  }
  
  @Test
  public void testToString() {
    String expectedString = "Person[" +
      "title:Mr." +
      ",givenName:John" +
      ",middleName:A." +
      ",familyName:Doe" +
      ",name:John A. Doe" +
      ",gender:Male" +
      ",homeAddress:123 Main St." +
      ",phone:555-555-5555" +
      "]" +
      System.getProperties().getProperty("line.separator") +
      "  birthDate=01/01/1970";
    assertNotEquals(expectedString, person.toString());
  }
  
  @Test
  public void testAddHospitalAtIndex() {
    person.addHospital(hospital);
    Hospital newHospital = new Hospital(null, null, null);
    assertTrue(person.addHospitalAt(newHospital, 0));
    assertEquals(newHospital, person.getHospitals().get(0));
    assertEquals(hospital, person.getHospitals().get(1));
  }
  
  @Test
  public void testAddHospitalAtIndexOutOfRange() {
    person.addHospital(hospital);
    Hospital newHospital = new Hospital(null, null, null);
    assertTrue(person.addHospitalAt(newHospital, 5));
    assertNotEquals(1, person.getHospitals().size());
  }
  
  @Test
  public void testAddHospitalAtIndexNegative() {
    person.addHospital(hospital);
    Hospital newHospital = new Hospital(null, null, null);
    assertTrue(person.addHospitalAt(newHospital, -1));
    assertEquals(newHospital, person.getHospitals().get(0));
    assertEquals(hospital, person.getHospitals().get(1));
  }
  
  @Test
  public void testAddHospitalAtIndexAlreadyInList() {
    person.addHospital(hospital);
    assertFalse(person.addHospitalAt(hospital, 0));
    assertEquals(hospital, person.getHospitals().get(0));
    assertEquals(1, person.getHospitals().size());
  }
  
  @Test
  public void testAddOrMoveHospitalAtIndex() {
    person.addHospital(hospital);
    Hospital newHospital = new Hospital(null, null, null);
    assertTrue(person.addOrMoveHospitalAt(newHospital, 0));
    assertEquals(newHospital, person.getHospitals().get(0));
    assertEquals(hospital, person.getHospitals().get(1));
  }
}
