package Product_model;

public class productModel {

	private int id;
	private int price;
	private int qty;
	private String name;
	
	
	public productModel(int id, int price, int qty, String name) {
		super();
		this.id = id;
		this.price = price;
		this.qty = qty;
		this.name = name;
	}
	
	
	public productModel() {
		
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
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
