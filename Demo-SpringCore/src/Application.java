import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.cg.IService;
/*import com.cg.InMemoryDAOImpl;
import com.cg.MyServiceImpl;*/

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(appContext);

		String msg = (String) appContext.getBean("message");
		System.out.println(msg.length());
		
		IService serviceRef = appContext.getBean("myService",IService.class);
		
		System.out.println(serviceRef.getMessages());
		
		
		
		ApplicationContext appContext2 = new FileSystemXmlApplicationContext("config/applicationContext.xml");
		System.out.println(appContext2);
		
		
		
/*		IService serviceRef = new MyServiceImpl();
		
		((MyServiceImpl)serviceRef).setDaoRef(new InMemoryDAOImpl());
		System.out.println(serviceRef.getMessages());;
*/		
		

		
		
		
		
		
		
	}
	
	
}
