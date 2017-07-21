package Ϊ��ʹ�õ���ģʽ;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @description ��ȡӦ�������ļ�
 * @author sivan
 *
 */
public class AppConfig {
	
	
	private String parameterA;
	private String parameterB;
	
	public String getParameterA(){
		return parameterA;
	}
	
	public String getParameterB(){
		return parameterB;
	}
	
	/**
	 * ���췽��
	 */
	
	public AppConfig(){
		readConfig();
	}
	
	
	/**
	 * ��ȡӦ�������ļ����������ļ��е����ݶ����������õ�������
	 */
	private void readConfig(){
		Properties p = new Properties();
		InputStream in = null;
		in = AppConfig.class.getResourceAsStream("AppConfig.properties");
		try {
			p.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("װ�������ļ���Ϣ�����ˣ������ջ��Ϣ���£�");
			e.printStackTrace();
		} finally {
			try {
				in.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		//�������ļ������ݶ��������õ�������
		this.parameterA = p.getProperty("paramA");
		this.parameterB = p.getProperty("paramB");
	}
}
