package FunctionalInterface;

public class Customer {
    private int id;
    private String name;
    private long phone;
    private String gender;
    private String Address;
	public Customer(int id, String name, long phone, String gender, String address) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		Address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + ", gender=" + gender + ", Address="
				+ Address + "]";
	}
    
}
