package Treatment;

import org.junit.Test;
import static org.junit.Assert.*;

public class Examination_Test {

    @Test
    public void testSetPatientTreat() {
        PatientTreat patient = new PatientTreat(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null);
        DoctorTreat doctor = new DoctorTreat(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        Examination exam = new Examination(patient, doctor);
        assertTrue(exam.setPatientTreat(patient));
        assertEquals(patient, exam.getPatientTreat());
    }

    @Test
    public void testSetDoctorTreat() {
        PatientTreat patient = new PatientTreat(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null);
        DoctorTreat doctor1 = new DoctorTreat(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        DoctorTreat doctor2 = new DoctorTreat(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        Examination exam = new Examination(patient, doctor1);
        assertTrue(exam.setDoctorTreat(doctor2));
        assertEquals(doctor2, exam.getDoctorTreat());
    }

    @Test
    public void testAddDiagnosi() {
        PatientTreat patient = new PatientTreat(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null);
        DoctorTreat doctor = new DoctorTreat(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        Examination exam = new Examination(patient, doctor);
        Diagnosis diagnosis = new Diagnosis(patient);
        assertTrue(exam.addDiagnosi(diagnosis));
        assertTrue(exam.hasDiagnosis());
        assertEquals(1, exam.numberOfDiagnosis());
        assertTrue(exam.getDiagnosis().contains(diagnosis));
    }

    @Test
    public void testRemoveDiagnosi() {
        PatientTreat patient = new PatientTreat(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null);
        DoctorTreat doctor = new DoctorTreat(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        Examination exam = new Examination(patient, doctor);
        Diagnosis diagnosis = new Diagnosis(patient);
        exam.addDiagnosi(diagnosis);
        assertTrue(exam.removeDiagnosi(diagnosis));
        assertFalse(exam.hasDiagnosis());
        assertEquals(0, exam.numberOfDiagnosis());
        assertFalse(exam.getDiagnosis().contains(diagnosis));
    }

    @Test
    public void testAddDiagnosiAt() {
        PatientTreat patient = new PatientTreat(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null);
        DoctorTreat doctor = new DoctorTreat(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        Examination exam = new Examination(patient, doctor);
        Diagnosis diagnosis1 = new Diagnosis(patient);
        Diagnosis diagnosis2 = new Diagnosis(patient);
        exam.addDiagnosi(diagnosis1);
        assertTrue(exam.addDiagnosiAt(diagnosis2, 0));
        assertEquals(diagnosis2, exam.getDiagnosi(0));
        assertEquals(diagnosis1, exam.getDiagnosi(1));
    }
}
