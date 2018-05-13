public class Third
{
	int num=10; // instance member
	public static void main(String args[])
	{
		int var=20; // local member
		//int var; 
		System.out.println(var);
		Third t1=new Third();
		System.out.println(t1.num);
		A ob=new A();
		System.out.println(ob.data);
	}
}
class A
{
	int data=300;
}