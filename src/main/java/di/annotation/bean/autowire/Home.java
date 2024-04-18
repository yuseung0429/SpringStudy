package di.annotation.bean.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class Home {
	@Autowired
	Person owner;
	
	public Person getOwner() {
		return this.owner;
	}
	
}
