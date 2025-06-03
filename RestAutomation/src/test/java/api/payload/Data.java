package api.payload;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {

	
	private int year;
	private double price;
	
	@JsonProperty("CPU model")
	private String CPU_model;
	
	@JsonProperty("Hard disk size")
	private String Hard_disk_size;
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCPU_model() {
		return CPU_model;
	}
	public void setCPU_model(String CPU_model) {
		CPU_model = CPU_model;
	}
	public String getHard_disk_size() {
		return Hard_disk_size;
	}
	public void setHard_disk_size(String hard_disk_size) {
		Hard_disk_size = hard_disk_size;
	}
	
}
