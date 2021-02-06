package advanced.lesson5;

public class Shop {
	private String name;
	private String address;
	private int realEstateValue;
	private int annualIncome;
	
	public Shop(String name, String address, int realEstateValue, int annualIncome) {
		this.name = name;
		this.address = address;
		this.realEstateValue = realEstateValue;
		this.annualIncome = annualIncome;
	}
	
	public int countTotalValue() {
		return realEstateValue + annualIncome;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getRealEstateValue() {
		return realEstateValue;
	}
	public void setRealEstateValue(int realEstateValue) {
		this.realEstateValue = realEstateValue;
	}
	public int getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(int annualIncome) {
		this.annualIncome = annualIncome;
	}
}
