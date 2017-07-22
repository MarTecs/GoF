package 浅克隆;

public class Test {

	public static void main(String[] args) {
		System.out.println("克隆之前：");
		Address address = new Address("中国", "四川", "成都");
		Employee employee1 = new Employee("李白", 109, address);
		System.out.println("员工1的信息：");
		System.out.println(employee1);
		System.out.println("克隆之后");
		Employee employee2 = employee1.clone();
		System.out.println("未修改克隆之后的变量之前");
		System.out.println(employee2);
		employee2.getAddress().setState("中国");
		employee2.getAddress().setProvince("河北");
		employee2.getAddress().setCity("石家庄");
		employee2.setName("老铁");
		employee2.setAge(114);
		System.out.println("员工2的信息");
		System.out.println(employee2);
		System.out.println("员工1的信息");
		System.out.println(employee1);
		
		
		/**
		 * 观察结果可以知道，克隆了一次之后，将会保存调用克隆对象的基本类型和不可变的引用类型，如String,或者对象在其生命周期内不会
		 * 发生变化，则可以使用浅克隆来复制对象，通常不会这么简单，因此需要使用深克隆技术
		 * 
		 * 由于Address类中的变量不是基本类型就是不可变类型，因此可以直接采用浅克隆
		 */
	}
}
