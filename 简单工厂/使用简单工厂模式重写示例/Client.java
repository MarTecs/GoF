package 使用简单工厂模式重写示例;
/**
 * 
 * @author sivan
 * 
 * @description 客户端：测试使用Api接口
 * 客户端通过简单工厂创建了一个实现接口的对象，然后面向接口编程，从客户端来看，它根本不知道具体实现的是
 * 什么，也不知道如何实现，它只知道通过工厂获得了一个接口对象，然后通过这个接口来获取想要的功能
 */
public class Client {
	
	public static void main(String[] args) {
		
		Api api = Factory.createApi();
		api.operation("哈哈，不要紧张，只是个测试而已！");
	}

}
