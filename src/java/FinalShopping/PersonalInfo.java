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
public class PersonalInfo {

	Ad Ad;
	private Integer mobileNumber;
	private String name;
	private String note;

	public Integer getMobileNumber() {
		return this.mobileNumber;
	}

	/**
	 * 
	 * @param mobileNumber
	 */
	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getNote() {
		return this.note;
	}

	/**
	 * 
	 * @param note
	 */
	public void setNote(String note) {
		this.note = note;
	}

}
