package Organization;

import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.*;

public class OperationsStaff_Test {

    @Test
    public void testAddPatient() {
    	Hospital hospital=new Hospital(null, null, null);
        OperationsStaff staff = new OperationsStaff("Mr.", "John", "", "Doe", "John Doe", null,
            "Male", "123 Main St", "555-1234", null, "Bachelor's degree", "Certified", "English",
            new Department(hospital));
        Patient patient = new Patient("Mr.", "Bob", "", "Smith", "Bob Smith", null,
            "Male", "456 Oak St", "555-5678", null, 0, null, "12345", null, null, null);
        boolean result = staff.addPatient(patient);
        assertTrue(result);
        assertEquals(staff.numberOfPatients(), 1);
        assertEquals(patient.numberOfOperationsStaffs(), 1);
    }

    @Test
    public void testRemovePatient() {
    	Hospital hospital=new Hospital(null, null, null);
        OperationsStaff staff = new OperationsStaff("Ms.", "Jane", "", "Doe", "Jane Doe", null,
            "Female", "789 Elm St", "555-9012", null, "Master's degree", "Certified", "English",
            new Department(hospital));
        Patient patient = new Patient("Ms.", "Alice", "", "Jones", "Alice Jones", null,
            "Female", "321 Pine St", "555-3456", null, 0, null, "67890", null, null, null);
        staff.addPatient(patient);
        boolean result = staff.removePatient(patient);
        assertTrue(result);
        assertEquals(staff.numberOfPatients(), 0);
        assertEquals(patient.numberOfOperationsStaffs(), 0);
    }
}
