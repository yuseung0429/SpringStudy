package spring.di.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Exam2023 implements Exam {
	@Value("20")
	private int kor;
	@Value("40")
	private int eng;
	@Value("60")
	private int math;
	@Value("80")
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
		// TODO 자동 생성된 메소드 스텁
		return kor+eng+math+com;
	}

	@Override
	public float avg() {
		return total() / 4.0f;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	public void setCom(int com) {
		this.com = com;
	}

}
