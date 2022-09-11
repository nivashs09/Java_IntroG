
public class Handling_Stringbase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main prog");
		dologin(10,40);
		dologin(23,40);
		//doprocess(20, 200, 20);
		dologout("nivash", "s");
		
	}
	public static void dologin(int x,int y){   //parameters, arg
		doprocess(5,5,5);
		int z=x+y;
		System.out.println(z);
		
	
	}
	public static void doprocess(int i, int j, int k){
		int l=i+j+k;
		System.out.println(l);
	}
	public static void dologout(String firstname, String lastname){
		String fullname = firstname+lastname;
		System.out.println(fullname);
		System.out.println("logout func");
	}	

}

/*What is method

It is a block, which contains collections of java program. We have two types 
of methods in java, predefined and userdefined method.

A single class can have any number of methods. We can able call a method 
from another method.

Methods are parallel to each other. Its should not get overlap.

A method can accept any number of parameters.

A method can return only one value.

JA method name should represent in the verbal formate.

st Method name should be unique.

when more than method contain same name but with different parameters, we call it as function overloading. 
A function can be static or non static.
The naming conversion */
