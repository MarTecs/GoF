package 客户端传入参数的简单工厂模式;

public class Impl2 implements Api{

	@Override
	public void test1(String s){
		System.out.println("Now In Impl1. The input s=="+s);
	}
}
