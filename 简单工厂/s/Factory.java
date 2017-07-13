package s;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Factory {
	
	/**
	 * 具体创建Api的方法，根据配置文件的参数来创建接口
	 * @return 创建好的Api对象
	 */
	public static Api createApi() {
		//直接读取配置文件来获取所需要创建实例的类
		Properties props = new Properties();
		InputStream in = null;
		try{
			in = Factory.class.getResourceAsStream("FactoryTest.properties");
			props.load(in);
		}catch(IOException e){
			System.out.println("装载工厂配置文件出错了，具体的堆栈信息如下：");
			e.printStackTrace();
		}finally{
			try{
				in.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		props.getProperty("Impl");
		//用反射去创建，那些例外处理等完善的工作这里就不做了
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
