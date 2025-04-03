package Product_model;

public class productModel {

	private int id;
	private int price;
	private int stock;
	private String name;
	
	
	public productModel(int id, int price, int stock, String name) {
		super();
		this.id = id;
		this.price = price;
		this.stock = stock;
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
	
	
}
