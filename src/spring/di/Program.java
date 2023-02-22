package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		
		// Used XML
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml"); 
		 * ExamConsole console = context.getBean(ExamConsole.class); 
		 * console.print();
		 */
		
		//Used Annotation
		ApplicationContext context = new AnnotationConfigApplicationContext(ProgramConfig.class);
		ExamConsole console1 = (ExamConsole)context.getBean("gridexamconsole");
		ExamConsole console2 = (ExamConsole)context.getBean("inlineexamconsole");
		console1.print();
		console2.print();
		
	}

}
