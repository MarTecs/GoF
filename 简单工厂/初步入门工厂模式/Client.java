package 初步入门工厂模式;
/**
 * 
 * @author sivan
 * @description 客户端开始使用Api接口
 */
public class Client {

	public static void main(String[] args){
		
		//通过简单的接口来获取接口对象
		Api api = Factory.createApi(2);
		System.out.println(api.getClass());
		api.operation("正在使用简单工厂");
	}
	
}
