package WardsAndTeams;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/


import java.util.*;
import java.sql.Date;

// line 11 "model.ump"
// line 63 "model.ump"
// line 86 "model.ump"
// line 96 "model.ump"
public class Team
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Team Attributes
  private String name;

  //Team Associations
  private List<DoctorWards> doctorWards;
  private HospitalWards hospitalWards;
  private List<PatientWards> patientWards;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Team(String aName, HospitalWards aHospitalWards)
  {
    name = aName;
    doctorWards = new ArrayList<DoctorWards>();
    boolean didAddHospitalWards = setHospitalWards(aHospitalWards);
    if (!didAddHospitalWards)
    {
      throw new RuntimeException("Unable to create team due to hospitalWards. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
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

  public String getName()
  {
    return name;
  }
  /* Code from template association_GetMany */
  public DoctorWards getDoctorWard(int index)
  {
    DoctorWards aDoctorWard = doctorWards.get(index);
    return aDoctorWard;
  }

  public List<DoctorWards> getDoctorWards()
  {
    List<DoctorWards> newDoctorWards = Collections.unmodifiableList(doctorWards);
    return newDoctorWards;
  }

  public int numberOfDoctorWards()
  {
    int number = doctorWards.size();
    return number;
  }

  public boolean hasDoctorWards()
  {
    boolean has = doctorWards.size() > 0;
    return has;
  }

  public int indexOfDoctorWard(DoctorWards aDoctorWard)
  {
    int index = doctorWards.indexOf(aDoctorWard);
    return index;
  }
  /* Code from template association_GetMany_clear */
  protected void clear_doctorWards()
  {
    doctorWards.clear();
  }
  /* Code from template association_GetOne */
  public HospitalWards getHospitalWards()
  {
    return hospitalWards;
  }
  /* Code from template association_GetOne_relatedSpecialization */
  public ConsultantDoctor getConsultantDoctor_OneConsultantDoctor()
  {
    return (ConsultantDoctor)ConsultantDoctor.get(0);
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
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfDoctorWards()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addDoctorWard(DoctorWards aDoctorWard)
  {
    boolean wasAdded = false;
    if (doctorWards.contains(aDoctorWard)) { return false; }
    Team existingTeam = aDoctorWard.getTeam();
    if (existingTeam == null)
    {
      aDoctorWard.setTeam(this);
    }
    else if (!this.equals(existingTeam))
    {
      existingTeam.removeDoctorWard(aDoctorWard);
      addDoctorWard(aDoctorWard);
    }
    else
    {
      doctorWards.add(aDoctorWard);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeDoctorWard(DoctorWards aDoctorWard)
  {
    boolean wasRemoved = false;
    if (doctorWards.contains(aDoctorWard))
    {
      doctorWards.remove(aDoctorWard);
      aDoctorWard.setTeam(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addDoctorWardAt(DoctorWards aDoctorWard, int index)
  {  
    boolean wasAdded = false;
    if(addDoctorWard(aDoctorWard))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDoctorWards()) { index = numberOfDoctorWards() - 1; }
      doctorWards.remove(aDoctorWard);
      doctorWards.add(index, aDoctorWard);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveDoctorWardAt(DoctorWards aDoctorWard, int index)
  {
    boolean wasAdded = false;
    if(doctorWards.contains(aDoctorWard))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDoctorWards()) { index = numberOfDoctorWards() - 1; }
      doctorWards.remove(aDoctorWard);
      doctorWards.add(index, aDoctorWard);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addDoctorWardAt(aDoctorWard, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOneToMandatoryMany */
  public boolean setHospitalWards(HospitalWards aHospitalWards)
  {
    boolean wasSet = false;
    //Must provide hospitalWards to team
    if (aHospitalWards == null)
    {
      return wasSet;
    }

    if (hospitalWards != null && hospitalWards.numberOfTeams() <= HospitalWards.minimumNumberOfTeams())
    {
      return wasSet;
    }

    HospitalWards existingHospitalWards = hospitalWards;
    hospitalWards = aHospitalWards;
    if (existingHospitalWards != null && !existingHospitalWards.equals(aHospitalWards))
    {
      boolean didRemove = existingHospitalWards.removeTeam(this);
      if (!didRemove)
      {
        hospitalWards = existingHospitalWards;
        return wasSet;
      }
    }
    hospitalWards.addTeam(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_set_specialization_reqCommonCode */  /* Code from template association_SetOneToOptionalOne_relatedSpecialization */
  
  /* Code from template association_GetPrivate */
  private void setTeam(ConsultantDoctor aConsultantDoctor, Team aTeam)
  {
    try
    {
      java.lang.reflect.Field mentorField = aConsultantDoctor.getClass().getDeclaredField("team");
      mentorField.setAccessible(true);
      mentorField.set(aConsultantDoctor, aTeam);
    }
    catch (Exception e)
    {
      throw new RuntimeException("Issue internally setting aTeam to aConsultantDoctor", e);
    }
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPatientWards()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public PatientWards addPatientWard(String aId, String aGender, int aAge, Date aAccepted, String aSickness, String aPrescriptions, String aAllergies, String aSpecialReqs, Ward aWard)
  {
    return new PatientWards(aId, aGender, aSpecialReqs, aSpecialReqs, aSpecialReqs, aAccepted, aSpecialReqs, aSpecialReqs, aSpecialReqs, aSpecialReqs, aAge, aAccepted, aSickness, aPrescriptions, aAllergies, aSpecialReqs, aWard, this);
  }

  public boolean addPatientWard(PatientWards aPatientWard)
  {
    boolean wasAdded = false;
    if (patientWards.contains(aPatientWard)) { return false; }
    Team existingTeam = aPatientWard.getTeam();
    boolean isNewTeam = existingTeam != null && !this.equals(existingTeam);
    if (isNewTeam)
    {
      aPatientWard.setTeam(this);
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
    //Unable to remove aPatientWard, as it must always have a team
    if (!this.equals(aPatientWard.getTeam()))
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
    while (doctorWards.size() > 0)
    {
      DoctorWards aDoctorWard = doctorWards.get(doctorWards.size() - 1);
      aDoctorWard.delete();
      doctorWards.remove(aDoctorWard);
    }
    
    HospitalWards placeholderHospitalWards = hospitalWards;
    this.hospitalWards = null;
    if(placeholderHospitalWards != null)
    {
      placeholderHospitalWards.removeTeam(this);
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
            "name" + ":" + getName()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "hospitalWards = "+(getHospitalWards()!=null?Integer.toHexString(System.identityHashCode(getHospitalWards())):"null") + System.getProperties().getProperty("line.separator") ;
            
  }
}