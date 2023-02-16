
public class Phone extends Product{
	public Phone(String brandName, int id, int price, int discount, int stock, String name, int memory,
			double screenSize, int ram,String colour,int battery) {
		super(brandName, id, price, discount, stock, name, memory, screenSize, ram);
		this.battery=battery;
		this.colour=colour;
	}
	private String colour;
	private int battery;

	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}

}
