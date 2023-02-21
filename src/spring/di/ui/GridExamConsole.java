package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {

	private Exam exam;
	public GridExamConsole() {
	}
	public GridExamConsole(Exam exam){
		this.exam = exam;
	}
	@Override
	public void print() {
		System.out.println("忙式式式式式式式式式式式式忖");
		System.out.printf("弛	total	弛%3d		弛\n", exam.total());
		System.out.println("戍式式式式式式托式式式式式扣");
		System.out.printf("弛	average	弛%3.2f		弛\n", exam.avg());
		System.out.println("戌式式式式式式式式式式式式戎");
	}
	@Autowired
	@Qualifier("exam2")
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
