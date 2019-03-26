package hello;

public class Car {

    private String VIN;
    private String color;
    private Integer miles;
    
	public Car(String vIN, String color, Integer miles) {
		super();
		VIN = vIN;
		this.color = color;
		this.miles = miles;
	}
	
	public String getVIN() {
		return VIN;
	}
	public void setVIN(String vIN) {
		VIN = vIN;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getMiles() {
		return miles;
	}
	public void setMiles(Integer miles) {
		this.miles = miles;
	}

    
    
}