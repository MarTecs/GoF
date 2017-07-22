package 浅克隆;

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
	
	
	/**
	 * Java 5.0添加了对协变返回类型的支持，即子类覆盖（即重写）基类方法时，返回的类型可以是基类方法返回类型的子类。协变返回类型
	 * 允许返回更为具体的类型。
	 * 在面向对象程序设计中，协变返回类型指的是子类中的成员函数的返回值类型不必严格等同于父类中被重写的成员函数的返回值类型，
	 * 而可以是更 "狭窄" 的类型。
	 */
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
