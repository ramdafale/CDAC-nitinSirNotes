public class NativeDemo
{
	private native String greet1();
	public native static void greet2();
	public native String greet3();

	public String callGreet1()
	{
		return greet1();
	}
	static
	{
		System.loadLibrary("mypro");
	}
}