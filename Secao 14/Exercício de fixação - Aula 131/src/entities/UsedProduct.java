package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	private Date manufactureDate;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct() {
	}

	public UsedProduct(String name, Double price, String date) throws ParseException {
		super(name, price);
		this.manufactureDate = sdf.parse(date);;
	}

	public String getManufactureDate() {
		return sdf.format(manufactureDate);
	}
	
	public void setManufactureDate(String date) throws ParseException {
		manufactureDate = sdf.parse(date);
	}

	@Override
	public String priceTag() {
		return this.getName() + " (used) $" + String.format("%.2f", this.getPrice()) + " (Manufacure date: " + this.getManufactureDate() + ")";
	}
	
}
