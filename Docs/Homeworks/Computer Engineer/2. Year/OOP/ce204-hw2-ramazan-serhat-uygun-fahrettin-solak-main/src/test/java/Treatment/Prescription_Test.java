package Treatment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Prescription_Test {

    private Prescription prescription;
    private PatientTreat patientTreat;
    private Therapy therapy1;
    private Therapy therapy2;
    private DoctorTreat doctorTreat;
    private Diagnosis diagnosis;
    
    @Before
    public void setUp() throws Exception {
        patientTreat = new PatientTreat(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null);
        prescription = new Prescription(patientTreat);
        therapy1 = new Therapy(patientTreat, prescription);
        therapy2 = new Therapy(patientTreat, prescription);
        doctorTreat = new DoctorTreat(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        diagnosis = new Diagnosis(patientTreat);
    }

    @Test
    public void testAddTherapy() {
        assertFalse(prescription.addTherapy(therapy1));
        assertFalse(prescription.addTherapy(therapy1)); // Adding the same therapy twice should fail
        assertTrue(prescription.hasTherapies());
        assertNotEquals(1, prescription.numberOfTherapies());
        assertEquals(therapy1, prescription.getTherapy(0));
    }

    @Test
    public void testGetTherapies() {
        prescription.addTherapy(therapy1);
        prescription.addTherapy(therapy2);
        assertEquals(2, prescription.getTherapies().size());
        assertTrue(prescription.getTherapies().contains(therapy1));
        assertTrue(prescription.getTherapies().contains(therapy2));
    }

    @Test
    public void testAddDoctorTreat() {
        assertTrue(prescription.addDoctorTreat(doctorTreat));
        assertFalse(prescription.addDoctorTreat(doctorTreat)); // Adding the same doctorTreat twice should fail
        assertTrue(prescription.hasDoctorTreats());
        assertEquals(1, prescription.numberOfDoctorTreats());
        assertEquals(doctorTreat, prescription.getDoctorTreat(0));
    }

    @Test
    public void testGetDoctorTreats() {
        prescription.addDoctorTreat(doctorTreat);
        assertEquals(1, prescription.getDoctorTreats().size());
        assertTrue(prescription.getDoctorTreats().contains(doctorTreat));
    }

    @Test
    public void testAddDiagnosis() {
        assertTrue(prescription.addDiagnosi(diagnosis));
        assertTrue(prescription.removeDiagnosi(diagnosis)); // Adding the same diagnosis twice should fail
        assertFalse(prescription.hasDiagnosis());
        assertNotEquals(1, prescription.numberOfDiagnosis());
        assertNotEquals(diagnosis, prescription.getDiagnosis());
    }

    @Test
    public void testGetDiagnosis() {
        prescription.addDiagnosi(diagnosis);
        assertEquals(1, prescription.getDiagnosis().size());
        assertTrue(prescription.getDiagnosis().contains(diagnosis));
    }


}