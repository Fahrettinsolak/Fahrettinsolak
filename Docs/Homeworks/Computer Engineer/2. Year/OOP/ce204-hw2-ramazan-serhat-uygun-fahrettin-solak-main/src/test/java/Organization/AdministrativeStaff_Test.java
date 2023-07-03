package Organization;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Test;

public class AdministrativeStaff_Test {

  @Test
  public void testDelete() {
	  Hospital hospital =new Hospital(null, null, null);
    Department department = new Department(hospital);
    AdministrativeStaff adminStaff = new AdministrativeStaff("Mr", "John", "M", "Doe", "John Doe", new Date(0), "Erkek", "123 Main St", "555-5555", new Date(0), "Lisans", "Sertifikalı", "İngilizce", department);
    
   
    try {
        adminStaff.delete();
    } catch (Exception e) {
        fail("delete methodunu çağırırken hata fırlatıldı: " + e.getMessage());
    }
    

    assertFalse("Personel silinmedi", department.getStaffs().contains(adminStaff));
  }

}
