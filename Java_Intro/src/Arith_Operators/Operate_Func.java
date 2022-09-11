package Arith_Operators;

/* public class Operate_Func {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dorajini();
		doajith();
		simbu();
		vijay();

	}
	public static void dorajini() {
		System.out.println("style");
		doajith();
		simbu();
		vijay();
	}
	public static void doajith() {
		System.out.println("ultimate");
		dorajini();
		simbu();
		vijay();
	}
	public void simbu() {
		System.out.println("mass");
		doajith();
		simbu();
		vijay();
	}
	public void vijay() {
		System.out.println("dance");
		doajith();
		simbu();
		vijay();
	}
	
	}   */

/* STATIC and NON STATIC vIA MAIN METHOD*/
public class Operate_Func {
int x=10;
static int a= 14;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
		Operate_Func niv = new Operate_Func();
		System.out.println(niv.x);
		dorajini();
		doajith();
	}
	public static void dorajini() {
		System.out.println("style");
		System.out.println(a);
		
	}
	public static void doajith() {
		System.out.println("ultimate");
		System.out.println(a);
		dorajini();
		
	}
	public void simbu() {
		System.out.println("mass");
		System.out.println(a);
		doajith();
		simbu();
		vijay();
	}
	public void vijay() {
		System.out.println("dance");
		System.out.println(a);
		doajith();
		simbu();
		vijay();
	}
	
	}
	
