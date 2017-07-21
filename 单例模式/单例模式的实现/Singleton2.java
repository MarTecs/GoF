package 单例模式的实现;

/**
 * @name 饿汉模式：所谓饿汉，很饿，所以急于创建对象，也就是在类装载的时候就创建对象
 * @author sivan
 * @description 饿汉模式的单例
 *
 */
public class Singleton2 {

	private static Singleton2 uniqueInstance = new Singleton2();		//实例化一个对象存储，只能实例化一次
	private String singleData;											//单例模式自己的属性
	
	private Singleton2(){
		
	}
	
	/**
	 * 为客户提供唯一的一个实例
	 * @return 唯一的一个实例
	 */
	public static Singleton2 getInstance(){
		return uniqueInstance;
	}
	
	/**
	 * 单例模式自己应有的操作：例如读取配置文件
	 */
	public void singleOperation(){
		
	}
	
	/**
	 * 外部访问单例模式属性的方法
	 * @return 单例模式自己的属性值
	 */
	public String getSingleData() {
		return singleData;
	}
}
