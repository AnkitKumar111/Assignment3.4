/* program to display the use of Static Variables and Methods in java*/
public class staticDemo {	
	 int rollno;  //instance variable
     String name;  //instance variable
     static String college = "GLA";  //static variable  
  
     //parameterized constructor with 2 arguments
     staticDemo(int r, String n){  
     rollno = r;  
     name = n;  
     }  
     
     void show (){
    	 System.out.println(rollno+" "+name+" "+college);
    	 }
     
   //static method
     static void change(){  
     college = "NAVYUG";  
     }
  
     void display (){
    	 System.out.println(rollno+" "+name+" "+college);
    	 }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating object and calling non-static method
		staticDemo s1 = new staticDemo(111,"ankit"); 
		s1.show();  
		
		//calling static method without the help of any object
		staticDemo.change();
		
		//creating object and calling non-static method after the invocation of static method
		staticDemo s2 = new staticDemo(222,"mayank");
		staticDemo s3 = new staticDemo (333,"ravi");  
		 s2.display();
		 s3.display();
	}
}
/*
The static variable gets memory only once in class area at the time of class loading.

A static method belongs to the class rather than object of a class.
A static method can be invoked without the need for creating an instance of a class.
static method can access static data member and can change the value of it.
*/
