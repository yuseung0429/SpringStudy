package ioc.coupling.tightly;

class Main {
	public static void main(String[] args) {
		Male person = new Male();
//		Female person = new Female();
		System.out.println(person.getGender());
	}
}
