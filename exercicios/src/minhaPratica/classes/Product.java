package minhaPratica.classes;

public class Product extends BaseClass {

	double price;
	double discount;

	public Product(String name, double price, double discount) {
		super(name);

		setPrice(price);
		setDiscount(discount);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getPriceWithDiscount() {
		return price * (1 - discount);
	}
}
