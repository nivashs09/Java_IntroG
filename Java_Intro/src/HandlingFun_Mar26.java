  //static and non static 
public class HandlingFun_Mar26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main prog");
		dologin(3,5);
		dologin(32,4);
				}
	public static void dologin(int x, int y) {
		int z= x+y;
		System.out.println(z);
	}
	public void doprocess() {
		System.out.println("work to continue");
	}
	public static void dologout() {
		System.out.println("workdone logout");
	}
	
public void dowork() {
	System.out.println("login to the work");
}
}

/*

public class HandlingFun_Mar26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main prog");
		dologin(10,40);
		dologin(23,40);
		dologin(2,40);
		dologin(1,40);
		
	}
	public static void dologin(int x,int y){   //parameters, arg
		int z=x+y;
		System.out.println(z);
		
	}
	public static void doprocess(){
		System.out.println("some work");
		dologout();
	}
	public static void dologout(){
		System.out.println("logout func");
	}	

}
*/