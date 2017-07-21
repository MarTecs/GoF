package 单例模式的实现;

	/**
	 * @name 懒汉模式：所谓懒汉，也就是在不得已，要用到的时候才实例化
	 * @author sivan
	 * @description 懒汉模式的单例
	 */
public class Singleton {
	
	
	private static Singleton uniqueInstance = null;		//定义一个变量存储创建好的实例
	
	private String singleData;							//单例模式自己的属性
	
	/**
	 * 私有化构造方法
	 */
	private Singleton() {
		
	}
		
	/**
	 * 定义一个方法来提供实例
	 * @return 一个Singleton 实例
	 */
	public static synchronized Singleton getInstance() {
		
		//判断存储实例的变量是否为空
		if(uniqueInstance == null){
			//如果存储实例变量为空，我们创建一个实例
			uniqueInstance = new Singleton();
		}
		
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
