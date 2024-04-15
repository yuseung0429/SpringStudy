package ioc.coupling.loosely.factory;

class PersonFactory {
	private PersonFactory() {};
	public static Person getInstance(String gender) {
		switch(gender) {
		case "male": return new Male();
		case "female": return new Female();
		}
		return null;
	}
}
