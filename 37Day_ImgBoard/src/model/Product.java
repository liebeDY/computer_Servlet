package model;

public class Product {

	private int num;
	private String name;
	private int quantity;
	private int price;
	private String img;
	private String content;
	
	public Product() {
		
	}

	public Product(int num, String name, int quantity, int price, String img, String content) {
		super();
		this.num = num;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.img = img;
		this.content = content;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Product [num=" + num + ", name=" + name + ", quantity=" + quantity + ", price=" + price + ", img=" + img
				+ ", content=" + content + "]";
	}
}
