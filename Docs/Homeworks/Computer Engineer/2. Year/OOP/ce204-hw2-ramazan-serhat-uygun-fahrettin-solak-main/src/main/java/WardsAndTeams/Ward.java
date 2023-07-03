package WardsAndTeams;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/


import java.util.*;
import java.sql.Date;

// line 17 "model.ump"
// line 68 "model.ump"
// line 91 "model.ump"
// line 103 "model.ump"
public class Ward
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Ward Attributes
  private String name;
  private String patientsGender;
  private int capacity;

  //Ward Associations
  private HospitalWards hospitalWards;
  private List<PatientWards> patientWards;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ward(String aName, String aPatientsGender, int aCapacity, HospitalWards aHospitalWards)
  {
    name = aName;
    patientsGender = aPatientsGender;
    capacity = aCapacity;
    boolean didAddHospitalWards = setHospitalWards(aHospitalWards);
    if (!didAddHospitalWards)
    {
      throw new RuntimeException("Unable to create ward due to hospitalWards. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    patientWards = new ArrayList<PatientWards>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setPatientsGender(String aPatientsGender)
  {
    boolean wasSet = false;
    patientsGender = aPatientsGender;
    wasSet = true;
    return wasSet;
  }

  public boolean setCapacity(int aCapacity)
  {
    boolean wasSet = false;
    capacity = aCapacity;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public String getPatientsGender()
  {
    return patientsGender;
  }

  public int getCapacity()
  {
    return capacity;
  }
  /* Code from template association_GetOne */
  public HospitalWards getHospitalWards()
  {
    return hospitalWards;
  }
  /* Code from template association_GetMany */
  public PatientWards getPatientWard(int index)
  {
    PatientWards aPatientWard = patientWards.get(index);
    return aPatientWard;
  }

  public List<PatientWards> getPatientWards()
  {
    List<PatientWards> newPatientWards = Collections.unmodifiableList(patientWards);
    return newPatientWards;
  }

  public int numberOfPatientWards()
  {
    int number = patientWards.size();
    return number;
  }

  public boolean hasPatientWards()
  {
    boolean has = patientWards.size() > 0;
    return has;
  }

  public int indexOfPatientWard(PatientWards aPatientWard)
  {
    int index = patientWards.indexOf(aPatientWard);
    return index;
  }
  /* Code from template association_SetOneToMany */
  public boolean setHospitalWards(HospitalWards aHospitalWards)
  {
    boolean wasSet = false;
    if (aHospitalWards == null)
    {
      return wasSet;
    }

    HospitalWards existingHospitalWards = hospitalWards;
    hospitalWards = aHospitalWards;
    if (existingHospitalWards != null && !existingHospitalWards.equals(aHospitalWards))
    {
      existingHospitalWards.removeWard(this);
    }
    hospitalWards.addWard(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPatientWards()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public PatientWards addPatientWard(String aId, String aGender, int aAge, Date aAccepted, String aSickness, String aPrescriptions, String aAllergies, String aSpecialReqs, Team aTeam)
  {
    return new PatientWards(aId, aGender, aSpecialReqs, aSpecialReqs, aSpecialReqs, aAccepted, aSpecialReqs, aSpecialReqs, aSpecialReqs, aSpecialReqs, aAge, aAccepted, aSickness, aPrescriptions, aAllergies, aSpecialReqs, this, aTeam);
  }

  public boolean addPatientWard(PatientWards aPatientWard)
  {
    boolean wasAdded = false;
    if (patientWards.contains(aPatientWard)) { return false; }
    Ward existingWard = aPatientWard.getWard();
    boolean isNewWard = existingWard != null && !this.equals(existingWard);
    if (isNewWard)
    {
      aPatientWard.setWard(this);
    }
    else
    {
      patientWards.add(aPatientWard);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removePatientWard(PatientWards aPatientWard)
  {
    boolean wasRemoved = false;
    //Unable to remove aPatientWard, as it must always have a ward
    if (!this.equals(aPatientWard.getWard()))
    {
      patientWards.remove(aPatientWard);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addPatientWardAt(PatientWards aPatientWard, int index)
  {  
    boolean wasAdded = false;
    if(addPatientWard(aPatientWard))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPatientWards()) { index = numberOfPatientWards() - 1; }
      patientWards.remove(aPatientWard);
      patientWards.add(index, aPatientWard);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePatientWardAt(PatientWards aPatientWard, int index)
  {
    boolean wasAdded = false;
    if(patientWards.contains(aPatientWard))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPatientWards()) { index = numberOfPatientWards() - 1; }
      patientWards.remove(aPatientWard);
      patientWards.add(index, aPatientWard);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPatientWardAt(aPatientWard, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    HospitalWards placeholderHospitalWards = hospitalWards;
    this.hospitalWards = null;
    if(placeholderHospitalWards != null)
    {
      placeholderHospitalWards.removeWard(this);
    }
    for(int i=patientWards.size(); i > 0; i--)
    {
      PatientWards aPatientWard = patientWards.get(i - 1);
      aPatientWard.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "patientsGender" + ":" + getPatientsGender()+ "," +
            "capacity" + ":" + getCapacity()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "hospitalWards = "+(getHospitalWards()!=null?Integer.toHexString(System.identityHashCode(getHospitalWards())):"null");
  }
}