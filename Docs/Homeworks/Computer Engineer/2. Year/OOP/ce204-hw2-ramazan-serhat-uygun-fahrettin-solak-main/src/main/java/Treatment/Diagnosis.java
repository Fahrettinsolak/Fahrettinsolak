package Treatment;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/


import java.util.*;

// line 21 "model.ump"
// line 61 "model.ump"
public class Diagnosis
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Diagnosis Associations
  private PatientTreat patientTreat;
  private List<DoctorTreat> doctorTreats;
  private List<Examination> examinations;
  private List<Prescription> prescriptions;
  private List<Treatment> treatments;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Diagnosis(PatientTreat aPatientTreat)
  {
    boolean didAddPatientTreat = setPatientTreat(aPatientTreat);
    if (!didAddPatientTreat)
    {
      throw new RuntimeException("Unable to create diagnosi due to patientTreat. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    doctorTreats = new ArrayList<DoctorTreat>();
    examinations = new ArrayList<Examination>();
    prescriptions = new ArrayList<Prescription>();
    treatments = new ArrayList<Treatment>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public PatientTreat getPatientTreat()
  {
    return patientTreat;
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
  /* Code from template association_SetOneToMany */
  public boolean setPatientTreat(PatientTreat aPatientTreat)
  {
    boolean wasSet = false;
    if (aPatientTreat == null)
    {
      return wasSet;
    }

    PatientTreat existingPatientTreat = patientTreat;
    patientTreat = aPatientTreat;
    if (existingPatientTreat != null && !existingPatientTreat.equals(aPatientTreat))
    {
      existingPatientTreat.removeDiagnosi(this);
    }
    patientTreat.addDiagnosi(this);
    wasSet = true;
    return wasSet;
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
    if (aDoctorTreat.indexOfDiagnosi(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDoctorTreat.addDiagnosi(this);
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
    if (aDoctorTreat.indexOfDiagnosi(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDoctorTreat.removeDiagnosi(this);
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
  /* Code from template association_AddManyToManyMethod */
  public boolean addExamination(Examination aExamination)
  {
    boolean wasAdded = false;
    if (examinations.contains(aExamination)) { return false; }
    examinations.add(aExamination);
    if (aExamination.indexOfDiagnosi(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aExamination.addDiagnosi(this);
      if (!wasAdded)
      {
        examinations.remove(aExamination);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeExamination(Examination aExamination)
  {
    boolean wasRemoved = false;
    if (!examinations.contains(aExamination))
    {
      return wasRemoved;
    }

    int oldIndex = examinations.indexOf(aExamination);
    examinations.remove(oldIndex);
    if (aExamination.indexOfDiagnosi(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aExamination.removeDiagnosi(this);
      if (!wasRemoved)
      {
        examinations.add(oldIndex,aExamination);
      }
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
    if (aPrescription.indexOfDiagnosi(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aPrescription.addDiagnosi(this);
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
    if (aPrescription.indexOfDiagnosi(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aPrescription.removeDiagnosi(this);
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
    if (aTreatment.indexOfDiagnosi(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aTreatment.addDiagnosi(this);
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
    if (aTreatment.indexOfDiagnosi(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aTreatment.removeDiagnosi(this);
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

  public void delete()
  {
    PatientTreat placeholderPatientTreat = patientTreat;
    this.patientTreat = null;
    if(placeholderPatientTreat != null)
    {
      placeholderPatientTreat.removeDiagnosi(this);
    }
    ArrayList<DoctorTreat> copyOfDoctorTreats = new ArrayList<DoctorTreat>(doctorTreats);
    doctorTreats.clear();
    for(DoctorTreat aDoctorTreat : copyOfDoctorTreats)
    {
      aDoctorTreat.removeDiagnosi(this);
    }
    ArrayList<Examination> copyOfExaminations = new ArrayList<Examination>(examinations);
    examinations.clear();
    for(Examination aExamination : copyOfExaminations)
    {
      aExamination.removeDiagnosi(this);
    }
    ArrayList<Prescription> copyOfPrescriptions = new ArrayList<Prescription>(prescriptions);
    prescriptions.clear();
    for(Prescription aPrescription : copyOfPrescriptions)
    {
      aPrescription.removeDiagnosi(this);
    }
    ArrayList<Treatment> copyOfTreatments = new ArrayList<Treatment>(treatments);
    treatments.clear();
    for(Treatment aTreatment : copyOfTreatments)
    {
      aTreatment.removeDiagnosi(this);
    }
  }

}


