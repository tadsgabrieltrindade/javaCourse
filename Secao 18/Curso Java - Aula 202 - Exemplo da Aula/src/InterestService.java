
public interface InterestService {

	double getInterest(); //esse aqui não pode ser default pq a interface não pode "guardar"
	//estado e a interface não pode ter construtor e nem atributos.
	
	//esse default permite que essa implementação seja cumprinda dessa maneira em todas
	//as classes que for implementar essa interface. 
	default double payment(Double amount, int months) { 
		if(months < 1) {
			throw new IllegalArgumentException("Amount not is valid");
		}else {
			return amount * Math.pow(1.0 + getInterest()/100, months);
		}
	}
}
