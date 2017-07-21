package ����ģʽ��ʵ��;

	/**
	 * @name ����ģʽ����ν������Ҳ�����ڲ����ѣ�Ҫ�õ���ʱ���ʵ����
	 * @author sivan
	 * @description ����ģʽ�ĵ���
	 */
public class Singleton {
	
	
	private static Singleton uniqueInstance = null;		//����һ�������洢�����õ�ʵ��
	
	private String singleData;							//����ģʽ�Լ�������
	
	/**
	 * ˽�л����췽��
	 */
	private Singleton() {
		
	}
		
	/**
	 * ����һ���������ṩʵ��
	 * @return һ��Singleton ʵ��
	 */
	public static synchronized Singleton getInstance() {
		
		//�жϴ洢ʵ���ı����Ƿ�Ϊ��
		if(uniqueInstance == null){
			//����洢ʵ������Ϊ�գ����Ǵ���һ��ʵ��
			uniqueInstance = new Singleton();
		}
		
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
