
public class Brand {
	
	private String brandName;
	private int id;
	public Brand(String brandName, int id) {
		super();
		this.brandName = brandName;
		this.id = id;
	}
	public Brand() {}
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
	
}
