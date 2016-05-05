/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FinalShopping;
import java.sql.SQLException;
import static java.sql.Types.NULL;
/**
 *
 * @author MEDO
 */
public class Shopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException  {
       /* User u = new User();
        u.setName("7odm");
        u.setEmail("hosseem");
        u.setId("145");
        String name=u.getName();
        Ad a = new CarAd();
     //   Ad a = new HomeAd();
     //   Ad a=new JobOfferAd();
        JobType j=JobType.PartTime;
        JobOfferField o=JobOfferField.IT;
        
        Place p =Place.Alexandria;
        Category c=Category.Car;
        CarType ct =CarType.Opel;
       ((CarAd) a).CarType = ct;
        a.Place = p;
        a.Category = c;
        a.setUserName(name);
        a.setTitle("4asa");
        a.setImage("DddD");
        a.setDescription("a car ad ");
        ((CarAd) a).setEngineCapacity(1400);
        ((CarAd) a).setModel("Astra");
        ((CarAd) a).setNumberOfKm(2000);
        ((CarAd) a).setPrice(80000); 
    /*    ((HomeAd) a).setPrice(2000);
        ((HomeAd) a).setArea(200);
        ((HomeAd) a).setAddress("haram"); */
     /*   ((JobOfferAd) a).setRequiredSkills("asdf");
        ((JobOfferAd) a).setSalary(4000);
        ((JobOfferAd) a).JobType=j;
        ((JobOfferAd) a).JobOfferField=o;        
        ((JobOfferAd) a).setRequiredSkills("asdf"); */
        
        UserManager us = new UserManager();
       /* us.createNewAd(a);
        us.signUp(u);
       // us.removeAd(a.getID());
        DBController db=new DBController();
      //  db.searchAd(a.Category , a.Place);
    //    db.searchByCategory(a.Category);
       // db.searchByPlace(a.Place);
      //  db.updateAd(a.getID(), a.Place);
       //  db.deleteAd(a.getID());
       // db.selectUserAd(a.getUserName());
        //db.selectUserFromDB("hosseem", "145");
      //  db.insertNewUser(u);
         db.insertAdIntoDB(a);
       // db.selectUserFromDB(u.getEmail(),u.getId());*/
    
    } 
    
}
