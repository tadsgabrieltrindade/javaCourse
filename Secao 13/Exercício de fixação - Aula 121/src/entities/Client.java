package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	private String name;
	private String email;
	private Date bithDate;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Client(String name, String email, String date) throws ParseException {
		this.name = name;
		this.email = email;
		this.bithDate = sdf.parse(date);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getBithDate() {
		return sdf.format(bithDate);
	}
	public void setBithDate(String bithDate) throws ParseException {
		this.bithDate = sdf.parse(bithDate);
	}

}
