package Organization;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/


import java.sql.Date;
import java.util.*;

// line 95 "model.ump"
// line 187 "model.ump"
public class FrontDeskStaff extends AdministrativeStaff
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public FrontDeskStaff(String aTitle, String aGivenName, String aMiddleName, String aFamilyName, String aName, Date aBirthDate, String aGender, String aHomeAddress, String aPhone, Date aJoined, String aEducation, String aCertification, String aLanguages, Department aDepartment)
  {
    super(aTitle, aGivenName, aMiddleName, aFamilyName, aName, aBirthDate, aGender, aHomeAddress, aPhone, aJoined, aEducation, aCertification, aLanguages, aDepartment);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }


}