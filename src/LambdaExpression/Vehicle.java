package LambdaExpression;

public class Vehicle {

	private String vNo;
	private double vPrice;
	private String vType;
	
	public String getvNo() {
		return vNo;
	}

	public void setvNo(String vNo) {
		this.vNo = vNo;
	}

	public double getvPrice() {
		return vPrice;
	}

	public void setvPrice(double vPrice) {
		this.vPrice = vPrice;
	}

	public String getvType() {
		return vType;
	}

	public void setvType(String vType) {
		this.vType = vType;
	}

	@Override
	public String toString() {
		return "Vehicle [vNo=" + vNo + ", vPrice=" + vPrice + ", vType=" + vType + "]";
	}

	
}
