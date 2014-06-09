package optional.demo;

import java.util.Optional;

public class PersonAddress {
	
	public PersonAddress(PersonAddressStreet street) {
		this.street = Optional.ofNullable(street);
	}
	
	private Optional<PersonAddressStreet> street;

	public Optional<PersonAddressStreet> getStreet() {
		return street;
	}

	public void setStreet(PersonAddressStreet street) {
		this.street = Optional.ofNullable(street);
	}
}
