package 深克隆;

import 浅克隆.Address;
import 浅克隆.Employee;

/**
 * 
 * @author sivan
 * 深克隆
 */
public class Test {
	
	public static void main(String[] args) {
		System.out.println("克隆之前：");
		Address address = new Address("中国", "四川", "成都");
		Employee employee1 = new Employee("李白", 109, address);
		System.out.println("员工1的信息：");
		System.out.println(employee1);
		System.out.println("克隆之后");
		Employee employee2 = employee1.clone();
		System.out.println("未修改克隆之后的变量之前:");
		System.out.println(employee2);
		System.out.println("修改克隆之后的变量之后:");
		employee2.getAddress().setState("中国");
		employee2.getAddress().setProvince("河北");
		employee2.getAddress().setCity("石家庄");
		employee2.setName("老铁");
		employee2.setAge(114);
		System.out.println("员工2的信息");
		System.out.println(employee2);
		System.out.println("员工1的信息");
		System.out.println(employee1);
	}

}
