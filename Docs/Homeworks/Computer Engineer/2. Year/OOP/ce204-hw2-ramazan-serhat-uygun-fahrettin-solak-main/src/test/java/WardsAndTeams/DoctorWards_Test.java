package WardsAndTeams;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class DoctorWards_Test {

    private DoctorWards doctor;

    @Before
    public void setUp() throws Exception {
        doctor = new DoctorWards("Dr.", "John", "M.", "Doe", "Dr. John M. Doe",
            null, "Male", "123 Main St.", "555-1234", null,
            "MD", "Board certified", "English, Spanish", null, "Pediatrics", "Ward 1");
    }

    @Test
    public void testGetSpecialty() {
        assertEquals("Pediatrics", doctor.getSpecialty());
    }

    @Test
    public void testSetSpecialty() {
        assertTrue(doctor.setSpecialty("Cardiology"));
        assertEquals("Cardiology", doctor.getSpecialty());
    }

    @Test
    public void testGetLocations() {
        assertEquals("Ward 1", doctor.getLocations());
    }

    @Test
    public void testSetLocations() {
        assertTrue(doctor.setLocations("Ward 2"));
        assertEquals("Ward 2", doctor.getLocations());
    }

   
   
}
