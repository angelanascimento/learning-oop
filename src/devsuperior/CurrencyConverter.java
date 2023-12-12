package devsuperior;

public class CurrencyConverter {
	
	private double dollarPrice;
	private double valueToBuy;
	
	public double getDollarPrice() {
		return dollarPrice;
	}
	public void setDollarPrice(double dollarPrice) {
		this.dollarPrice = dollarPrice;
	}
	public double getValueToBuy() {
		return valueToBuy;
	}
	public void setValueToBuy(double valueToBuy) {
		this.valueToBuy = valueToBuy;
	}

	public double amountToPay() {
		
		double calc = dollarPrice * valueToBuy;
		
		return calc + (calc * 0.06);
	}
	
	@Override
	public String toString() {
		return "CurrencyConverter [dollarPrice=" + dollarPrice + ", valueToBuy=" + valueToBuy + "]";
	}
	
}
