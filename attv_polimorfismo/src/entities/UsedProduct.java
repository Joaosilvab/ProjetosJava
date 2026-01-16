package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
 

public class UsedProduct extends Product {
	
	DateTimeFormatter FMT = DateTimeFormatter.ofPattern("DD/MM/YYYY"); 
	
	private LocalDate manufactureDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		return getName()
			+ " (Used) "
			+ " $ "
			+ getPrice()
			+ "(Manufacture date: "
			+ FMT.format(manufactureDate)
			+ ")";
	}
}
