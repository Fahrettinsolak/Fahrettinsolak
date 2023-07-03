package WardsAndTeams;

import org.junit.*;
import static org.junit.Assert.*;

public class Ward_Test {
  
  @Test
  public void testConstructor() {
    HospitalWards hospitalWards = new HospitalWards("Test Hospital", null, null);
    Ward ward = new Ward("Test Ward", "Male", 10, hospitalWards);
    
    assertEquals("Test Ward", ward.getName());
    assertEquals("Male", ward.getPatientsGender());
    assertEquals(10, ward.getCapacity());
    assertEquals(hospitalWards, ward.getHospitalWards());
    assertFalse(ward.hasPatientWards());
  }
  
  @Test(expected = RuntimeException.class)
  public void testConstructor_withInvalidHospitalWards() {
    HospitalWards hospitalWards = null;
    Ward ward = new Ward("Test Ward", "Male", 10, hospitalWards);
  }
  
  @Test
  public void testSetName() {
    HospitalWards hospitalWards = new HospitalWards("Test Hospital", null, null);
    Ward ward = new Ward("Test Ward", "Male", 10, hospitalWards);
    
    assertTrue(ward.setName("New Name"));
    assertEquals("New Name", ward.getName());
  }

  
  @Test
  public void testSetCapacity() {
    HospitalWards hospitalWards = new HospitalWards("Test Hospital", null, null);
    Ward ward = new Ward("Test Ward", "Male", 10, hospitalWards);
    
    assertTrue(ward.setCapacity(20));
    assertEquals(20, ward.getCapacity());
  }
}
