package Ϊ��ʹ�õ���ģʽ;

public class Client {
	
	public static void main(String[] args){
		
		//������ȡӦ�������ļ��Ķ���
		AppConfig config = new AppConfig();
		String paramA = config.getParameterA();
		String paramB = config.getParameterB();
		
		System.out.println("paramA=" + paramA + ",paramB=" + paramB);
	}

}
