package spring.aop.entity;

public class Exam2023 implements Exam {
	private int kor;
	private int eng;
	private int math;
	private int com;
	
	public Exam2023() {};
	
	public Exam2023(int kor, int eng, int math, int com){
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}
	
	@Override
	public int total() {
		int result = kor+eng+math+com;
		System.out.printf("[Primary concern] Total : %d\n", result);
		return result;
	}

	@Override
	public float avg() {
		float result = kor+eng+math+com/4.0f;
		System.out.printf("[Primary concern] Average : %.2f\n", result);
		return result;
	}

	public void setKor(int kor){
		this.kor = kor;
	}
	
	public void setEng(int eng){
		this.eng = eng;
	}
	
	public void setMath(int math){
		this.math = math;
	}
	
	public void setCom(int com){
		this.com = com;
	}

}
