package 深克隆;

import 浅克隆.Address;

public class Employee implements Cloneable{

	private String name;
	private int age;
	private Address address;
	
	public Employee(String name, int age, Address address) {
		
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("姓名：" + name + ",");
		sb.append("年龄：" + age + ",");
		sb.append("地址：" + address);
		return sb.toString();
	}
	
	
	
	@Override
	public Employee clone() {
		Employee employee = null;
		try {
			employee = (Employee) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employee;
		
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
