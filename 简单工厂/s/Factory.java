package s;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Factory {
	
	/**
	 * ���崴��Api�ķ��������������ļ��Ĳ����������ӿ�
	 * @return �����õ�Api����
	 */
	public static Api createApi() {
		//ֱ�Ӷ�ȡ�����ļ�����ȡ����Ҫ����ʵ������
		Properties props = new Properties();
		InputStream in = null;
		try{
			in = Factory.class.getResourceAsStream("FactoryTest.properties");
			props.load(in);
		}catch(IOException e){
			System.out.println("װ�ع��������ļ������ˣ�����Ķ�ջ��Ϣ���£�");
			e.printStackTrace();
		}finally{
			try{
				in.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		props.getProperty("Impl");
		//�÷���ȥ��������Щ���⴦������ƵĹ�������Ͳ�����
		Api api = null;
		try {
			api = (Api) Class.forName(props.getProperty("ImplClass")).newInstance();
		}catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return api;
	}
}
