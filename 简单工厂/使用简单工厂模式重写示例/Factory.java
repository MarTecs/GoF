package ʹ�ü򵥹���ģʽ��дʾ��;
/**
 * 
 * @author sivan
 * @description �����࣬��������API����
 */
public class Factory {
	
	/**
	 * ���崴��Api����ķ���
	 * @return �����õ�Api����
	 */
	public static Api createApi() {
		return new Impl();
	}
	
	
}
