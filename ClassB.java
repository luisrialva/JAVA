package work;

public class ClassB extends ClassA{

	int i = 6;
	public ClassB() {
		System.out.println("cont. without ");
		}
	public ClassB(String str) {
		System.out.println("String " + "str + from B" );
	}
		public void diff_vars(){
	  int i = 7;
			  System.out.println("super i=" + super. i + ", Global i=" + this.i +", local i="+i);
}}
