package 浅克隆;

public class Address {
	
	private String state;
	private String province;
	private String city;
	
	public Address(String state, String province, String city) {
		this.state = state;
		this.city = city;
		this.province = province;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("国家：" + state + ",");
		sb.append("省：" + province + ",");
		sb.append("市：" + city + ",");
		return sb.toString();
		
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
