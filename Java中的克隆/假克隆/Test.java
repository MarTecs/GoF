package �ٿ�¡;
/**
 * @description Java����ļٿ�¡
 * @author sivan
 *
 */
public class Test {

	public static void main(String[] args) {
		
		System.out.println("��¡֮ǰ��");
		Employee employee1 = new Employee();
		employee1.setName("��̫��");
		employee1.setAge(109);
		System.out.println("Ա��1����Ϣ��");
		System.out.println(employee1);
		
		System.out.println("��¡֮��");
		Employee employee2 = employee1;
		employee2.setName("���");
		employee2.setAge(114);
		System.out.println("Ա��2����Ϣ��");
		System.out.println(employee2);
		
		System.out.println("Ա��1����Ϣ��");
		System.out.println(employee1);
	}
	
	/**
	 * �۲�������֪�������޸���employee2֮��employee��ֵҲ�����˸ı䣬��˽����ٿ�¡
	 * 
	 * ע�⣺����Java�ڴ�ռ��Ϊ���࣬�Ѻ�ջ��ջ�б�����������Լ���������ã������б����������Ķ��󣬶���ջ�еı�����ʹ�����֮��
	 * ������������л��գ������ڶ��еĶ���������������ѡ��һ��ʱ�������л���
	 */
}
