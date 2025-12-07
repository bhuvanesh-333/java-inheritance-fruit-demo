package myjava;

class a{
	void apple() {
		System.out.println("red colour");
	}
	
}
class b extends a{
	void orange() {
		System.out.println("orange colur");
	}
}

class c extends b{
	void mango() {
		System.out.println("yellow colour");
	}
}

public class Bhuvi {
public static void main(String[] args) {

	 c obj = new c(); 

     
     obj.apple();   
     obj.orange();  
     obj.mango();   
}}

