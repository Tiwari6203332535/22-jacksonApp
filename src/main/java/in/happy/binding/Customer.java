package in.happy.binding;

import lombok.Data;

@Data
public class Customer {
	
	private Integer Id;
	private String name;
	private String email;
	private long phon;
	
	private Address addr;
	
}
