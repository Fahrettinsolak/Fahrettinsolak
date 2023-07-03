package Treatment;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/


import java.util.*;

// line 16 "model.ump"
// line 54 "model.ump"
public class Examination
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Examination Associations
  private PatientTreat patientTreat;
  private DoctorTreat doctorTreat;
  private List<Diagnosis> diagnosis;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Examination(PatientTreat aPatientTreat, DoctorTreat aDoctorTreat)
  {
    boolean didAddPatientTreat = setPatientTreat(aPatientTreat);
    if (!didAddPatientTreat)
    {
      throw new RuntimeException("Unable to create examination due to patientTreat. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    boolean didAddDoctorTreat = setDoctorTreat(aDoctorTreat);
    if (!didAddDoctorTreat)
    {
      throw new RuntimeException("Unable to create examination due to doctorTreat. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    diagnosis = new ArrayList<Diagnosis>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public PatientTreat getPatientTreat()
  {
    return patientTreat;
  }
  /* Code from template association_GetOne */
  public DoctorTreat getDoctorTreat()
  {
    return doctorTreat;
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
      existingPatientTreat.removeExamination(this);
    }
    patientTreat.addExamination(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOneToMany */
  public boolean setDoctorTreat(DoctorTreat aDoctorTreat)
  {
    boolean wasSet = false;
    if (aDoctorTreat == null)
    {
      return wasSet;
    }

    DoctorTreat existingDoctorTreat = doctorTreat;
    doctorTreat = aDoctorTreat;
    if (existingDoctorTreat != null && !existingDoctorTreat.equals(aDoctorTreat))
    {
      existingDoctorTreat.removeExamination(this);
    }
    doctorTreat.addExamination(this);
    wasSet = true;
    return wasSet;
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
    if (aDiagnosi.indexOfExamination(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDiagnosi.addExamination(this);
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
    if (aDiagnosi.indexOfExamination(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDiagnosi.removeExamination(this);
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
    PatientTreat placeholderPatientTreat = patientTreat;
    this.patientTreat = null;
    if(placeholderPatientTreat != null)
    {
      placeholderPatientTreat.removeExamination(this);
    }
    DoctorTreat placeholderDoctorTreat = doctorTreat;
    this.doctorTreat = null;
    if(placeholderDoctorTreat != null)
    {
      placeholderDoctorTreat.removeExamination(this);
    }
    ArrayList<Diagnosis> copyOfDiagnosis = new ArrayList<Diagnosis>(diagnosis);
    diagnosis.clear();
    for(Diagnosis aDiagnosi : copyOfDiagnosis)
    {
      aDiagnosi.removeExamination(this);
    }
  }

}