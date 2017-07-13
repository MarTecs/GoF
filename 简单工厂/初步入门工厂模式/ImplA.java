package 初步入门工厂模式;
/**
 * 
 * @author sivan
 * @desctiption 接口的具体实现对象A
 */
public class ImplA  implements Api{

	@Override
	public void operation(String s) {
		// TODO Auto-generated method stub
		
		System.out.println("ImplA s==" + s);
	}
	

	
}
