package Treatment;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/

import Organization.*;

import java.sql.Date;
import java.util.*;

// line 8 "model.ump"
// line 104 "model.ump"
public class DoctorTreat extends Doctor 
{

  public DoctorTreat(String aTitle, String aGivenName, String aMiddleName, String aFamilyName, String aName,
			Date aBirthDate, String aGender, String aHomeAddress, String aPhone, Date aJoined, String aEducation,
			String aCertification, String aLanguages, Department aDepartment, String aSpecialty, String aLocations) {
		super(aTitle, aGivenName, aMiddleName, aFamilyName, aName, aBirthDate, aGender, aHomeAddress, aPhone, aJoined,
				aEducation, aCertification, aLanguages, aDepartment, aSpecialty, aLocations);
		// TODO Auto-generated constructor stub
		patientTreats = new ArrayList<PatientTreat>();
	    examinations = new ArrayList<Examination>();
	    prescriptions = new ArrayList<Prescription>();
	    treatments = new ArrayList<Treatment>();
	    diagnosis = new ArrayList<Diagnosis>();
	}

//------------------------
  // MEMBER VARIABLES
  //------------------------

  //DoctorTreat Associations
  private List<PatientTreat> patientTreats;
  private List<Examination> examinations;
  private List<Prescription> prescriptions;
  private List<Treatment> treatments;
  private List<Diagnosis> diagnosis;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public PatientTreat getPatientTreat(int index)
  {
    PatientTreat aPatientTreat = patientTreats.get(index);
    return aPatientTreat;
  }

  public List<PatientTreat> getPatientTreats()
  {
    List<PatientTreat> newPatientTreats = Collections.unmodifiableList(patientTreats);
    return newPatientTreats;
  }

  public int numberOfPatientTreats()
  {
    int number = patientTreats.size();
    return number;
  }

  public boolean hasPatientTreats()
  {
    boolean has = patientTreats.size() > 0;
    return has;
  }

