package modefiers;


public class M1 {
		
	static int a=10;
	int b=20;
	
	private void test(){
		
		int a=100;
		System.out.println(a);
		System.out.println(M1.a);
		System.out.println(this.a);
		
		System.out.println(b);// directly 
		System.out.println(this.b);
	}
	
	public static void main(String[] args) {
	
		M1 obj1=new M1();
		System.out.println(a);//directly
		System.out.println(M1.a);//class name
		System.out.println(obj1.a);//object ref
		
		
		System.out.println(obj1.b);
		
		obj1.test();
	}

}
