package optional.demo;

import java.util.Date;
import java.util.Optional;

public class Person {

	private Optional<String> firstName;
	
	private Optional<String> secondName;
	
	private Optional<Integer> age;
	
	private Optional<PersonAddress> address = Optional.ofNullable(new PersonAddress());
	
	public Optional<String> getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = Optional.ofNullable(firstName);
	}

	public Optional<String> getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = Optional.of(secondName);
	}

	public Optional<Integer> getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = Optional.ofNullable(age);
	}
	
	@Override
	public String toString() {
		StringBuilder personDescription = new StringBuilder("First name: ");
		personDescription.append(getFirstName().isPresent() ? getFirstName().get() : "[EMPTY]").
						  append(", Second name: ").
						  append("").
						  append(", Age: ").
						  append(getAge().isPresent() ? getAge().get() : "[EMPTY]");
		return personDescription.toString();
	}
	
	public Integer getPersonBirthYear() {
		Date todaysDate = new Date();
		return todaysDate.getYear() - getAge().get();
	}

	public Optional<PersonAddress> getAddress() {
		return address;
	}

	public void setAddress(PersonAddress address) {
		//¬ыкидывает NullPointerException, если передаетс€ null в качестве параметра address
		this.address = Optional.of(address);
	}

}
