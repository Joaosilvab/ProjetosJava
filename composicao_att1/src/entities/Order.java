package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enuns.OrderStatus;

public class Order {
 
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	List<OrderItem> items = new ArrayList<>();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Order() {
	}


	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}


	public Date getMoment() {
		return moment;
	}


	public void setMoment(Date moment) {
		this.moment = moment;
	}


	public OrderStatus getStatus() {
		return status;
	}


	public void setStatus(OrderStatus status) {
		this.status = status;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public List<OrderItem> getItems() {
		return items;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItm(OrderItem item) {
		items.remove(item);
	}
	
	public double total() {
		double sum = 0;
		for(OrderItem c : items) {
			sum += c.subTotal(); 
		}
		return sum; 
	}


	
	public void exibir() {
			   for(OrderItem c : items) {
					System.out.println(c);
			   }
	}


	@Override
	public String toString() {
		return "Order moment: " 
			   + sdf2.format(getMoment())
			   + "\n"
			   + "Order statud: " 
			   + getStatus()
			   + "\n"
			   + "Client: " 
			   + getClient().getName() 
			   + "(" 
			   + sdf.format(getClient().getBirthDate()) 
			   + ")" 
			   + "- " 
			   + getClient().getEmail(); 
	}
	
	
	
}
