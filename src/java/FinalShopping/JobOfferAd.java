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
public class JobOfferAd extends Ad {

	JobType JobType;
	JobOfferField JobOfferField;
	private String requiredSkills;
	private Integer salary;
	private int yearsOfExperience;

	public String getRequiredSkills() {
		return this.requiredSkills;
	}

	/**
	 * 
	 * @param requiredSkills
	 */
	public void setRequiredSkills(String requiredSkills) {
		this.requiredSkills = requiredSkills;
	}

	public Integer getSalary() {
		return this.salary;
	}

	/**
	 * 
	 * @param salary
	 */
	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public int getYearsOfExperience() {
		return this.yearsOfExperience;
	}

	/**
	 * 
	 * @param yearsOfExperience
	 */
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public void getAttribute() {
		// TODO - implement JobOfferAd.getAttribute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param attribute
	 */
	public void setAttribute(int attribute) {
		// TODO - implement JobOfferAd.setAttribute
		throw new UnsupportedOperationException();
	}

}
