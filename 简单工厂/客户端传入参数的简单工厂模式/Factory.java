package �ͻ��˴�������ļ򵥹���ģʽ;

public class Factory {
	
	public static Api createApi(int type){
		Api api = null;
		if(type == 1){
			api = new Impl1();
		}else if(type == 2){
			api = new Impl2();
		}
		
		return api;
	}

}
