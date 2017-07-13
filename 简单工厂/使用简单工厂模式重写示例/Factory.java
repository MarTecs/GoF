package 使用简单工厂模式重写示例;
/**
 * 
 * @author sivan
 * @description 工厂类，用来创建API对象
 */
public class Factory {
	
	/**
	 * 具体创建Api对象的方法
	 * @return 创建好的Api对象
	 */
	public static Api createApi() {
		return new Impl();
	}
	
	
}
