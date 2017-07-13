package 初步入门工厂模式;
/**
 * 
 * @author sivan
 * @description 接口的具体实现对象B
 */
public class ImplB implements Api{

	@Override
	public void operation(String s) {
		// TODO Auto-generated method stub
		
		System.out.println("ImplB s=="+s);
	}

	
}
