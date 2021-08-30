
public class UsaInterestService2 implements InterestService {

	private double interestRate;

	public UsaInterestService2(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterest() {
		return interestRate;
	}
}