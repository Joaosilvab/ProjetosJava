package entities;

public class Pessoa {

	private String name;
	private int age;
	
	
	private Endereco endereco;


	public Pessoa(String name, int age, Endereco endereco) {
		this.name = name;
		this.age = age;
		this.endereco = endereco;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	} 
	
	
	public void mostrardados() {
		System.out.println("Nome = " + name);
		System.out.println("Idade = " + age);
		System.out.println(endereco);
	}
	
}
