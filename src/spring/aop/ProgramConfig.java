package spring.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import spring.aop.entity.Exam;
import spring.aop.entity.Exam2023;

@Configuration
@ComponentScan("spring.aop.advisor")
@EnableAspectJAutoProxy
public class ProgramConfig {
	@Bean
	public Exam exam() {
		return new Exam2023(20,40,60,80);
	}

}
