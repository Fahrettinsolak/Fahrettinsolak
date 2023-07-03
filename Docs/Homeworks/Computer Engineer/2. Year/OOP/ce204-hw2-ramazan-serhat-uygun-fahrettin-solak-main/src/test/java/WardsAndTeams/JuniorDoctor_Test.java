package WardsAndTeams;

import org.junit.Test;
import static org.junit.Assert.*;

public class JuniorDoctor_Test {

  @Test
  public void testDelete() {
    JuniorDoctor doctor = new JuniorDoctor(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null/* constructor arguments */);
    assertNotNull(doctor);
    
    // Call the delete() method
    doctor.delete();
    
    // Verify that the object was deleted
    assertNull(doctor.getDepartment());
  }
}
