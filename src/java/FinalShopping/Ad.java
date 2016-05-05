/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FinalShopping;

/**
 *
 * @author MEDO
 */
import java.util.*;

public class Ad {
        User user;
	UserManager UserManager;
	Collection<SavingList> SavingList;
	PersonalInfo Personalinfo;
	Category Category;
	Place Place;
        private String username;
	private String description;
	private String ID;
	private String image;
	private String title;

	
	public String getDescription() {
		return this.description;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public String getID() {
		// TODO - implement Ad.getID
                return this.ID;
		//throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ID
	 */
	public void setID(String ID) {
		// TODO - implement Ad.setID
                this.ID = ID;
		//throw new UnsupportedOperationException();
	}

	public String getImage() {
		return this.image;
	}

	/**
	 * 
	 * @param image
	 */
	public void setImage(String image) {
		this.image = image;
	}

	public String getTitle() {
		return this.title;
	}

	/**
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
        
        public void setUserName(String username){
           this.username=username;
        }
        
        public String getUserName(){
            return username;
        }

}