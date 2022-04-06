package com.pojo;

public class Employee {

	private String first_name;
	private String last_name;
	private String id;
	private String email;

//	 for serialization we nee getter method
	
	public String getFirst_name() {
		return first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public String getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}


	private Employee(String first_name, String last_name, String id, String email) {
		
		this.first_name = first_name;
		this.last_name = last_name;
		this.id = id;
		this.email = email;
	}
		
	public static EmployeeBuilder builder() {
		return new EmployeeBuilder() ;
	}
	
	
	public static class EmployeeBuilder{
		
		private String first_name;
		private String last_name;
		private String id;
		private String email;
			
		public Employee build() {
			return new Employee(first_name, last_name, id, email) ;
		}
		
		public EmployeeBuilder setFirst_name(String first_name) {
			this.first_name = first_name;
			return this;
		}
		
		public EmployeeBuilder setLast_name(String last_name) {
			this.last_name = last_name;
			return this;
		}
		
		public EmployeeBuilder setId(String id) {
			this.id = id;
			return this;
		}
		
		public EmployeeBuilder setEmail(String email) {
			this.email = email;
			return this;
		}
		
	}



	
}
