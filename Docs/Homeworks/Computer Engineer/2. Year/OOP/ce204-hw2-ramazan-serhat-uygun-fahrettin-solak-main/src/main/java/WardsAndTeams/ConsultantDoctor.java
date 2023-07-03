package WardsAndTeams;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/


import java.util.*;

import Organization.Department;

import java.sql.Date;

// line 32 "model.ump"
// line 73 "model.ump"
public class ConsultantDoctor extends DoctorWards
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

 

  public ConsultantDoctor(String aTitle, String aGivenName, String aMiddleName, String aFamilyName, String aName,
			Date aBirthDate, String aGender, String aHomeAddress, String aPhone, Date aJoined, String aEducation,
			String aCertification, String aLanguages, Department aDepartment, String aSpecialty, String aLocations) {
		super(aTitle, aGivenName, aMiddleName, aFamilyName, aName, aBirthDate, aGender, aHomeAddress, aPhone, aJoined,
				aEducation, aCertification, aLanguages, aDepartment, aSpecialty, aLocations);
		// TODO Auto-generated constructor stub
	}

//------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany_specialization */
  public PatientWards getPatientWard_PatientWards(int index)
  {
    PatientWards aPatientWard = (PatientWards)super.getPatientWard(index);
    return aPatientWard;
  }

  /* required for Java 7. */
  @SuppressWarnings("unchecked")
  public List<PatientWards> getPatientWards_PatientWards()
  {
    List<? extends PatientWards> newPatientWards = super.getPatientWards();
    return (List<PatientWards>)newPatientWards;
  }
  /* Code from template association_GetOne_specialization */
  public Team getTeam_OneTeam()
  {
    return super.getTeam();
  }
  /* Code from template association_set_specialization_reqSuperCode */  /* Code from template association_MinimumNumberOfMethod_specialization */
  public static int minimumNumberOfPatientWards_PatientWards()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne_specialization */
  public PatientWards addPatientWard(String aId, String aGender, int aAge, Date aAccepted, String aSickness, String aPrescriptions, String aAllergies, String aSpecialReqs, Ward aWard, Team aTeam)
  {
    // need to keep this because of the type differences between sub & super classes
    return new PatientWards(aId, aGender, aSpecialReqs, aSpecialReqs, aSpecialReqs, aAccepted, aSpecialReqs, aSpecialReqs, aSpecialReqs, aSpecialReqs, aAge, aAccepted, aSickness, aPrescriptions, aAllergies, aSpecialReqs, aWard, aTeam);
  }  /* Code from template association_set_specialization_reqSuperCode */
  public void delete()
  {
    Team existingTeam = getTeam();
    super.clear_team();
    if (existingTeam != null)
    {
      existingTeam.delete();
    }
    super.delete();
  }
  public static ConsultantDoctor get(int i) {
	    // TODO Auto-generated method stub
	    return null;
	}

}