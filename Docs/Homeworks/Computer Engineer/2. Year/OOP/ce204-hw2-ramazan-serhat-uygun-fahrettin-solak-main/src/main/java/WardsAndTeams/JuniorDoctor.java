package WardsAndTeams;

import java.sql.Date;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/


import java.util.*;

import Organization.Department;

// line 39 "model.ump"
// line 81 "model.ump"
public class JuniorDoctor extends DoctorWards
{

  public JuniorDoctor(String aTitle, String aGivenName, String aMiddleName, String aFamilyName, String aName,
			Date aBirthDate, String aGender, String aHomeAddress, String aPhone, Date aJoined, String aEducation,
			String aCertification, String aLanguages, Department aDepartment, String aSpecialty, String aLocations) {
		super(aTitle, aGivenName, aMiddleName, aFamilyName, aName, aBirthDate, aGender, aHomeAddress, aPhone, aJoined,
				aEducation, aCertification, aLanguages, aDepartment, aSpecialty, aLocations);
		// TODO Auto-generated constructor stub
	}

//------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

 

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }

}