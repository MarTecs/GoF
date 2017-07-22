package 假克隆;
/**
 * @description Java对象的假克隆
 * @author sivan
 *
 */
public class Test {

	public static void main(String[] args) {
		
		System.out.println("克隆之前：");
		Employee employee1 = new Employee();
		employee1.setName("李太白");
		employee1.setAge(109);
		System.out.println("员工1的信息：");
		System.out.println(employee1);
		
		System.out.println("克隆之后");
		Employee employee2 = employee1;
		employee2.setName("李白");
		employee2.setAge(114);
		System.out.println("员工2的信息：");
		System.out.println(employee2);
		
		System.out.println("员工1的信息：");
		System.out.println(employee1);
	}
	
	/**
	 * 观察结果可以知道，在修改了employee2之后，employee的值也发生了改变，因此叫做假克隆
	 * 
	 * 注意：由于Java内存空间分为两类，堆和栈，栈中保存基本类型以及对象的引用，而堆中保存了真正的对象，对于栈中的变量，使用完成之后
	 * 会立即对其进行回收，而对于堆中的对象，虚拟机将会随机选择一个时间对其进行回收
	 */
}
