package operationTheatre;

public class Bill {
	private String transactionId;
	private DateTime tot;
	private Item[] items;
	double amount;
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public DateTime getTot() {
		return tot;
	}
	public void setTot(DateTime tot) {
		this.tot = tot;
	}
	public Item[] getItems() {
		return items;
	}
	public void setItems(Item[] items) {
		this.items = items;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
