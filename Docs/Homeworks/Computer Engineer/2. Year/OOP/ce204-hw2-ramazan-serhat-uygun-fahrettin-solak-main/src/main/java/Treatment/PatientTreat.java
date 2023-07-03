package Treatment;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/

import Organization.*;

import java.sql.Date;
import java.util.*;

// line 2 "model.ump"
// line 94 "model.ump"
// line 99 "model.ump"
public class PatientTreat extends Patient
{

  public PatientTreat(String aTitle, String aGivenName, String aMiddleName, String aFamilyName, String aName,
			Date aBirthDate, String aGender, String aHomeAddress, String aPhone, String aId, int aAge, Date aAccepted,
			String aSickness, String aPrescriptions, String aAllergies, String aSpecialReqs) {
		super(aTitle, aGivenName, aMiddleName, aFamilyName, aName, aBirthDate, aGender, aHomeAddress, aPhone, aId, aAge,
				aAccepted, aSickness, aPrescriptions, aAllergies, aSpecialReqs);
		// TODO Auto-generated constructor stub
		prescriptions = new ArrayList<Prescription>();
	    treatments = new ArrayList<Treatment>();
	    doctorTreats = new ArrayList<DoctorTreat>();
	    examinations = new ArrayList<Examination>();
	    diagnosis = new ArrayList<Diagnosis>();
	}

//------------------------
  // MEMBER VARIABLES
  //------------------------

  //PatientTreat Associations
  private List<Prescription> prescriptions;
  private List<Treatment> treatments;
  private List<DoctorTreat> doctorTreats;
  private List<Examination> examinations;
  private List<Diagnosis> diagnosis;


  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Prescription getPrescription(int index)
  {
    Prescription aPrescription = prescriptions.get(index);
    return aPrescription;
  }

  public int numberOfPrescriptions()
  {
    int number = prescriptions.size();
    return number;
  }

  public boolean hasPrescriptions()
  {
    boolean has = prescriptions.size() > 0;
    return has;
  }

  public int indexOfPrescription(Prescription aPrescription)
  {
    int index = prescriptions.indexOf(aPrescription);
    return index;
  }
  /* Code from template association_GetMany */
  public Treatment getTreatment(int index)
  {
    Treatment aTreatment = treatments.get(index);
    return aTreatment;
  }

  public List<Treatment> getTreatments()
  {
    List<Treatment> newTreatments = Collections.unmodifiableList(treatments);
    return newTreatments;
  }

  public int numberOfTreatments()
  {
    int number = treatments.size();
    return number;
  }

  public boolean hasTreatments()
  {
    boolean has = treatments.size() > 0;
    return has;
  }

  public int indexOfTreatment(Treatment aTreatment)
  {
    int index = treatments.indexOf(aTreatment);
    return index;
  }
  /* Code from template association_GetMany */
  public DoctorTreat getDoctorTreat(int index)
  {
    DoctorTreat aDoctorTreat = doctorTreats.get(index);
    return aDoctorTreat;
  }

  public List<DoctorTreat> getDoctorTreats()
  {
    List<DoctorTreat> newDoctorTreats = Collections.unmodifiableList(doctorTreats);
    return newDoctorTreats;
  }

  public int numberOfDoctorTreats()
  {
    int number = doctorTreats.size();
    return number;
  }

  public boolean hasDoctorTreats()
  {
    boolean has = doctorTreats.size() > 0;
    return has;
  }

  public int indexOfDoctorTreat(DoctorTreat aDoctorTreat)
  {
    int index = doctorTreats.indexOf(aDoctorTreat);
    return index;
  }
  /* Code from template association_GetMany */
  public Examination getExamination(int index)
  {
    Examination aExamination = examinations.get(index);
    return aExamination;
  }

  public List<Examination> getExaminations()
  {
    List<Examination> newExaminations = Collections.unmodifiableList(examinations);
    return newExaminations;
  }

  public int numberOfExaminations()
  {
    int number = examinations.size();
    return number;
  }

  public boolean hasExaminations()
  {
    boolean has = examinations.size() > 0;
    return has;
  }

  public int indexOfExamination(Examination aExamination)
  {
    int index = examinations.indexOf(aExamination);
    return index;
  }
  /* Code from template association_GetMany */
  public Diagnosis getDiagnosi(int index)
  {
    Diagnosis aDiagnosi = diagnosis.get(index);
    return aDiagnosi;
  }

  public List<Diagnosis> getDiagnosis()
  {
    List<Diagnosis> newDiagnosis = Collections.unmodifiableList(diagnosis);
    return newDiagnosis;
  }

