package minhaPratica.classes;

public class Item {

	private Product product;
	private double quantity;

	public Item(Product product, double quantity) {
		setProduct(product);
		setQuantity(quantity);
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice(int occupation) {
		double priceValue;

		switch (occupation) {
			case 2:
				priceValue = product.getPriceWithDiscount();
				break;
			default:
				priceValue = product.getPrice();
				break;
		}

		return priceValue * quantity;
	}
}
