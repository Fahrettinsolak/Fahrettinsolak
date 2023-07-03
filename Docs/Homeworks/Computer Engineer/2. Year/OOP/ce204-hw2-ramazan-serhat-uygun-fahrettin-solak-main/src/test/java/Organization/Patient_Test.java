package Organization;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class Patient_Test {

  private Patient patient;
  private OperationsStaff staff;

  @Before
  public void setUp() throws Exception {
    patient = new Patient("Mr.", "John", "Doe", "Smith", "John Smith", null, "Male", "123 Main St", "123-456-7890", "P001", 33, null, "Flu", "Ibuprofen", "None", "None");
    staff = new OperationsStaff("Ms.", "Jane", null, "Doe", "Jane Doe", null, "Female", "456 Broadway", "987-654-3210", null, "O001", "Nurse", null, null);
  }

  @Test
  public void testAddOperationsStaff() {
    assertFalse(patient.hasOperationsStaffs());
    assertTrue(patient.addOperationsStaff(staff));
    assertTrue(patient.hasOperationsStaffs());
    assertEquals(patient.getOperationsStaff(0), staff);
  }

  @Test
  public void testRemoveOperationsStaff() {
    assertFalse(patient.hasOperationsStaffs());
    assertTrue(patient.addOperationsStaff(staff));
    assertTrue(patient.hasOperationsStaffs());
    assertTrue(patient.removeOperationsStaff(staff));
    assertFalse(patient.hasOperationsStaffs());
  }

  @Test
  public void testGettersAndSetters() {
    assertEquals(patient.getId(), "P001");
    assertEquals(patient.getAge(), 33);
    assertEquals(patient.getSickness(), "Flu");
    assertEquals(patient.getPrescriptions(), "Ibuprofen");
    assertEquals(patient.getAllergies(), "None");
    assertEquals(patient.getSpecialReqs(), "None");

    assertTrue(patient.setId("P002"));
    assertEquals(patient.getId(), "P002");

    assertTrue(patient.setAge(34));
    assertEquals(patient.getAge(), 34);

    assertTrue(patient.setSickness("Cold"));
    assertEquals(patient.getSickness(), "Cold");

    assertTrue(patient.setPrescriptions("Tylenol"));
    assertEquals(patient.getPrescriptions(), "Tylenol");

    assertTrue(patient.setAllergies("Peanuts"));
    assertEquals(patient.getAllergies(), "Peanuts");

    assertTrue(patient.setSpecialReqs("Wheelchair"));
    assertEquals(patient.getSpecialReqs(), "Wheelchair");
  }
  @Test
  public void testSetAccepted() {
	  Patient myObj = new Patient(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null);
      Date accepted = new Date();

      boolean wasSet = myObj.setAccepted(null);

      assertTrue(wasSet);
      assertNotEquals(accepted, myObj.getAccepted());
  }


}
