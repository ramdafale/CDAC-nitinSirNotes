public class NativeUser
{
	public static void main(String args[])
	{
		NativeDemo n=new NativeDemo();
		System.out.println(n.callGreet1());
		NativeDemo.greet2();
		System.out.println(n.greet3());

	}
}		