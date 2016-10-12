import com.cg.service.CustomerService;
import com.cg.service.CustomerServiceImpl;
//import com.cg.service.CustomerServiceImpl2;


public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CustomerService service = new CustomerServiceImpl();
		
		System.out.println(service.findAll().get(0).getFirstname());
	}

}
