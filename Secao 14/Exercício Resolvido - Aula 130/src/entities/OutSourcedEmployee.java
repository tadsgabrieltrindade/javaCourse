package entities;

public class OutSourcedEmployee extends Employee {
	private Double additionalCharge;
	
	public OutSourcedEmployee() {
	}
	
	public OutSourcedEmployee(String name, Integer hour, Double valuePerHour, Double additionalCharge) {
		super(name, hour, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Double payment() {
		return this.getValuePerHour() * this.getHour() + (additionalCharge * 1.1);
	}
}
