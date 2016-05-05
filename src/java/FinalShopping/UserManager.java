/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FinalShopping;
import java.util.*;
/**
 *
 * @author MEDO
 */

public class UserManager {

	User User;
	DBController DBController=new DBController();
	Collection<SavingList> SavingList;
	Collection<Ad> Ad;
	private UserManager instance;

	public UserManager getInstance() {
            if(instance==null)
            {
                instance=new UserManager();
            }
            
        	return this.instance;
	}

	/**
	 * 
	 * @param instance
	 */
	public void setInstance(UserManager instance) {
		this.instance = instance;
	}

	public void authenticateUser() {
		// TODO - implement UserManager.authenticateUser
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ad
	 */
	public Ad createNewAd(Ad ad) {
           DBController.insertAdIntoDB(ad);
		return ad;
	}

	/**
	 * 
	 * @param name
	 */
	public void createNewSavingList(String name) {
		// TODO - implement UserManager.createNewSavingList
		throw new UnsupportedOperationException();
	}

	public List<SavingList> getSavingList() {
		// TODO - implement UserManager.getSavingList
		throw new UnsupportedOperationException();
	}
//set user 
	public User getUser() {
		// TODO - implement UserManager.getUser
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param UserId
	 */
	public List<Ad> getUserAd(String UserId) {
		DBController.selectUserAd(UserId);
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param AdId
	 */
	public void removeAd(String AdId) {
            try{
		DBController.deleteAd(AdId);
            }catch(Exception ex){
                System.out.println("Error : "+ex);
            }
	}

	/**
	 * 
	 * @param cat
	 * @param p
	 */
	public List<Ad> search(Category cat, Place p) {
		DBController.searchAd(cat, p);
		throw new UnsupportedOperationException();
	}
        
        public List<Ad> searchByPlace(Place p){
            DBController.searchByPlace(p);
            throw new UnsupportedOperationException();
        }
        
         public List<Ad> searchByCategory(Category cat){
            DBController.searchByCategory(cat);
            throw new UnsupportedOperationException();
        }

	/**
	 * 
	 * @param ad
	 * @param updated
	 */
	public void updateAd(String id, Place p) {
		DBController.updateAd(id, p);
		throw new UnsupportedOperationException();
	}
        
        public User signUp(User user){
            DBController.insertNewUser(user);
            return user;
        }
        
        public String login(String email , String password){
           return  DBController.selectUserFromDB(email,password);
            
        }

}
