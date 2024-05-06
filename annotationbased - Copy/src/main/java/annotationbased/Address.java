package annotationbased;

import org.springframework.stereotype.Component;

@Component("add")
public class Address {
	int id;
	String street;
	String city;
	String state;
	public Address() {
		super();
		id=24;
		street="Bus stand road";
	    city="Mahabubabad";
	    state="Telangana";
	}
	public Address(int id, String street, String city, String state) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	

}
