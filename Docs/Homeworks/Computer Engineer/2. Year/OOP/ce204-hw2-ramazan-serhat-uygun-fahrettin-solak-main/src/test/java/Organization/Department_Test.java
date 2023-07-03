package Organization;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.*;

public class Department_Test {

  private Hospital hospital;
  private Department department;

  @Before
  public void setUp() {
    hospital = new Hospital(null, null, null);
    department = new Department(hospital);
  }

  @Test
  public void testAddStaff() {
    Staff staff1 = department.addStaff("Dr.", "John", "", "Doe", "John Doe", new Date(0), "Male", "123 Main St", "555-1234", new Date(0), "MD", "Board Certified", "English");
    Staff staff2 = department.addStaff("Dr.", "Jane", "", "Smith", "Jane Smith", new Date(0), "Female", "456 Oak Ave", "555-5678", new Date(0), "MD", "Board Certified", "English");

    assertTrue(department.hasStaffs());
    assertEquals(2, department.numberOfStaffs());
    assertTrue(department.getStaffs().contains(staff1));
    assertTrue(department.getStaffs().contains(staff2));
    assertEquals(department, staff1.getDepartment());
    assertEquals(department, staff2.getDepartment());
  }

  @Test
  public void testRemoveStaff() {
    Staff staff1 = department.addStaff("Dr.", "John", "", "Doe", "John Doe", new Date(0), "Male", "123 Main St", "555-1234", new Date(0), "MD", "Board Certified", "English");
    Staff staff2 = department.addStaff("Dr.", "Jane", "", "Smith", "Jane Smith", new Date(0), "Female", "456 Oak Ave", "555-5678", new Date(0), "MD", "Board Certified", "English");

    boolean removed = department.removeStaff(staff1);
    
    assertFalse(removed);
    assertTrue(department.getStaffs().contains(staff1));
    assertTrue(department.getStaffs().contains(staff2));
    assertEquals(department, staff2.getDepartment());
  }

  @Test
  public void testSetHospital() {
    Hospital newHospital = new Hospital(null, null, null);
    department.setHospital(newHospital);

    assertEquals(newHospital, department.getHospital());
    assertTrue(newHospital.getDepartments().contains(department));
    assertFalse(hospital.getDepartments().contains(department));
  }


}
