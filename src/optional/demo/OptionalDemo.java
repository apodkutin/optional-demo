package optional.demo;

import java.util.Optional;

public class OptionalDemo {
	
	public static Optional<Person> getDefaultPerson() {
		Long defaultPersonId = null;
		return Optional.ofNullable(loadPerson(defaultPersonId));
	}
	
	private static Person loadPerson(Long personId) {
		if (personId == null) {
			return null;
		} else {
			Person personToLoad = new Person();
			personToLoad.setFirstName(null);
			personToLoad.setSecondName("Smith");
			personToLoad.setAge(33);
			return personToLoad;
		}
	}

	public static void main(String[] args) {
		Optional<Person> person = getDefaultPerson();
		
		//Если персона найдена, выводим онформацию об этой персоне
		if (person.isPresent()) {
			System.out.println(person.get());
		} else {
			System.out.println("Person not found!");
		}
	}

}
