package entities;

public class Employe {
	
	private int id;
	private String name;
	private double salary;
	
	
	public Employe(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public void aumento(double porc) {
		salary += salary * porc / 100;
	}
	
	public String toString() {
		return getId() + ", " + getName() + ", " + getSalary();
	}
	
	
}
