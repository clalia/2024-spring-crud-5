package spring.test.demo7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import spring.test.demo7.pojo.Customer;
import spring.test.demo7.pojo.Product;
import spring.test.demo7.service.CustomerService;
import spring.test.demo7.service.OrderService;
import spring.test.demo7.service.ProductService;

@SpringBootApplication
public class Demo7Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Demo7Application.class, args);

		
	}
	@Autowired
	private CustomerService customerService;

	@Autowired
	private ProductService productService;

	@Autowired
	private OrderService orderService;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World");

		CustomerTest();

		System.out.println("The end");
	}
	public void CustomerTest() {

		System.out.println("-----------------------------------------------------------");

		Customer c1 = new Customer("Mario", "Rossi", "marior@gmail.com", "344355");
		Customer c2 = new Customer("Diego", "Marley", "diego50@ciao.it", "4567778");
		Customer c3 = new Customer("Paolo", "Bighi", "paolo10@ita.it", "789034");

		Product p1 = new Product("Mario", 35, 22 );
		Product p2 = new Product("Diego", 40, 22);
		Product p3 = new Product("Paolo", 15, 22 );

		productService.save(p1);
		productService.save(p2);
		productService.save(p3);

	    customerService.save(c1);
		customerService.save(c2);
		customerService.save(c3);
	}
}

/* 
		List<Customer> customers = customerService.findAll();
		customers.forEach(System.out::println);
		System.out.println("-----------------------------------------------------------");

		Optional<Customer> optCustId1=customerService.findById(1);

		if (optCustId1.isEmpty()) {

			System.out.println("Customer not found");
			return;
		}

		Customer custId1 = optCustId1.get();
		customerService.delete(custId1);

		customers = customerService.findAll();
		customers.forEach(System.out::println);
		System.out.println("-----------------------------------------------------------");
*/	


		


