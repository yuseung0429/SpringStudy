package di.xml.factory;

class Earth {
	static Earth instance = new Earth();
	private Earth() {};
	public static Earth getInstance() {
		return instance;
	}
}
