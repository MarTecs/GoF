package 客户端传入参数的简单工厂模式;

public class Client {

	public static void main(String[] args) {
		Api api = Factory.createApi(2);
		api.test1("哈哈，不要紧张，只是个测试而已！");
	}
}
