package in.happy.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JasonToJavaConverter {
	public static void main(String[] args) throws Exception {
		File F = new File("customer.json");
		ObjectMapper mapper = new ObjectMapper();
		
		//converting json to java
		Customer value = mapper.readValue(F, Customer.class);
		System.out.println(value);
		
	}

}
