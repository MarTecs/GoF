package ǳ��¡;

public class Test {

	public static void main(String[] args) {
		System.out.println("��¡֮ǰ��");
		Address address = new Address("�й�", "�Ĵ�", "�ɶ�");
		Employee employee1 = new Employee("���", 109, address);
		System.out.println("Ա��1����Ϣ��");
		System.out.println(employee1);
		System.out.println("��¡֮��");
		Employee employee2 = employee1.clone();
		System.out.println("δ�޸Ŀ�¡֮��ı���֮ǰ");
		System.out.println(employee2);
		employee2.getAddress().setState("�й�");
		employee2.getAddress().setProvince("�ӱ�");
		employee2.getAddress().setCity("ʯ��ׯ");
		employee2.setName("����");
		employee2.setAge(114);
		System.out.println("Ա��2����Ϣ");
		System.out.println(employee2);
		System.out.println("Ա��1����Ϣ");
		System.out.println(employee1);
		
		
		/**
		 * �۲�������֪������¡��һ��֮�󣬽��ᱣ����ÿ�¡����Ļ������ͺͲ��ɱ���������ͣ���String,���߶����������������ڲ���
		 * �����仯�������ʹ��ǳ��¡�����ƶ���ͨ��������ô�򵥣������Ҫʹ�����¡����
		 * 
		 * ����Address���еı������ǻ������;��ǲ��ɱ����ͣ���˿���ֱ�Ӳ���ǳ��¡
		 */
	}
}
