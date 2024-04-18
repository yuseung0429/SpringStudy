package aop.pojo.afterreturning;

class BusinessLogic {
	public String doLogic() {
		System.out.println("Business Logic");
		return "value";
	}
}
