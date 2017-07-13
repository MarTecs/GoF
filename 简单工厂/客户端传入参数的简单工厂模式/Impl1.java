package 客户端传入参数的简单工厂模式;

public class Impl1 implements Api{


	@Override
	public void test1(String s) {
		// TODO Auto-generated method stub
		System.out.println("Now In Impl1. The input s=="+s);
	}

}
