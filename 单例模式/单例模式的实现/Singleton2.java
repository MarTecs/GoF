package ����ģʽ��ʵ��;

/**
 * @name ����ģʽ����ν�������ܶ������Լ��ڴ�������Ҳ��������װ�ص�ʱ��ʹ�������
 * @author sivan
 * @description ����ģʽ�ĵ���
 *
 */
public class Singleton2 {

	private static Singleton2 uniqueInstance = new Singleton2();		//ʵ����һ������洢��ֻ��ʵ����һ��
	private String singleData;											//����ģʽ�Լ�������
	
	private Singleton2(){
		
	}
	
	/**
	 * Ϊ�ͻ��ṩΨһ��һ��ʵ��
	 * @return Ψһ��һ��ʵ��
	 */
	public static Singleton2 getInstance(){
		return uniqueInstance;
	}
	
	/**
	 * ����ģʽ�Լ�Ӧ�еĲ����������ȡ�����ļ�
	 */
	public void singleOperation(){
		
	}
	
	/**
	 * �ⲿ���ʵ���ģʽ���Եķ���
	 * @return ����ģʽ�Լ�������ֵ
	 */
	public String getSingleData() {
		return singleData;
	}
}
