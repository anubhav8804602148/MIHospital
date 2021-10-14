package operationTheatre;

public class Item {
	private double price;
	private String name;
	private boolean expirable;
	private boolean expired;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isExpirable() {
		return expirable;
	}
	public void setExpirable(boolean expirable) {
		this.expirable = expirable;
	}
	public boolean isExpired() {
		return expired;
	}
	public void setExpired(boolean expired) {
		this.expired = expired;
	}
}
