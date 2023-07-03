package Treatment;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/


import java.util.*;

// line 30 "model.ump"
// line 73 "model.ump"
public class Prescription
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Prescription Associations
  private List<Therapy> therapies;
  private PatientTreat patientTreat;
  private List<DoctorTreat> doctorTreats;
  private List<Diagnosis> diagnosis;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Prescription(PatientTreat aPatientTreat)
  {
    therapies = new ArrayList<Therapy>();
    boolean didAddPatientTreat = setPatientTreat(aPatientTreat);
    if (!didAddPatientTreat)
    {
      throw new RuntimeException("Unable to create prescription due to patientTreat. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    doctorTreats = new ArrayList<DoctorTreat>();
    diagnosis = new ArrayList<Diagnosis>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Therapy getTherapy(int index)
  {
    Therapy aTherapy = therapies.get(index);
    return aTherapy;
  }

  public List<Therapy> getTherapies()
  {
    List<Therapy> newTherapies = Collections.unmodifiableList(therapies);
    return newTherapies;
  }

  public int numberOfTherapies()
  {
    int number = therapies.size();
    return number;
  }

  public boolean hasTherapies()
  {
    boolean has = therapies.size() > 0;
    return has;
  }

  public int indexOfTherapy(Therapy aTherapy)
  {
    int index = therapies.indexOf(aTherapy);
    return index;
  }
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
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfTherapies()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Therapy addTherapy(PatientTreat aPatientTreat)
  {
    return new Therapy(aPatientTreat, this);
  }

  public boolean addTherapy(Therapy aTherapy)
  {
    boolean wasAdded = false;
    if (therapies.contains(aTherapy)) { return false; }
    Prescription existingPrescription = aTherapy.getPrescription();
    boolean isNewPrescription = existingPrescription != null && !this.equals(existingPrescription);
    if (isNewPrescription)
    {
      aTherapy.setPrescription(this);
    }
    else
    {
      therapies.add(aTherapy);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeTherapy(Therapy aTherapy)
  {
    boolean wasRemoved = false;
    //Unable to remove aTherapy, as it must always have a prescription
    if (!this.equals(aTherapy.getPrescription()))
    {
      therapies.remove(aTherapy);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addTherapyAt(Therapy aTherapy, int index)
  {  
    boolean wasAdded = false;
    if(addTherapy(aTherapy))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTherapies()) { index = numberOfTherapies() - 1; }
      therapies.remove(aTherapy);
      therapies.add(index, aTherapy);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveTherapyAt(Therapy aTherapy, int index)
  {
    boolean wasAdded = false;
    if(therapies.contains(aTherapy))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTherapies()) { index = numberOfTherapies() - 1; }
      therapies.remove(aTherapy);
      therapies.add(index, aTherapy);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addTherapyAt(aTherapy, index);
    }
    return wasAdded;
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
      existingPatientTreat.removePrescription(this);
    }
    patientTreat.addPrescription(this);
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
    if (aDoctorTreat.indexOfPrescription(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDoctorTreat.addPrescription(this);
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
    if (aDoctorTreat.indexOfPrescription(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDoctorTreat.removePrescription(this);
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
    if (aDiagnosi.indexOfPrescription(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDiagnosi.addPrescription(this);
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
    if (aDiagnosi.indexOfPrescription(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDiagnosi.removePrescription(this);
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
    for(int i=therapies.size(); i > 0; i--)
    {
      Therapy aTherapy = therapies.get(i - 1);
      aTherapy.delete();
    }
    PatientTreat placeholderPatientTreat = patientTreat;
    this.patientTreat = null;
    if(placeholderPatientTreat != null)
    {
      placeholderPatientTreat.removePrescription(this);
    }
    ArrayList<DoctorTreat> copyOfDoctorTreats = new ArrayList<DoctorTreat>(doctorTreats);
    doctorTreats.clear();
    for(DoctorTreat aDoctorTreat : copyOfDoctorTreats)
    {
      aDoctorTreat.removePrescription(this);
    }
    ArrayList<Diagnosis> copyOfDiagnosis = new ArrayList<Diagnosis>(diagnosis);
    diagnosis.clear();
    for(Diagnosis aDiagnosi : copyOfDiagnosis)
    {
      aDiagnosi.removePrescription(this);
    }
  }

}