  public int indexOfPatientTreat(PatientTreat aPatientTreat)
  {
    int index = patientTreats.indexOf(aPatientTreat);
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
  public Prescription getPrescription(int index)
  {
    Prescription aPrescription = prescriptions.get(index);
    return aPrescription;
  }

  public List<Prescription> getPrescriptions()
  {
    List<Prescription> newPrescriptions = Collections.unmodifiableList(prescriptions);
    return newPrescriptions;
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
  public static int minimumNumberOfPatientTreats()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addPatientTreat(PatientTreat aPatientTreat)
  {
    boolean wasAdded = false;
    if (patientTreats.contains(aPatientTreat)) { return false; }
    patientTreats.add(aPatientTreat);
    if (aPatientTreat.indexOfDoctorTreat(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aPatientTreat.addDoctorTreat(this);
      if (!wasAdded)
      {
        patientTreats.remove(aPatientTreat);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removePatientTreat(PatientTreat aPatientTreat)
  {
    boolean wasRemoved = false;
    if (!patientTreats.contains(aPatientTreat))
    {
      return wasRemoved;
    }

    int oldIndex = patientTreats.indexOf(aPatientTreat);
    patientTreats.remove(oldIndex);
    if (aPatientTreat.indexOfDoctorTreat(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aPatientTreat.removeDoctorTreat(this);
      if (!wasRemoved)
      {
        patientTreats.add(oldIndex,aPatientTreat);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addPatientTreatAt(PatientTreat aPatientTreat, int index)
  {  
    boolean wasAdded = false;
    if(addPatientTreat(aPatientTreat))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPatientTreats()) { index = numberOfPatientTreats() - 1; }
      patientTreats.remove(aPatientTreat);
      patientTreats.add(index, aPatientTreat);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePatientTreatAt(PatientTreat aPatientTreat, int index)
  {
    boolean wasAdded = false;
    if(patientTreats.contains(aPatientTreat))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPatientTreats()) { index = numberOfPatientTreats() - 1; }
      patientTreats.remove(aPatientTreat);
      patientTreats.add(index, aPatientTreat);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPatientTreatAt(aPatientTreat, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfExaminations()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Examination addExamination(PatientTreat aPatientTreat)
  {
    return new Examination(aPatientTreat, this);
  }

  public boolean addExamination(Examination aExamination)
  {
    boolean wasAdded = false;
    if (examinations.contains(aExamination)) { return false; }
    DoctorTreat existingDoctorTreat = aExamination.getDoctorTreat();
    boolean isNewDoctorTreat = existingDoctorTreat != null && !this.equals(existingDoctorTreat);
    if (isNewDoctorTreat)
    {
      aExamination.setDoctorTreat(this);
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
    //Unable to remove aExamination, as it must always have a doctorTreat
    if (!this.equals(aExamination.getDoctorTreat()))
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
  public static int minimumNumberOfPrescriptions()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addPrescription(Prescription aPrescription)
  {
    boolean wasAdded = false;
    if (prescriptions.contains(aPrescription)) { return false; }
    prescriptions.add(aPrescription);
    if (aPrescription.indexOfDoctorTreat(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aPrescription.addDoctorTreat(this);
      if (!wasAdded)
      {
        prescriptions.remove(aPrescription);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removePrescription(Prescription aPrescription)
  {
    boolean wasRemoved = false;
    if (!prescriptions.contains(aPrescription))
    {
      return wasRemoved;
    }

    int oldIndex = prescriptions.indexOf(aPrescription);
    prescriptions.remove(oldIndex);
    if (aPrescription.indexOfDoctorTreat(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aPrescription.removeDoctorTreat(this);
      if (!wasRemoved)
      {
        prescriptions.add(oldIndex,aPrescription);
      }
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
  /* Code from template association_AddManyToManyMethod */
  public boolean addTreatment(Treatment aTreatment)
  {
    boolean wasAdded = false;
    if (treatments.contains(aTreatment)) { return false; }
    treatments.add(aTreatment);
    if (aTreatment.indexOfDoctorTreat(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aTreatment.addDoctorTreat(this);
      if (!wasAdded)
      {
        treatments.remove(aTreatment);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeTreatment(Treatment aTreatment)
  {
    boolean wasRemoved = false;
    if (!treatments.contains(aTreatment))
    {
      return wasRemoved;
    }

    int oldIndex = treatments.indexOf(aTreatment);
    treatments.remove(oldIndex);
    if (aTreatment.indexOfDoctorTreat(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aTreatment.removeDoctorTreat(this);
      if (!wasRemoved)
      {
        treatments.add(oldIndex,aTreatment);
      }
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
  public static int minimumNumberOfDiagnosis()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addDiagnosi(Diagnosis aDiagnosi)
  {
    boolean wasAdded = false;
    if (diagnosis.contains(aDiagnosi)) { return false; }
    diagnosis.add(aDiagnosi);
    if (aDiagnosi.indexOfDoctorTreat(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDiagnosi.addDoctorTreat(this);
      if (!wasAdded)
      {
        diagnosis.remove(aDiagnosi);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeDiagnosi(Diagnosis aDiagnosi)
  {
    boolean wasRemoved = false;
    if (!diagnosis.contains(aDiagnosi))
    {
      return wasRemoved;
    }

    int oldIndex = diagnosis.indexOf(aDiagnosi);
    diagnosis.remove(oldIndex);
    if (aDiagnosi.indexOfDoctorTreat(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDiagnosi.removeDoctorTreat(this);
      if (!wasRemoved)
      {
        diagnosis.add(oldIndex,aDiagnosi);
      }
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
    ArrayList<PatientTreat> copyOfPatientTreats = new ArrayList<PatientTreat>(patientTreats);
    patientTreats.clear();
    for(PatientTreat aPatientTreat : copyOfPatientTreats)
    {
      aPatientTreat.removeDoctorTreat(this);
    }
    for(int i=examinations.size(); i > 0; i--)
    {
      Examination aExamination = examinations.get(i - 1);
      aExamination.delete();
    }
    ArrayList<Prescription> copyOfPrescriptions = new ArrayList<Prescription>(prescriptions);
    prescriptions.clear();
    for(Prescription aPrescription : copyOfPrescriptions)
    {
      aPrescription.removeDoctorTreat(this);
    }
    ArrayList<Treatment> copyOfTreatments = new ArrayList<Treatment>(treatments);
    treatments.clear();
    for(Treatment aTreatment : copyOfTreatments)
    {
      aTreatment.removeDoctorTreat(this);
    }
    ArrayList<Diagnosis> copyOfDiagnosis = new ArrayList<Diagnosis>(diagnosis);
    diagnosis.clear();
    for(Diagnosis aDiagnosi : copyOfDiagnosis)
    {
      aDiagnosi.removeDoctorTreat(this);
    }
  }

}


