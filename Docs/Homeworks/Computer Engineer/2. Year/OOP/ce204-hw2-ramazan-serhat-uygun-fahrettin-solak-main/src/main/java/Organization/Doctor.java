package Organization;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/


import java.util.*;
import java.sql.Date;

/**
 * Specialized employee who looks after patients.
 */
// line 52 "model.ump"
// line 138 "model.ump"
public class Doctor extends OperationsStaff
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Doctor Attributes
  private String specialty;
  private String locations;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Doctor(String aTitle, String aGivenName, String aMiddleName, String aFamilyName, String aName, Date aBirthDate, String aGender, String aHomeAddress, String aPhone, Date aJoined, String aEducation, String aCertification, String aLanguages, Department aDepartment, String aSpecialty, String aLocations)
  {
    super(aTitle, aGivenName, aMiddleName, aFamilyName, aName, aBirthDate, aGender, aHomeAddress, aPhone, aJoined, aEducation, aCertification, aLanguages, aDepartment);
    specialty = aSpecialty;
    locations = aLocations;
  }

  //------------------------
  // INTERFACE
  //------------------------

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

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "specialty" + ":" + getSpecialty()+ "," +
            "locations" + ":" + getLocations()+ "]";
  }
}