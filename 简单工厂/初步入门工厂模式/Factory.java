package �������Ź���ģʽ;
/**
 * 
 * @author sivan
 * @description �����࣬��������API����
 */
public class Factory {
	/**
	 * ���崴��Api����ķ���
	 * @param  conditionʾ��,���ⲿ�����ѡ����
	 * @return �����õ�Api����
	 */
	public static Api createApi(int condition){
		
		//����ĳЩ����ѡ�񣬾��崴����һ�������ʵ�ֶ������������ⲿ���룬Ҳ���Դ�����;������ȡ
		Api api = null;
		if(condition == 1) {
			api = new ImplA();
		}else if(condition == 2){
			api = new ImplB();
		}
		
		return api;
	}
	
}
