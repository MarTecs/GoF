package ʹ�ü򵥹���ģʽ��дʾ��;
/**
 * 
 * @author sivan
 * 
 * @description �ͻ��ˣ�����ʹ��Api�ӿ�
 * �ͻ���ͨ���򵥹���������һ��ʵ�ֽӿڵĶ���Ȼ������ӿڱ�̣��ӿͻ�����������������֪������ʵ�ֵ���
 * ʲô��Ҳ��֪�����ʵ�֣���ֻ֪��ͨ�����������һ���ӿڶ���Ȼ��ͨ������ӿ�����ȡ��Ҫ�Ĺ���
 */
public class Client {
	
	public static void main(String[] args) {
		
		Api api = Factory.createApi();
		api.operation("��������Ҫ���ţ�ֻ�Ǹ����Զ��ѣ�");
	}

}
