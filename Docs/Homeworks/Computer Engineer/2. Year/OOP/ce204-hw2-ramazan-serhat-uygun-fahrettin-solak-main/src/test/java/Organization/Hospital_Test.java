package Organization;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;

public class Hospital_Test {
  
  @Test
  public void testHospital() {
    Hospital hospital = new Hospital("Test Hospital", "123 Main St.", "555-5555");
    
    assertEquals("Test Hospital", hospital.getName());
    assertEquals("123 Main St.", hospital.getAddress());
    assertEquals("555-5555", hospital.getPhone());
    assertEquals(0, hospital.numberOfDepartments());
    assertEquals(0, hospital.numberOfPersons());
    assertFalse(hospital.hasDepartments());
    assertFalse(hospital.hasPersons());
  }
  
  @Test
  public void testSetName() {
    Hospital hospital = new Hospital("Test Hospital", "123 Main St.", "555-5555");
    
    hospital.setName("New Hospital Name");
    assertEquals("New Hospital Name", hospital.getName());
  }
  
  @Test
  public void testSetAddress() {
    Hospital hospital = new Hospital("Test Hospital", "123 Main St.", "555-5555");
    
    hospital.setAddress("456 Oak St.");
    assertEquals("456 Oak St.", hospital.getAddress());
  }
  
  @Test
  public void testSetPhone() {
    Hospital hospital = new Hospital("Test Hospital", "123 Main St.", "555-5555");
    
    hospital.setPhone("555-1234");
    assertEquals("555-1234", hospital.getPhone());
  }
  
  @Test
  public void testAddDepartment() {
    Hospital hospital = new Hospital("Test Hospital", "123 Main St.", "555-5555");
    
    Department dept1 = hospital.addDepartment();
    assertEquals(1, hospital.numberOfDepartments());
    assertTrue(hospital.hasDepartments());
    
    
    Department dept2 = hospital.addDepartment();
    assertEquals(2, hospital.numberOfDepartments());
    assertTrue(hospital.hasDepartments());

    List<Department> departments = hospital.getDepartments();
    assertTrue(departments.contains(dept1));
    assertTrue(departments.contains(dept2));
  }
  @Test
  public void testRemovePerson() {
    Hospital hospital = new Hospital(null, null, null);
    Person person1 = new Person(null, null, null, null, null, null, null, null, null);
    Person person2 = new Person(null, null, null, null, null, null, null, null, null);
    hospital.addPerson(person1);
    hospital.addPerson(person2);

    // Test removing a person that doesn't exist in the hospital
    assertFalse(hospital.removePerson(new Person(null, null, null, null, null, null, null, null, null)));

    // Test removing a person that exists in the hospital
    assertTrue(hospital.removePerson(person1));
    assertEquals(1, hospital.numberOfPersons());

    // Test removing a person that was already removed
    assertFalse(hospital.removePerson(person1));
    assertEquals(1, hospital.numberOfPersons());
  }

  @Test
  public void testAddPersonAt() {
    Hospital hospital = new Hospital(null, null, null);
    Person person1 = new Person(null, null, null, null, null, null, null, null, null);
    Person person2 = new Person(null, null, null, null, null, null, null, null, null);
    hospital.addPerson(person1);



    // Test adding a person at a valid index
    assertTrue(hospital.addPersonAt(person2, 1));
    assertEquals(person2, hospital.getPerson(1));
    assertEquals(2, hospital.numberOfPersons());

    // Test adding a person that was already in the hospital at a different index

  }

  @Test
  public void testAddOrMovePersonAt() {
    Hospital hospital = new Hospital(null, null, null);
    Person person1 = new Person(null, null, null, null, null, null, null, null, null);
    Person person2 = new Person(null, null, null, null, null, null, null, null, null);
    hospital.addPerson(person1);


    // Test adding a new person at a valid index
    assertTrue(hospital.addOrMovePersonAt(person2, 0));
    assertEquals(person2, hospital.getPerson(0));
    assertEquals(2, hospital.numberOfPersons());
  }

  @Test
  public void testDelete() {
    Hospital hospital = new Hospital(null, null, null);
    Person person1 = new Person(null, null, null, null, null, null, null, null, null);
    Person person2 = new Person(null, null, null, null, null, null, null, null, null);
    Department department1 = new Department(hospital);
    Department department2 = new Department(hospital);
    hospital.addPerson(person1);
    hospital.addPerson(person2);
    hospital.addDepartment(department1);
    hospital.addDepartment(department2);

    hospital.delete();
    assertEquals(0, hospital.numberOfPersons());
    assertEquals(0, hospital.numberOfDepartments());
    assertEquals(0, person1.numberOfHospitals());

    assertEquals(0, person2.numberOfHospitals());

  }
  
  
}
