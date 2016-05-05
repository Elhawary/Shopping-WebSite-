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
 
public class HomeAd extends Ad {

	private String address;
	private Integer area;
	private Integer price;

	public String getAddress() {
		return this.address;
	}

	/**
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getArea() {
		return this.area;
	}

	/**
	 * 
	 * @param area
	 */
	public void setArea(Integer area) {
		this.area = area;
	}

	public Integer getPrice() {
		return this.price;
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}

}