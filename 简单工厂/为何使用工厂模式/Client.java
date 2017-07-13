package 为何使用工厂模式;
/**
 * 
 * @author sivan
 * @description 客户端，测试使用Api接口
 */
public class Client {

	public static void main(String[] args){
		Api api = new Impl();
		api.test1("哈哈，不要紧张，只是个测试而已");
	}
}
