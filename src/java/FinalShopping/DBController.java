/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FinalShopping;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author MEDO
 */
public class DBController {

	UserManager UserManager;
	private DBController instance;
        private Connection con;
        private Statement st;
        private ResultSet rs;
        
        public  DBController(){
            try{
            Class.forName("com.mysql.jdbc.Driver");          
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping" , "root" , "");           
            st = con.createStatement();
        }catch(Exception ex){
            System.out.println("ERROR : "+ex);
        }   
        }
	public DBController getInstance() {
		return this.instance;
	}

	/**
	 * 
	 * @param instance
	 */
	public void setInstance(DBController instance) {
		this.instance = instance;
	}

	/**
	 * 
	 * @param adId
	 */
	public boolean deleteAd(String adId) {
            try {
                PreparedStatement statement;
                statement=(PreparedStatement) con.prepareStatement("delete from ad where id='"+adId+"'");
                statement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DBController.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
	}

	/**
	 * 
	 * @param ad
	 */
	public Ad insertAdIntoDB(Ad ad){
           try {
               PreparedStatement statement;
               if (ad instanceof CarAd){
                  statement=(PreparedStatement) con.prepareStatement("insert into ad (UserName,Description,"
                  + "image,title,place,category,price,model,engineCapacity,NumOfKm,CarType) VALUES "
                  + "(?,?,?,?,?,?,?,?,?,?,?)");
                  statement.setString(1, ad.getUserName());
                  statement.setString(2, ad.getDescription());
                  statement.setString(3, ad.getImage());
                  statement.setString(4, ad.getTitle());
                  statement.setString(5,  ad.Place.toString());
                  statement.setString(6, ad.Category.toString()); 
                  statement.setInt(7,((CarAd )ad).getPrice());
                  statement.setString(8,((CarAd )ad).getModel());
                  statement.setInt(9,((CarAd )ad).getEngineCapacity());
                  statement.setInt(10,((CarAd )ad).getNumberOfKm()); 
                  statement.setString(11,((CarAd )ad).CarType.toString());       
                  
                  statement.executeUpdate();
               }  
                if (ad instanceof HomeAd){
                 statement=(PreparedStatement) con.prepareStatement("insert into ad (UserName,Description,"
                  + "image,title,place,category,Address,area,price) VALUES (?,?,?,?,?,?,?,?,?)");      
                  statement.setString(1, ad.getUserName());
                  statement.setString(2, ad.getDescription());
                  statement.setString(3, ad.getImage());
                  statement.setString(4, ad.getTitle());
                  statement.setString(5,  ad.Place.toString());
                  statement.setString(6, ad.Category.toString());
                  statement.setString(7,((HomeAd )ad).getAddress());
                  statement.setInt(8,((HomeAd )ad).getArea());
                  statement.setInt(9,((HomeAd )ad).getPrice());
                  statement.executeUpdate();
                } 
               
               else if (ad instanceof JobOfferAd){
                  statement=(PreparedStatement) con.prepareStatement("insert into ad (UserName,Description,"
                  + "image,title,place,category,salary,yearsOfExperience,requiredSkills,JobOfferField,JobType) VALUES (?,?,?,?,?,?,?,?,?,?,?)");      
                  statement.setString(1, ad.getUserName());
                  statement.setString(2, ad.getDescription());
                  statement.setString(3, ad.getImage());
                  statement.setString(4, ad.getTitle());
                  statement.setString(5,  ad.Place.toString());
                  statement.setString(6, ad.Category.toString());
                  statement.setInt(7,((JobOfferAd )ad).getSalary());
                  statement.setInt(8,((JobOfferAd )ad).getYearsOfExperience());
                  statement.setString(9,((JobOfferAd )ad).getRequiredSkills());
                  statement.setString(10,((JobOfferAd )ad).JobOfferField.toString());
                  statement.setString(11,((JobOfferAd )ad).JobType.toString());
                 
                  statement.executeUpdate();
               }  
               
           }catch(Exception ex){
               System.out.println("ERROR : "+ex);
           }
            return ad; 
        }

	/**
	 * 
	 * @param user
	 */
	public User insertNewUser(User user) {
		 PreparedStatement statement;
            try {
                 statement=(PreparedStatement) con.prepareStatement("insert into users (Email , UserName , Password ) VALUES(?,?,?)");
                 statement.setString(1,user.getEmail() );
                 statement.setString(2,user.getName());
                 statement.setString(3,user.getId());
                 statement.executeUpdate();
		
                
            } catch (Exception ex) {
                System.out.println("ERROR : user name is already existing");
            }
                 return user;
	}

	/**
	 * 
	 * @param c
	 * @param p
	 */
	public String selectUserFromDB(String email , String password) {
	    try{   
            String query="SELECT Email,Password FROM users where Email='"+email+"'AND Password='"+password+"'";
            rs = st.executeQuery(query);
            if (rs.next())
                return ("");
            else
                return ("email or password invalid");
            }catch(Exception ex){
            return ("error :"+ ex);
             }    
	}

	/**
	 * 
	 * @param userId
	 */
	public void selectUserAd(String username) {
            try{   
            String query="SELECT id,place,category FROM ad where UserName='"+username+"'";
            rs = st.executeQuery(query);
            while (rs.next())
                System.out.println("adID : "+rs.getString("id")+"      place : "+rs.getString("place") + "      category : " + rs.getString("category"));
            }catch(Exception ex){
            System.out.println(ex);
        }
	}

	/**
	 * 
	 * @param ad
	 */
	public void updateAd(String id , Place p) {
	try{   
            PreparedStatement statement;
            statement=(PreparedStatement) con.prepareStatement("update ad set place='"+ p +"'where id='"+id+"'");
            statement.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex);
        }
	}

        public void searchAd(Category c , Place p){
            try{   
            String query="SELECT id,Description  FROM ad where category='"+c+"'and place ='"+p+"'";
            rs = st.executeQuery(query);
            while (rs.next()){
                System.out.println("AdID : "+ rs.getString("id")+"      Description : "+rs.getString("Description"));
            }
            }catch(Exception ex){
            System.out.println(ex);
        }
        }
        
        public void searchByCategory(Category c ){
            try{  
            String query="SELECT id,Description  FROM ad where category='"+c+"'";
            rs = st.executeQuery(query);
            while (rs.next()){
                System.out.println("AdID : "+ rs.getString("id")+"      Description : "+rs.getString("Description"));
            }
            }catch(Exception ex){
            System.out.println(ex);
        }
        }
        
        public void searchByPlace(Place p){
            try{    
                String query="SELECT id,Description  FROM ad where  place ='"+p+"'";
               rs = st.executeQuery(query);
                while (rs.next()){
                    System.out.println("AdID : "+ rs.getString("id")+"      Description : "+rs.getString("Description"));
                }
            
            
            }catch(Exception ex){
            System.out.println(ex);
        }
        }
        
	public void openConnectionToDB() {
		// TODO - implement DBController.openConnectionToDB
		throw new UnsupportedOperationException();
	}

}
