package spring.di;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		//ExamConsole console = (ExamConsole)context.getBean("console");
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
		List<Exam> exams = (List<Exam>)context.getBean("exams");
		
		for(Exam e : exams) 
			System.out.printf("total = %d, average : %.2f\n", e.total(), e.avg());
	}

}
