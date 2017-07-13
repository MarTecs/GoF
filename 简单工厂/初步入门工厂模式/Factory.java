package 初步入门工厂模式;
/**
 * 
 * @author sivan
 * @description 工厂类，用来创建API对象
 */
public class Factory {
	/**
	 * 具体创建Api对象的方法
	 * @param  condition示意,从外部传入的选择他
	 * @return 创建好的Api对象
	 */
	public static Api createApi(int condition){
		
		//根据某些条件选择，具体创建哪一个具体的实现对象，条件可以外部导入，也可以从其他途径来获取
		Api api = null;
		if(condition == 1) {
			api = new ImplA();
		}else if(condition == 2){
			api = new ImplB();
		}
		
		return api;
	}
	
}
