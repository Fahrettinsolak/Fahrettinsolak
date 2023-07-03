package WardsAndTeams;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/

import Organization.*;
import java.sql.Date;
import java.util.*;

// line 44 "model.ump"
// line 120 "model.ump"
public class PatientWards extends Patient
{

  public PatientWards(String aTitle, String aGivenName, String aMiddleName, String aFamilyName, String aName,
			Date aBirthDate, String aGender, String aHomeAddress, String aPhone, String aId, int aAge, Date aAccepted,
			String aSickness, String aPrescriptions, String aAllergies, String aSpecialReqs, Ward aWard, Team aTeam) {
		super(aTitle, aGivenName, aMiddleName, aFamilyName, aName, aBirthDate, aGender, aHomeAddress, aPhone, aId, aAge,
				aAccepted, aSickness, aPrescriptions, aAllergies, aSpecialReqs);
		// TODO Auto-generated constructor stub
		id = aId;
	    gender = aGender;
	    age = aAge;
	    accepted = aAccepted;
	    sickness = aSickness;
	    prescriptions = aPrescriptions;
	    allergies = aAllergies;
	    specialReqs = aSpecialReqs;
	    boolean didAddWard = setWard(aWard);
	    if (!didAddWard)
	    {
	      throw new RuntimeException("Unable to create patientWard due to ward. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
	    }
	    boolean didAddTeam = setTeam(aTeam);
	    if (!didAddTeam)
	    {
	      throw new RuntimeException("Unable to create patientWard due to team. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
	    }
	    doctorWards = new ArrayList<DoctorWards>();
	}


//------------------------
  // MEMBER VARIABLES
  //------------------------

  //PatientWards Attributes
  private String id;
  private String gender;
  private int age;
  private Date accepted;
  private String sickness;
  private String prescriptions;
  private String allergies;
  private String specialReqs;

  //PatientWards Associations
  private Ward ward;
  private Team team;
  private List<DoctorWards> doctorWards;

  //------------------------
  // CONSTRUCTOR
  //------------------------



  //------------------------
  // INTERFACE
  //------------------------

  public boolean setId(String aId)
  {
    boolean wasSet = false;
    id = aId;
    wasSet = true;
    return wasSet;
  }

  public boolean setGender(String aGender)
  {
    boolean wasSet = false;
    gender = aGender;
    wasSet = true;
    return wasSet;
  }

  public boolean setAge(int aAge)
  {
    boolean wasSet = false;
    age = aAge;
    wasSet = true;
    return wasSet;
  }

  public boolean setAccepted(Date aAccepted)
  {
    boolean wasSet = false;
    accepted = aAccepted;
    wasSet = true;
    return wasSet;
  }

  public boolean setSickness(String aSickness)
  {
    boolean wasSet = false;
    sickness = aSickness;
    wasSet = true;
    return wasSet;
  }

  public boolean setPrescriptions(String aPrescriptions)
  {
    boolean wasSet = false;
    prescriptions = aPrescriptions;
    wasSet = true;
    return wasSet;
  }

  public boolean setAllergies(String aAllergies)
  {
    boolean wasSet = false;
    allergies = aAllergies;
    wasSet = true;
    return wasSet;
  }

  public boolean setSpecialReqs(String aSpecialReqs)
  {
    boolean wasSet = false;
    specialReqs = aSpecialReqs;
    wasSet = true;
    return wasSet;
  }

  public String getId()
  {
    return id;
  }

  public String getGender()
  {
    return gender;
  }

  public int getAge()
  {
    return age;
  }

  public Date getAccepted()
  {
    return accepted;
  }

  public String getSickness()
  {
    return sickness;
  }

  public String getPrescriptions()
  {
    return prescriptions;
  }

  public String getAllergies()
  {
    return allergies;
  }

  public String getSpecialReqs()
  {
    return specialReqs;
  }
  /* Code from template association_GetOne */
  public Ward getWard()
  {
    return ward;
  }
  /* Code from template association_GetOne */
  public Team getTeam()
  {
    return team;
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
  /* Code from template association_GetOne_relatedSpecialization */
  public ConsultantDoctor getConsultantDoctor_OneConsultantDoctor()
  {
    return (ConsultantDoctor)ConsultantDoctor.get(0);
  } 
  /* Code from template association_SetOneToMany */
  public boolean setWard(Ward aWard)
  {
      boolean wasSet = false;
      if (ward != null && !ward.equals(aWard))
      {
          // remove old association
          ward.removePatientWard(this);
      }
      if (aWard != null)
      {
          // add new association
          ward = aWard;
          ward.addPatientWard(this);
          wasSet = true;
      }
      return wasSet;
  }
  /* Code from template association_SetOneToMany */
  public boolean setTeam(Team aTeam)
  {
    boolean wasSet = false;
    if (aTeam == null)
    {
      return wasSet;
    }

    Team existingTeam = team;
    team = aTeam;
    if (existingTeam != null && !existingTeam.equals(aTeam))
    {
      existingTeam.removePatientWard(this);
    }
    team.addPatientWard(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfDoctorWards()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addDoctorWard(DoctorWards aDoctorWard)
  {
    boolean wasAdded = false;
    if (doctorWards.contains(aDoctorWard)) { return false; }
    doctorWards.add(aDoctorWard);
    if (aDoctorWard.indexOfPatientWard(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDoctorWard.addPatientWard(this);
      if (!wasAdded)
      {
        doctorWards.remove(aDoctorWard);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeDoctorWard(DoctorWards aDoctorWard)
  {
    boolean wasRemoved = false;
    if (!doctorWards.contains(aDoctorWard))
    {
      return wasRemoved;
    }

    int oldIndex = doctorWards.indexOf(aDoctorWard);
    doctorWards.remove(oldIndex);
    if (aDoctorWard.indexOfPatientWard(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDoctorWard.removePatientWard(this);
      if (!wasRemoved)
      {
        doctorWards.add(oldIndex,aDoctorWard);
      }
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
  /* Code from template association_set_specialization_reqCommonCode */  /* Code from template association_SetOneToMany_relatedSpecialization */
  
  public void delete()
  {
    Ward placeholderWard = ward;
    this.ward = null;
    if(placeholderWard != null)
    {
      placeholderWard.removePatientWard(this);
    }
    Team placeholderTeam = team;
    this.team = null;
    if(placeholderTeam != null)
    {
      placeholderTeam.removePatientWard(this);
    }
    ArrayList<DoctorWards> copyOfDoctorWards = new ArrayList<DoctorWards>(doctorWards);
    doctorWards.clear();
    for(DoctorWards aDoctorWard : copyOfDoctorWards)
    {
      aDoctorWard.removePatientWard(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "id" + ":" + getId()+ "," +
            "gender" + ":" + getGender()+ "," +
            "age" + ":" + getAge()+ "," +
            "sickness" + ":" + getSickness()+ "," +
            "prescriptions" + ":" + getPrescriptions()+ "," +
            "allergies" + ":" + getAllergies()+ "," +
            "specialReqs" + ":" + getSpecialReqs()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "accepted" + "=" + (getAccepted() != null ? !getAccepted().equals(this)  ? getAccepted().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "ward = "+(getWard()!=null?Integer.toHexString(System.identityHashCode(getWard())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "team = "+(getTeam()!=null?Integer.toHexString(System.identityHashCode(getTeam())):"null") + System.getProperties().getProperty("line.separator") ;
            
  }
}