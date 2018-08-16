public abstract class Ticket {
	private int price;

	public Ticket(int price) {
		this.price = price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return this.price;
	}
}