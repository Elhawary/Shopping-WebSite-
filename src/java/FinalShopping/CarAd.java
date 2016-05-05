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
public class CarAd extends Ad {

	CarType CarType;
	private Integer engineCapacity;
	private String model;
	private Integer numberOfKm;
	private Integer Price;

	public Integer getEngineCapacity() {
		return this.engineCapacity;
	}

	/**
	 * 
	 * @param engineCapacity
	 */
	public void setEngineCapacity(Integer engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public String getModel() {
		return this.model;
	}

	/**
	 * 
	 * @param model
	 */
	public void setModel(String model) {
		this.model = model;
	}

	public Integer getNumberOfKm() {
		return this.numberOfKm;
	}

	/**
	 * 
	 * @param numberOfKm
	 */
	public void setNumberOfKm(Integer numberOfKm) {
		this.numberOfKm = numberOfKm;
	}

	public Integer getPrice() {
		return Price;
		//throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Price
	 */
	public void setPrice(Integer Price) {
		this.Price =Price;
		//throw new UnsupportedOperationException();
	}

}
