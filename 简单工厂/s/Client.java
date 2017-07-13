package s;

public class Client {
	public static void main(String[] args) {
		Api api = Factory.createApi();
		api.test1("哈哈，不要紧张，只是个测试而已");
	}
}
