package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;


@Configuration
@ComponentScan("spring.di.entity")
public class ProgramConfig {
	@Bean
	public ExamConsole gridexamconsole()
	{
		return new GridExamConsole();
	}
	@Bean
	public ExamConsole inlineexamconsole()
	{
		return new InlineExamConsole();
	}
}
