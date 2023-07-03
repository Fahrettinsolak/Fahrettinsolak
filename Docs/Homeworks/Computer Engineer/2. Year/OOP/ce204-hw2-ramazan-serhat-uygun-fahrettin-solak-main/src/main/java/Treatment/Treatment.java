package Treatment;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/


import java.util.*;

// line 35 "model.ump"
// line 79 "model.ump"
public class Treatment
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Treatment Associations
  private PatientTreat patientTreat;
  private List<DoctorTreat> doctorTreats;
  private List<Diagnosis> diagnosis;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Treatment(PatientTreat aPatientTreat)
  {
    boolean didAddPatientTreat = setPatientTreat(aPatientTreat);
    if (!didAddPatientTreat)
    {
      throw new RuntimeException("Unable to create treatment due to patientTreat. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    doctorTreats = new ArrayList<DoctorTreat>();
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
      existingPatientTreat.removeTreatment(this);
    }
    patientTreat.addTreatment(this);
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
    if (aDoctorTreat.indexOfTreatment(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDoctorTreat.addTreatment(this);
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
    if (aDoctorTreat.indexOfTreatment(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDoctorTreat.removeTreatment(this);
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
    if (aDiagnosi.indexOfTreatment(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDiagnosi.addTreatment(this);
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
    if (aDiagnosi.indexOfTreatment(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDiagnosi.removeTreatment(this);
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
      placeholderPatientTreat.removeTreatment(this);
    }
    ArrayList<DoctorTreat> copyOfDoctorTreats = new ArrayList<DoctorTreat>(doctorTreats);
    doctorTreats.clear();
    for(DoctorTreat aDoctorTreat : copyOfDoctorTreats)
    {
      aDoctorTreat.removeTreatment(this);
    }
    ArrayList<Diagnosis> copyOfDiagnosis = new ArrayList<Diagnosis>(diagnosis);
    diagnosis.clear();
    for(Diagnosis aDiagnosi : copyOfDiagnosis)
    {
      aDiagnosi.removeTreatment(this);
    }
  }

}


