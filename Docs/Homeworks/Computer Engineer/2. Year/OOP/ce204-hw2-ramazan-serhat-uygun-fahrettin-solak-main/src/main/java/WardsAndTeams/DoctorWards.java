package WardsAndTeams;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/

import Organization.*;

import java.sql.Date;
import java.util.*;

// line 25 "model.ump"
// line 115 "model.ump"
public class DoctorWards extends Doctor
{

  public DoctorWards(String aTitle, String aGivenName, String aMiddleName, String aFamilyName, String aName,
			Date aBirthDate, String aGender, String aHomeAddress, String aPhone, Date aJoined, String aEducation,
			String aCertification, String aLanguages, Department aDepartment, String aSpecialty, String aLocations) {
		super(aTitle, aGivenName, aMiddleName, aFamilyName, aName, aBirthDate, aGender, aHomeAddress, aPhone, aJoined,
				aEducation, aCertification, aLanguages, aDepartment, aSpecialty, aLocations);
		// TODO Auto-generated constructor stub
		specialty = aSpecialty;
	    locations = aLocations;
	    patientWards = new ArrayList<PatientWards>();
	}


//------------------------
  // MEMBER VARIABLES
  //------------------------

  //DoctorWards Attributes
  private String specialty;
  private String locations;

  //DoctorWards Associations
  private List<PatientWards> patientWards;
  private Team team;


  public boolean setSpecialty(String aSpecialty)
  {
    boolean wasSet = false;
    specialty = aSpecialty;
    wasSet = true;
    return wasSet;
  }

  public boolean setLocations(String aLocations)
  {
    boolean wasSet = false;
    locations = aLocations;
    wasSet = true;
    return wasSet;
  }

  public String getSpecialty()
  {
    return specialty;
  }

  public String getLocations()
  {
    return locations;
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
  /* Code from template association_GetMany_clear */
  protected void clear_patientWards()
  {
    patientWards.clear();
  }
  /* Code from template association_GetOne */
  public Team getTeam()
  {
    return team;
  }

  public boolean hasTeam()
  {
    boolean has = team != null;
    return has;
  }
  /* Code from template association_GetOne_clear */
  protected void clear_team()
  {
    team = null;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPatientWards()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addPatientWard(PatientWards aPatientWard)
  {
    boolean wasAdded = false;
    if (patientWards.contains(aPatientWard)) { return false; }
    patientWards.add(aPatientWard);
    if (aPatientWard.indexOfDoctorWard(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aPatientWard.addDoctorWard(this);
      if (!wasAdded)
      {
        patientWards.remove(aPatientWard);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removePatientWard(PatientWards aPatientWard)
  {
    boolean wasRemoved = false;
    if (!patientWards.contains(aPatientWard))
    {
      return wasRemoved;
    }

    int oldIndex = patientWards.indexOf(aPatientWard);
    patientWards.remove(oldIndex);
    if (aPatientWard.indexOfDoctorWard(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aPatientWard.removeDoctorWard(this);
      if (!wasRemoved)
      {
        patientWards.add(oldIndex,aPatientWard);
      }
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
  /* Code from template association_SetOptionalOneToMany */
  public boolean setTeam(Team aTeam)
  {
    boolean wasSet = false;
    Team existingTeam = team;
    team = aTeam;
    if (existingTeam != null && !existingTeam.equals(aTeam))
    {
      existingTeam.removeDoctorWard(this);
    }
    if (aTeam != null)
    {
      aTeam.addDoctorWard(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    ArrayList<PatientWards> copyOfPatientWards = new ArrayList<PatientWards>(patientWards);
    patientWards.clear();
    for(PatientWards aPatientWard : copyOfPatientWards)
    {
      aPatientWard.removeDoctorWard(this);
    }
    if (team != null)
    {
      Team placeholderTeam = team;
      this.team = null;
      placeholderTeam.removeDoctorWard(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "specialty" + ":" + getSpecialty()+ "," +
            "locations" + ":" + getLocations()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "team = "+(getTeam()!=null?Integer.toHexString(System.identityHashCode(getTeam())):"null");
  }
}