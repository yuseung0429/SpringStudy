package ioc.coupling.loosely.factory;

class Main {
	public static void main(String[] args) {
		Person person = PersonFactory.getInstance("male");
//		Person person = PersonFactory.getInstance("female");
		System.out.println(person.getGender());
	}
}
