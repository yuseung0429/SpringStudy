package aop.pojo.afterthrowing;

class BusinessLogic {
	public int doLogic() {
		System.out.println("Business Logic");
		int a = 1/0;
		return a;
	}
}
