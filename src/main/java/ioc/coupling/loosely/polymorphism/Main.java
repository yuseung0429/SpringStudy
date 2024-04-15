package ioc.coupling.loosely.polymorphism;

class Main {
	public static void main(String[] args) {
		Person person = new Male();
//		Person person = new Female();
		System.out.println(person.getGender());
	}
}
