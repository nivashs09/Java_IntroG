package Arith_Operators;

public class Java_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=20;
		int y=10;        // int z=x+y; operator is + (arithmetic)
				
		System.out.println(x<y);  // Relation oper will come in boolean output (T or F)
		System.out.println(x>y);
		System.out.println(x<=y);
		System.out.println(x>=y);
		int a=600;
		int b=500;
		int c=300;
		
		if(a<b||a<c) {  //one cond is satisf is OR oper and both cond is and
			// | check both and || check the first cond and execute
			System.out.println("a is greater");
		}
		else {
			System.out.println("a is not greater");
		}
		int m=12;   // assignment oper which is =
		if(m==13) {
			System.out.println("m is 12");
		}
		else {
			System.out.println("its not m=12");
		}
		int f = 5;
		int g = 7;
		int h = f+g;
		System.out.println(h);
		String i = "skoda";
		String j = "Tata";
		String k=i+j;   // string to string concatenate (+) 
		System.out.println(k);
		int l=10;
		l++;   // increment opera and value is 11
		l--;
		l=l+2;  // l is 12
		
		// ? instead of if  and : instead of is else and this is called Ternary oper
		
	}
	


}
