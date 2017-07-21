package 为何使用单例模式;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @description 读取应用配置文件
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
	 * 构造方法
	 */
	
	public AppConfig(){
		readConfig();
	}
	
	
	/**
	 * 读取应用配置文件，把配置文件中的内容都出来并设置到属性上
	 */
	private void readConfig(){
		Properties p = new Properties();
		InputStream in = null;
		in = AppConfig.class.getResourceAsStream("AppConfig.properties");
		try {
			p.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("装载配置文件信息出错了，具体堆栈信息如下：");
			e.printStackTrace();
		} finally {
			try {
				in.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		//把配置文件的内容读出来设置到属性上
		this.parameterA = p.getProperty("paramA");
		this.parameterB = p.getProperty("paramB");
	}
}
