
public interface InterestService {

	double getInterest(); //esse aqui n�o pode ser default pq a interface n�o pode "guardar"
	//estado e a interface n�o pode ter construtor e nem atributos.
	
	//esse default permite que essa implementa��o seja cumprinda dessa maneira em todas
	//as classes que for implementar essa interface. 
	default double payment(Double amount, int months) { 
		if(months < 1) {
			throw new IllegalArgumentException("Amount not is valid");
		}else {
			return amount * Math.pow(1.0 + getInterest()/100, months);
		}
	}
}
