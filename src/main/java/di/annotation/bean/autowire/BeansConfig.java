package di.annotation.bean.autowire;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"di.annotation.bean.autowire"})
public class BeansConfig {
	
	@Bean
	public String name() {
		return "홍길동";
	}
	
//	@Bean
//	public String name() {
//		return "유관순";
//	}
	
	@Bean
	public Calendar birth() {
		return new GregorianCalendar(1998, 1, 15);
	}
	
}
