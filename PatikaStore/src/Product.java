
public abstract class Product  {
	private String brandName;
	private int id;
	private int price;
	private int discount;
	private int stock;
	private String name;
	private int memory;
	private double screenSize;
	private int ram;
	
	



	public Product(String brandName, int id, int price, int discount, int stock, String name, int memory,
			double screenSize, int ram) {
		super();
		this.brandName = brandName;
		this.id = id;
		this.price = price;
		this.discount = discount;
		this.stock = stock;
		this.name = name;
		this.memory = memory;
		this.screenSize = screenSize;
		this.ram = ram;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

}
