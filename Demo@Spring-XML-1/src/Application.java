import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.service.CustomerService;


public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//CustomerService service = new CustomerServiceImpl();
		
		ApplicationContext appContext = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService service =
				appContext.getBean("customerService", CustomerService.class);
		
		System.out.println(service.findAll().get(0).getFirstname());
		
		CustomerService service3 =  
				appContext.getBean("customerService", CustomerService.class);
		
		System.out.println(service == service3);
		
		ApplicationContext appContext2 = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService service2 = 
				appContext2.getBean("customerService", CustomerService.class);
		
		System.out.println(service == service2);

	}

}