  public int numberOfDiagnosis()
  {
    int number = diagnosis.size();
    return number;
  }

  public boolean hasDiagnosis()
  {
    boolean has = diagnosis.size() > 0;
    return has;
  }

  public int indexOfDiagnosi(Diagnosis aDiagnosi)
  {
    int index = diagnosis.indexOf(aDiagnosi);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPrescriptions()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Prescription addPrescription()
  {
    return new Prescription(this);
  }

  public boolean addPrescription(Prescription aPrescription)
  {
    boolean wasAdded = false;
    if (prescriptions.contains(aPrescription)) { return false; }
    PatientTreat existingPatientTreat = aPrescription.getPatientTreat();
    boolean isNewPatientTreat = existingPatientTreat != null && !this.equals(existingPatientTreat);
    if (isNewPatientTreat)
    {
      aPrescription.setPatientTreat(this);
    }
    else
    {
      prescriptions.add(aPrescription);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removePrescription(Prescription aPrescription)
  {
    boolean wasRemoved = false;
    //Unable to remove aPrescription, as it must always have a patientTreat
    if (!this.equals(aPrescription.getPatientTreat()))
    {
      prescriptions.remove(aPrescription);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addPrescriptionAt(Prescription aPrescription, int index)
  {  
    boolean wasAdded = false;
    if(addPrescription(aPrescription))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPrescriptions()) { index = numberOfPrescriptions() - 1; }
      prescriptions.remove(aPrescription);
      prescriptions.add(index, aPrescription);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePrescriptionAt(Prescription aPrescription, int index)
  {
    boolean wasAdded = false;
    if(prescriptions.contains(aPrescription))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPrescriptions()) { index = numberOfPrescriptions() - 1; }
      prescriptions.remove(aPrescription);
      prescriptions.add(index, aPrescription);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPrescriptionAt(aPrescription, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfTreatments()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Treatment addTreatment()
  {
    return new Treatment(this);
  }

  public boolean addTreatment(Treatment aTreatment)
  {
    boolean wasAdded = false;
    if (treatments.contains(aTreatment)) { return false; }
    PatientTreat existingPatientTreat = aTreatment.getPatientTreat();
    boolean isNewPatientTreat = existingPatientTreat != null && !this.equals(existingPatientTreat);
    if (isNewPatientTreat)
    {
      aTreatment.setPatientTreat(this);
    }
    else
    {
      treatments.add(aTreatment);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeTreatment(Treatment aTreatment)
  {
    boolean wasRemoved = false;
    //Unable to remove aTreatment, as it must always have a patientTreat
    if (!this.equals(aTreatment.getPatientTreat()))
    {
      treatments.remove(aTreatment);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addTreatmentAt(Treatment aTreatment, int index)
  {  
    boolean wasAdded = false;
    if(addTreatment(aTreatment))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTreatments()) { index = numberOfTreatments() - 1; }
      treatments.remove(aTreatment);
      treatments.add(index, aTreatment);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveTreatmentAt(Treatment aTreatment, int index)
  {
    boolean wasAdded = false;
    if(treatments.contains(aTreatment))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTreatments()) { index = numberOfTreatments() - 1; }
      treatments.remove(aTreatment);
      treatments.add(index, aTreatment);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addTreatmentAt(aTreatment, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfDoctorTreats()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addDoctorTreat(DoctorTreat aDoctorTreat)
  {
    boolean wasAdded = false;
    if (doctorTreats.contains(aDoctorTreat)) { return false; }
    doctorTreats.add(aDoctorTreat);
    if (aDoctorTreat.indexOfPatientTreat(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDoctorTreat.addPatientTreat(this);
      if (!wasAdded)
      {
        doctorTreats.remove(aDoctorTreat);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeDoctorTreat(DoctorTreat aDoctorTreat)
  {
    boolean wasRemoved = false;
    if (!doctorTreats.contains(aDoctorTreat))
    {
      return wasRemoved;
    }

    int oldIndex = doctorTreats.indexOf(aDoctorTreat);
    doctorTreats.remove(oldIndex);
    if (aDoctorTreat.indexOfPatientTreat(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDoctorTreat.removePatientTreat(this);
      if (!wasRemoved)
      {
        doctorTreats.add(oldIndex,aDoctorTreat);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addDoctorTreatAt(DoctorTreat aDoctorTreat, int index)
  {  
    boolean wasAdded = false;
    if(addDoctorTreat(aDoctorTreat))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDoctorTreats()) { index = numberOfDoctorTreats() - 1; }
      doctorTreats.remove(aDoctorTreat);
      doctorTreats.add(index, aDoctorTreat);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveDoctorTreatAt(DoctorTreat aDoctorTreat, int index)
  {
    boolean wasAdded = false;
    if(doctorTreats.contains(aDoctorTreat))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDoctorTreats()) { index = numberOfDoctorTreats() - 1; }
      doctorTreats.remove(aDoctorTreat);
      doctorTreats.add(index, aDoctorTreat);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addDoctorTreatAt(aDoctorTreat, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfExaminations()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Examination addExamination(DoctorTreat aDoctorTreat)
  {
    return new Examination(this, aDoctorTreat);
  }

  public boolean addExamination(Examination aExamination)
  {
    boolean wasAdded = false;
    if (examinations.contains(aExamination)) { return false; }
    PatientTreat existingPatientTreat = aExamination.getPatientTreat();
    boolean isNewPatientTreat = existingPatientTreat != null && !this.equals(existingPatientTreat);
    if (isNewPatientTreat)
    {
      aExamination.setPatientTreat(this);
    }
    else
    {
      examinations.add(aExamination);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeExamination(Examination aExamination)
  {
    boolean wasRemoved = false;
    //Unable to remove aExamination, as it must always have a patientTreat
    if (!this.equals(aExamination.getPatientTreat()))
    {
      examinations.remove(aExamination);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addExaminationAt(Examination aExamination, int index)
  {  
    boolean wasAdded = false;
    if(addExamination(aExamination))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfExaminations()) { index = numberOfExaminations() - 1; }
      examinations.remove(aExamination);
      examinations.add(index, aExamination);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveExaminationAt(Examination aExamination, int index)
  {
    boolean wasAdded = false;
    if(examinations.contains(aExamination))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfExaminations()) { index = numberOfExaminations() - 1; }
      examinations.remove(aExamination);
      examinations.add(index, aExamination);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addExaminationAt(aExamination, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfDiagnosis()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Diagnosis addDiagnosi()
  {
    return new Diagnosis(this);
  }

  public boolean addDiagnosi(Diagnosis aDiagnosi)
  {
    boolean wasAdded = false;
    if (diagnosis.contains(aDiagnosi)) { return false; }
    PatientTreat existingPatientTreat = aDiagnosi.getPatientTreat();
    boolean isNewPatientTreat = existingPatientTreat != null && !this.equals(existingPatientTreat);
    if (isNewPatientTreat)
    {
      aDiagnosi.setPatientTreat(this);
    }
    else
    {
      diagnosis.add(aDiagnosi);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeDiagnosi(Diagnosis aDiagnosi)
  {
    boolean wasRemoved = false;
    //Unable to remove aDiagnosi, as it must always have a patientTreat
    if (!this.equals(aDiagnosi.getPatientTreat()))
    {
      diagnosis.remove(aDiagnosi);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addDiagnosiAt(Diagnosis aDiagnosi, int index)
  {  
    boolean wasAdded = false;
    if(addDiagnosi(aDiagnosi))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDiagnosis()) { index = numberOfDiagnosis() - 1; }
      diagnosis.remove(aDiagnosi);
      diagnosis.add(index, aDiagnosi);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveDiagnosiAt(Diagnosis aDiagnosi, int index)
  {
    boolean wasAdded = false;
    if(diagnosis.contains(aDiagnosi))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDiagnosis()) { index = numberOfDiagnosis() - 1; }
      diagnosis.remove(aDiagnosi);
      diagnosis.add(index, aDiagnosi);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addDiagnosiAt(aDiagnosi, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    for(int i=prescriptions.size(); i > 0; i--)
    {
      Prescription aPrescription = prescriptions.get(i - 1);
      aPrescription.delete();
    }
    for(int i=treatments.size(); i > 0; i--)
    {
      Treatment aTreatment = treatments.get(i - 1);
      aTreatment.delete();
    }
    ArrayList<DoctorTreat> copyOfDoctorTreats = new ArrayList<DoctorTreat>(doctorTreats);
    doctorTreats.clear();
    for(DoctorTreat aDoctorTreat : copyOfDoctorTreats)
    {
      aDoctorTreat.removePatientTreat(this);
    }
    for(int i=examinations.size(); i > 0; i--)
    {
      Examination aExamination = examinations.get(i - 1);
      aExamination.delete();
    }
    for(int i=diagnosis.size(); i > 0; i--)
    {
      Diagnosis aDiagnosi = diagnosis.get(i - 1);
      aDiagnosi.delete();
    }
  }

}


