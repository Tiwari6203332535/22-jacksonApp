package in.happy.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJasonConverter {
	public static void main(String[] args) throws Exception {
		Customer c = new Customer();
		Address  addr = new Address();
		addr.setCity("gorakhpur");
		addr.setCountry("india");
		addr.setState("UP");
		
		
		c.setId(101);
		c.setName("Happy");
		c.setEmail("tiwari95874@gmail.com");
		c.setPhon(06203332535);
		
	    c.setAddr(addr);
		
		ObjectMapper mapper = new ObjectMapper();
		
		//converting java to json
		mapper.writeValue(new File("customer.json"), c);
		System.out.println("Json file created");
	}

}
