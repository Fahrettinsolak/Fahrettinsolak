package Treatment;

import static org.junit.Assert.*;
import org.junit.Test;

public class Surgery_Test {
  
  @Test
  public void testDelete() {
    // Create a patient treat and a surgery
    PatientTreat patientTreat = new PatientTreat(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null);
    Surgery surgery = new Surgery(patientTreat);
    
    // Ensure that the patient treat contains the surgery
    assertFalse(patientTreat.addTreatment(surgery));
    
    // Delete the surgery
    surgery.delete();
    
    // Ensure that the patient treat no longer contains the surgery
    assertTrue(patientTreat.addTreatment(surgery));
  }

}