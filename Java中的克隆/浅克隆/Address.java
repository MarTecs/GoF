package ǳ��¡;

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
		sb.append("���ң�" + state + ",");
		sb.append("ʡ��" + province + ",");
		sb.append("�У�" + city + ",");
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
