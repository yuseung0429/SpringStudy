package aop.pojo.around;

class BusinessLogic {
	public int doLogic() {
		System.out.println("Business Logic");
		int a = 1/1;
//		int a = 1/0;
		return a;
	}
}
