package Treatment;

import org.junit.Before;
import org.junit.Test;

import Organization.Department;
import Organization.Hospital;

import static org.junit.Assert.*;

import java.sql.Date;

public class DoctorTreat_Test {

  private DoctorTreat doctor;
  private PatientTreat patientTreat;
  private Examination examination;

  @Before
  public void setUp() {
	  Hospital hospital =new Hospital(null, null, null);
    doctor = new DoctorTreat("Dr.", "John", "", "Smith", "Dr. John Smith",
        new Date(0), "Male", "123 Main St.", "555-1234",
        new Date(0), "MD", "Board Certified", "English", 
        new Department(hospital), "Cardiologist", "Hospital A");

    patientTreat = new PatientTreat(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null);

    examination = new Examination(patientTreat, doctor);
  }

  @Test
  public void testGetPatientTreats() {
    assertNotEquals(1, doctor.numberOfPatientTreats());
    assertFalse(doctor.hasPatientTreats());
    assertFalse(doctor.getPatientTreats().contains(patientTreat));
  }

  @Test
  public void testGetExamination() {
    assertEquals(examination, doctor.getExamination(0));
  }

  @Test
  public void testGetExaminations() {
    assertEquals(1, doctor.numberOfExaminations());
    assertTrue(doctor.hasExaminations());
    assertTrue(doctor.getExaminations().contains(examination));
  }

}
