package optional.demo;

import java.util.Optional;

/**
 * Класс описывающий персону.
 * @author Alexander Podkutin
 *
 */
public class Person {

	private Optional<String> firstName;
	
	private Optional<String> secondName;
	
	private Optional<Integer> age;
	
	private Optional<PersonAddress> address;
	
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
	
	public Optional<PersonAddress> getAddress() {
		return address;
	}

	public void setAddress(PersonAddress address) {
		//Выкидывает NullPointerException, если передается null в качестве параметра address
		this.address = Optional.of(address);
	}
	
	@Override
	public String toString() {
		StringBuilder personDescription = new StringBuilder("First name: ");
		personDescription.append(getFirstName().isPresent() ? getFirstName().get() : "[EMPTY]").
						  append(", Second name: ").
						  append(getSecondName().isPresent() ? getSecondName().get() : "[EMPTY]").
						  append(", Age: ").
						  append(getAge().isPresent() ? getAge().get() : "[EMPTY]");
		return personDescription.toString();
	}
}
