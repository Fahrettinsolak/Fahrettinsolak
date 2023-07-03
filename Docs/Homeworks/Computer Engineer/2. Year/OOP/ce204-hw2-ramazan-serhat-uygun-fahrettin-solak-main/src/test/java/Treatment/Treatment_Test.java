package Treatment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Treatment_Test {
  
  private PatientTreat patientTreat;
  private Treatment treatment;

  @Before
  public void setUp() throws Exception {
    patientTreat = new PatientTreat("John", "Doe", "M", null, null, null, null, null, null, null, 30, null, "123 Main St", null, null, null);
    treatment = new Treatment(patientTreat);
  }

  @Test
  public void testGetPatientTreat() {
    assertEquals(patientTreat, treatment.getPatientTreat());
  }
  
  @Test
  public void testSetPatientTreat() {
    PatientTreat newPatientTreat = new PatientTreat("Jane", "Doe", "F", null, null, null, null, null, null, null, 25, null, "456 Oak St", null, null, null);
    assertTrue(treatment.setPatientTreat(newPatientTreat));
    assertEquals(newPatientTreat, treatment.getPatientTreat());
  }
  
  @Test
  public void testSetPatientTreatNull() {
    assertFalse(treatment.setPatientTreat(null));
    assertEquals(patientTreat, treatment.getPatientTreat());
  }


  @Test 
  public void testGetDoctorTreats() {
    DoctorTreat doctorTreat1 = new DoctorTreat("Dr. Smith", "Cardiology", null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    DoctorTreat doctorTreat2 = new DoctorTreat("Dr. Lee", "Oncology", null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    assertNotEquals(2, treatment.getDoctorTreats().size());
    assertFalse(treatment.getDoctorTreats().contains(doctorTreat1));
    assertFalse(treatment.getDoctorTreats().contains(doctorTreat2));
  }

  @Test
  public void testNumberOfDoctorTreats() {
    DoctorTreat doctorTreat1 = new DoctorTreat("Dr. Smith", "Cardiology", null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    DoctorTreat doctorTreat2 = new DoctorTreat("Dr. Lee", "Oncology", null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    assertNotEquals(2, treatment.numberOfDoctorTreats());
  }

  @Test
  public void testHasDoctorTreats() {
    assertFalse(treatment.hasDoctorTreats());
    DoctorTreat doctorTreat1 = new DoctorTreat("Dr. Smith", "Cardiology", null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    assertFalse(treatment.hasDoctorTreats());
  }
}