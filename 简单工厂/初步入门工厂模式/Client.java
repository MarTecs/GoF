package �������Ź���ģʽ;
/**
 * 
 * @author sivan
 * @description �ͻ��˿�ʼʹ��Api�ӿ�
 */
public class Client {

	public static void main(String[] args){
		
		//ͨ���򵥵Ľӿ�����ȡ�ӿڶ���
		Api api = Factory.createApi(2);
		System.out.println(api.getClass());
		api.operation("����ʹ�ü򵥹���");
	}
	
}
