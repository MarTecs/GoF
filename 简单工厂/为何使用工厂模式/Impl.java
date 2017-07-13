package 为何使用工厂模式;

/**
 * 
 * @author sivan
 * @description 对接口的实现
 */
public class Impl implements Api{
	@Override
	public void test1(String s) {
		// TODO Auto-generated method stub
		
		System.out.println("Now In Impl. The input s==" + s);
	}
}
