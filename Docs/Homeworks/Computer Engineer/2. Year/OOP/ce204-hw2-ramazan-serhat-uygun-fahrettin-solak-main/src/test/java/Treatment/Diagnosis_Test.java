package Treatment;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class Diagnosis_Test {
   
  @Test
  public void testGetPatientTreat() {
    PatientTreat patientTreat = new PatientTreat(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null);
    Diagnosis diagnosis = new Diagnosis(patientTreat);
    assertEquals(diagnosis.getPatientTreat(), patientTreat);
  }
  
  @Test
  public void testAddDoctorTreat() {
    DoctorTreat doctorTreat = new DoctorTreat(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    Diagnosis diagnosis = new Diagnosis(new PatientTreat(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null));
    diagnosis.addDoctorTreat(doctorTreat);
    assertTrue(diagnosis.hasDoctorTreats());
    assertEquals(diagnosis.getDoctorTreat(0), doctorTreat);
  }
  
  @Test
  public void testNumberOfDoctorTreats() {
    Diagnosis diagnosis = new Diagnosis(new PatientTreat(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null));
    assertEquals(diagnosis.numberOfDoctorTreats(), 0);
    diagnosis.addDoctorTreat(new DoctorTreat(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null));
    assertEquals(diagnosis.numberOfDoctorTreats(), 1);
  }
  
  @Test
  public void testGetDoctorTreats() {
    Diagnosis diagnosis = new Diagnosis(new PatientTreat(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null));
    DoctorTreat doctorTreat = new DoctorTreat(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    diagnosis.addDoctorTreat(doctorTreat);
    List<DoctorTreat> doctorTreats = diagnosis.getDoctorTreats();
    assertEquals(doctorTreats.size(), 1);
    assertEquals(doctorTreats.get(0), doctorTreat);
  }
}