package 为何使用单例模式;

public class Client {
	
	public static void main(String[] args){
		
		//创建读取应用配置文件的对象
		AppConfig config = new AppConfig();
		String paramA = config.getParameterA();
		String paramB = config.getParameterB();
		
		System.out.println("paramA=" + paramA + ",paramB=" + paramB);
	}

}
