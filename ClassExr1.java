package oop;

public class ClassExr1 {
	   private String name;
	   private int age;
	   private String address; // instance variable
	   //private double balance;
	   
	   public ClassExr1(String name,int age,String address) {
		   this.name=name;
		   this.age=age;
		   this.address=address;
		   //this.balance=balance;
	   }
	   
	 
	   // method to set the name in the object              
	   public void setName(String name) {
	      this.name = name; // store the name
	   }    

	   public void setAge(int age) {
	      this.age = age; // store the name
	   }        
	   public void setAddress(String address) {
	      this.address = address; // store the name
	   } 
	   //public void setBalance(double balance) {
		   //if (balance>0.0) {
			   //balance=balance+
		   //}
		      //this.balance = balance; // store the name
		   //}        


	   // method to retrieve the name from the object
	   public String getName() {
	      return name; // return value of name to caller        
	   }
	   public int getAge() {
	      return age; // return value of name to caller        
	   }
	   public String getAddress() {
	      return address; // return value of name to caller        
	   }  
	   
	   //public String getBalance() {
		      //return balance; // return value of name to caller        
		   //}  
	}
